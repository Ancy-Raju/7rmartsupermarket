package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	@FindBy(xpath="//p[text()='Manage News']")WebElement managenews;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']") WebElement news;
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	 public ManageNewsPage(WebDriver driver) {
		 
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	
	}
	public void clickOnManageNewsButton() 
	{
		managenews.click();
	}
	public void clickOnNewButton()
	{
		newbutton.click();
	}
	public void addnews(String newnews)
	{
		news.sendKeys(newnews);
	}
	public void clickOnSaveButton()
	{
		save.click();
		
	}
	
	

	

}
