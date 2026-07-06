package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test
	public void verifyUserisAbleToLogoutSucessfullyFromTheDashboard() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		LogoutPage logoutpage =  new LogoutPage(driver);
		logoutpage.clickonAdminButton();
		logoutpage.Clickonlogoutbutton();
		
		
		
		
	}

}
