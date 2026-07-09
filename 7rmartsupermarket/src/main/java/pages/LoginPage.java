package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String usernamevalue) {
		username.sendKeys(usernamevalue);
	}

	public void enterPassword(String passwordvalue) {
		password.sendKeys(passwordvalue);
	}

	public void signIn() {
		// WaitUtility obj = new WaitUtility();
		// obj.waitForElementToBeClickable(driver,signin);

		signin.click();
	}

	public boolean isDashBoardDisplay() {
		return dashboard.isDisplayed();
		

	}

	public boolean isAlertDisplayed() {

		return alert.isDisplayed();
		

	}

}
