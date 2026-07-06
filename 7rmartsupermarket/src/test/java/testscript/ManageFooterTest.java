package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base {
	@Test
	public void managefooter() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageFooterPage managefooter = new  ManageFooterPage(driver);
		managefooter.clickOnManageFooterText();
		managefooter.clickOnactionButton();
		String addr = ExcelUtility.getStringData(1, 0,"foot");
		managefooter.updateAddress(addr);
		managefooter.update();
	}

}
