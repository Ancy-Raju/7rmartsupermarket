package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base {
	@Test
	public void manageDeliveryBoy() throws IOException {
	
	String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
	String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signIn();
	ManageDeliveryBoyPage dboy = new ManageDeliveryBoyPage(driver);
	dboy.clickOnInfoBoy();
	dboy.clickOnNewButton();
	String dname = ExcelUtility.getStringData(1, 0,"boy");
	dboy.enterName(dname);
	String email = ExcelUtility.getStringData(1, 1,"boy");
	dboy.enterEmail(email);
	int phnono= ExcelUtility.getIntegerData(1, 2,"boy");
	dboy.enterPhoneno(phnono);
	String addr = ExcelUtility.getStringData(1, 3,"boy");
	dboy.enteraddress(addr);
	String umane = ExcelUtility.getStringData(1, 4,"boy");
	dboy.enterUserName(umane);
	String pass = ExcelUtility.getStringData(1, 5,"boy");
	dboy.enterPassword(pass);
	dboy.clickSaveButton();
	boolean alert = dboy.isAlertDisplayed();
	Assert.assertTrue(alert);
			
	}
}
