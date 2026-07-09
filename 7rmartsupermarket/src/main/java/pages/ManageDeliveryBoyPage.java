package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	public WebDriver driver;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'  and @class='small-box-footer']")WebElement infoboy;
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='name']")WebElement name;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phoneno;
	@FindBy(xpath="//textarea[@id='address']")WebElement address;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void clickOnInfoBoy()
	{
		infoboy.click();
	}
	public void clickOnNewButton()
	{
		newbutton.click();
	}
	public void  enterName(String dname)
	{
		name.sendKeys(dname);
	}
	public void enterEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void enterPhoneno(int num)
	{
		phoneno.sendKeys(String.valueOf(num));
	}
	public void enteraddress(String addr)
	{
		address.sendKeys(addr);
	}
	public void enterUserName(String umane)
	{
		username.sendKeys(umane);
	}
	public void enterPassword(String pass)
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",password);
		password.sendKeys(pass);
		
	}
	public void clickSaveButton()
	{
		savebutton.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	
	
	

}
