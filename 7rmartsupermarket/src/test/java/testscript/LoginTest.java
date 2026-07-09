package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test (retryAnalyzer = retry.Retry.class, groups = { "Regression" })
	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		boolean homepage = loginpage.isDashBoardDisplay();
		Assert.assertTrue(homepage);
	}

	@Test
	public void verifyUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(2, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(2, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);

	}

	@Test
	public void verifyUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(3, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(3, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);

	}

	@Test
	public void verifyUserIsAbleToLoginWithInvalidCredentials() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(4, 0, "Login Page");
		String passwordvalue = ExcelUtility.getStringData(4, 1, "Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);

	}

}
