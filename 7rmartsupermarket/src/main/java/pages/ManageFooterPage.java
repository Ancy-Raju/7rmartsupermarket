package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageFooterPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement managefooter;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement  action ;
	@FindBy(xpath="//textarea[@id='content']")WebElement  address;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	public ManageFooterPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements (driver,this);
		
	
	}
	public void clickOnManageFooterText()
	{
		managefooter.click();
	}
	public void clickOnactionButton()
	{
		action.click();
	}
	public void updateAddress(String add)
	{
		address.clear();
		address.sendKeys(add);
	}
	public void update()
	{
		update.click();
	}

}
