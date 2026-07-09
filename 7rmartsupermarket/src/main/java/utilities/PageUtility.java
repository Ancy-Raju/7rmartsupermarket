package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropDownVisibleText(WebElement elementname, String visibletext) {
		Select select = new Select(elementname);
		select.selectByVisibleText(visibletext);
	}

	public void dropDownValue(WebElement elementname, String value) {
		Select select = new Select(elementname);
		select.deselectByValue(value);
	}

	public void dropDownIndex(WebElement elementname, int index) {
		Select select = new Select(elementname);
		select.deselectByIndex(index);
	}

	public void dragAndDrop(WebDriver driver, WebElement drag, WebElement drop) {
		Actions obj = new Actions(driver);
		obj.dragAndDrop(drag, drop).perform();
	}

	public void mouseHover(WebDriver driver, WebElement elementname) {
		Actions obj = new Actions(driver);
		obj.moveToElement(elementname).perform();
	}

	public void rightClick(WebDriver driver, WebElement elementname) {
		Actions obj = new Actions(driver);
		obj.contextClick(elementname).perform();

	}

	public void doubleClick(WebDriver driver, WebElement elementname) {
		Actions obj = new Actions(driver);
		obj.doubleClick(elementname).perform();
	}

	public void click(WebDriver driver, WebElement elementname) {
		Actions obj = new Actions(driver);
		obj.click(elementname).perform();
	}

	public void form(WebDriver driver, WebElement elementname, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", elementname, value);
		js.executeScript("argument[0].click();", elementname);
	}

	public void pagescroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

	}
}


