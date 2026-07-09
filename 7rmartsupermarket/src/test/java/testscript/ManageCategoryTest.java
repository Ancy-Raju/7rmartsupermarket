package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	@Test
	public void manageCategory() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageCategoryPage category = new ManageCategoryPage(driver);
		FakerUtility faker = new FakerUtility();
		String cate = faker.generateCategory();
		category.clickOnManageCategory();
		category.clickOnNewButton();
		//String cate = ExcelUtility.getStringData(1, 0, "category");
		category.addCategory(cate);
		category.discount();
		category.choosefile();
		category.clickOnSaveButton();
		boolean alert = category.isAlertDisplayed();
		Assert.assertTrue(alert);
	}

}
