package pages;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpadateContactPage {
	public WebDriver driver;
	@FindBy(xpath="//p[text()='Manage Contact']") WebElement managecontact;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']") WebElement action;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit']")WebElement deliverycharge;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	public UpadateContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

public void clickOnManageContact()
{
	managecontact.click();
}
public void clickOnActionButton()
{
	action.click();
}
public void phone(int num)
{
	phone.clear();
	phone.sendKeys(String.valueOf(num));
}
public void email(String emailid)
{
	email.clear();
	email.sendKeys(emailid);
}
public void address(String addr)
{
	address.clear();
	address.sendKeys(addr);
}
public void deliverytime(int time)
{
	deliverytime.clear();
	deliverytime.sendKeys(String.valueOf(time));
}
public void deliverycharge(int charge)
{
    deliverycharge.clear();
    deliverycharge.sendKeys(String.valueOf(charge));
}
public void update()
{
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,150)","");
	update.click();

}


}
