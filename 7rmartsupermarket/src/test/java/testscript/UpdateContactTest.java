package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UpadateContactPage;
import utilities.ExcelUtility;

public class UpdateContactTest extends Base {
	@Test
	public void UploadContact() throws IOException
	
	{
		String usernamevalue = ExcelUtility.getStringData(1, 0,"Login Page");
		String passwordvalue = ExcelUtility.getStringData(1, 1,"Login Page");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signIn();
		UpadateContactPage updatecontact = new UpadateContactPage(driver);
		updatecontact.clickOnManageContact();
		updatecontact.clickOnActionButton();
		int phno = ExcelUtility.getIntegerData(1, 0,"updatepage");
		updatecontact.phone(phno);
		String emailid = ExcelUtility.getStringData(1, 1,"updatepage");
		updatecontact.email(emailid);
		String addre = ExcelUtility.getStringData(1, 2,"updatepage");
		updatecontact.address(addre);
		int time= ExcelUtility.getIntegerData(1, 3,"updatepage");
		updatecontact.deliverytime(time);
		int charge = ExcelUtility.getIntegerData(1, 4,"updatepage");
		updatecontact.deliverycharge(charge);
		updatecontact.update();
	
	}

}
