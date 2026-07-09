package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	WebElement managenews;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement news;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public ManageNewsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnmanageNews() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", managenews);

	}

	public void clickOnManageNewsButton() {
		managenews.click();
	}

	public void clickOnNewButton() {
		newbutton.click();
	}

	public void addnews(String newnews) {
		news.sendKeys(newnews);
	}

	public void clickOnSaveButton() {
		save.click();

	}

	public boolean isAlertDisplayed() {

		return alert.isDisplayed();

	}

}
