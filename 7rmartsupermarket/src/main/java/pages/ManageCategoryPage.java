package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategoryPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']")WebElement category;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement addcategory;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@name='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	public ManageCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnManageCategory()
	{
		category.click();
	}
	public void clickOnNewButton()
	{
		newbutton.click();
	}
	public void  addCategory(String cat)
	{
		addcategory.sendKeys(cat);
	}
	public void discount()
	{
		discount.click();
	}
	public void selectFile()
	{
		choosefile.sendKeys("C:\\Users\\jolly\\OneDrive\\Documents\\toothpate.jpg");
	}
	public void clickOnSaveButton()
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",save);
		
	}
	

}
