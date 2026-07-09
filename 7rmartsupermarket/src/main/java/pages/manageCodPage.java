package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageCodPage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/add-cod\" and @class='small-box-footer']")
	WebElement infocod;
	@FindBy(xpath = "//input[@value='yes']")
	WebElement radio;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public manageCodPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnInfoCod() {
		infocod.click();
	}

	public void clickOnyes() {
		if (radio.isSelected()) {
			System.out.println("Already selected");
		} else {
			radio.click();
		}
	}

	public void clickOnSaveButton() {
		save.click();
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();

	}
}
