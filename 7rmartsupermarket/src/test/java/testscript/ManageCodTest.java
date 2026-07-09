package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.manageCodPage;
import utilities.ExcelUtility;

public class ManageCodTest extends Base {
	@Test
	public void selectCod() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		manageCodPage cod = new manageCodPage(driver);
		cod.clickOnInfoCod();
		cod.clickOnyes();
		cod.clickOnSaveButton();
		boolean alert = cod.isAlertDisplayed();
		Assert.assertTrue(alert);
	}

}
