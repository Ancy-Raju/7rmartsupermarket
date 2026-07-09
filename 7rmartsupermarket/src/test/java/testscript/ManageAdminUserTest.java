package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageAdminUserPage;
import utilities.ExcelUtility;

public class ManageAdminUserTest  extends Base{
	@Test
	public void adminUser() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageAdminUserPage adminuser = new ManageAdminUserPage(driver);
		adminuser.clickOnAdminUsers();
		adminuser.clickOnNewButton();
		String usernameval = ExcelUtility.getStringData(1, 0,"adminuser");
		adminuser.enterUsername(usernameval);
		String pass= ExcelUtility.getStringData(1, 1,"adminuser");
		adminuser.enterPassword(pass);
		String type = ExcelUtility.getStringData(1, 2,"adminuser");
		adminuser.enterUsertype(type);
		adminuser.clickOnSaveButton();
		boolean alert = adminuser.isAlertDisplayed();
		Assert.assertTrue(alert);
		
		
	}

}
