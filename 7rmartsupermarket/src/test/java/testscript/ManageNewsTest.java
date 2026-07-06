package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	@Test
	public void manageNews() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		ManageNewsPage news = new ManageNewsPage(driver);
		news.clickOnManageNewsButton();
		news.clickOnNewButton();
		String newnews=ExcelUtility.getStringData(1, 0,"news");
		news.addnews(newnews);
		news.clickOnSaveButton();
		
		}

}
