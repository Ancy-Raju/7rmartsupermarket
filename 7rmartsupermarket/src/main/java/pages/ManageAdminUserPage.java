package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageAdminUserPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminusers;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement  newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username ;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public ManageAdminUserPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnAdminUsers()
	{
		adminusers.click();
	}
	public void clickOnNewButton()
	{
		newbutton.click();
	}
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void enterUsertype(String type)
	{
		usertype.sendKeys(type);
		Select select = new Select(usertype);
		select.selectByVisibleText("Admin");
	}
	public void clickOnSaveButton()
	{
		save.click();
	}
	public boolean isAlertDisplayed() {
	
		return alert.isDisplayed();
		
	}

}
