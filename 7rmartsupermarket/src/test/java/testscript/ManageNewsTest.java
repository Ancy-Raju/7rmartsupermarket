package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test (retryAnalyzer = retry.Retry.class)
	public void manageNews() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageNewsPage news = new ManageNewsPage(driver);
		news.clickOnmanageNews();
		news.clickOnManageNewsButton();
		news.clickOnNewButton();
		String newnews=ExcelUtility.getStringData(1, 0,"news");
		news.addnews(newnews);
		news.clickOnSaveButton();
		boolean alert = news.isAlertDisplayed();
		Assert.assertTrue(alert);
		
		}

}
