package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browsersfactory.Browsers;

public class Parentpage {
	WebDriver driver;

	public Parentpage(WebDriver driver) {
		this.driver = driver;

	}

	/// Global veriable
	public static String randomlastname;

	Browsers browser;
	static Alert alert;

	// Generic method for opening browsers
	public void OpenWebBrowser(String browserName) {
		browser = new Browsers();
		browser.OpenBrowser(browserName);
	}

	//// Generic methods for clicking webelements.

	public void ClickWebElementById(String locators) {
		JavaWait(500);
		WebElement element = driver.findElement(By.id(locators));
		HighlightElementBorder(element, "pass");
		element.click();

	}

	public void ClickWebElementByXpath(String locators) {
		driver.findElement(By.xpath(locators)).click();

	}

	public void ClickWebElementByName(String locators) {
		driver.findElement(By.name(locators)).click();

	}
	/// Generic method for entering value to webelements

	public void EnterValueOnWebElementById(String locators, String value) {
		JavaWait(500);
		WebElement element = driver.findElement(By.id(locators));
		HighlightElementBorderAndBackground(element, "pass");

		element.sendKeys(value);

	}

	public void EnterValueOnWebElementByXpath(String locators, String value) {
		JavaWait(500);
		WebElement element = driver.findElement(By.xpath(locators));
		HighlightElementBorderAndBackground(element, "pass");

		element.sendKeys(value);

	}

	/// Generic Method For Clearing Webelements Fields
	public void ClearWebElementFieldById(String locators) {
		driver.findElement(By.id(locators)).clear();
	}

	public void ClearWebElementFieldByXpath(String locators) {
		driver.findElement(By.xpath(locators)).clear();
	}

	// Generic methods to get text from webelements.

	public String GetTextFromWebElementById(String locators) {
		JavaWait(500);
		WebElement element = driver.findElement(By.id(locators));
		HighlightElementBorderAndBackground(element, "pass");
		return element.getText().toLowerCase();

	}

	public String GetTextFromWebElementByXpath(String locators) {
		JavaWait(1000);
		WebElement element = driver.findElement(By.xpath(locators));
		HighlightElementBorderAndBackground(element, "pass");

		return element.getText().toLowerCase();
	}

	public String GetTextFromWebElementByClass(String locators) {
		JavaWait(1000);
		return driver.findElement(By.className(locators)).getText().toLowerCase();
	}

	//// Generic method for getting Webelements Text
	public List<WebElement> GetWebElementsByXpath(String locators) {
JavaWait(500);


		return driver.findElements(By.xpath(locators));
	}

	// Generic method for pop up alert.
	public String GetTextFromAlertWindow() {
		JavaWait(1000);
		alert = driver.switchTo().alert();
		return driver.switchTo().alert().getText().toLowerCase();

	}

	public void ClickAlertOkButton() {

		alert.accept();
	}

	/// Generic Method for highlighting web elements borders and backgrounds

	public void HighlightElementBorder(WebElement element, String flag) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		if (flag.equalsIgnoreCase("pass")) {
			jse.executeScript("arguments[0].style.border='2px solid green'", element);
		} else {
			jse.executeScript("arguments[0].style.border='2px solid red'", element);
		}

	}

	public void HighlightElementBorderAndBackground(WebElement element, String flag) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		if (flag.equalsIgnoreCase("pass")) {
			jse.executeScript("arguments[0].setAttribute('style','border: 2px solid green; background:yellow ');",
					element);
		} else {
			jse.executeScript("arguments[0].setAttribute('style','border: 2px solid red; background:pink ');", element);
		}

	}

	public void HighlightElementBackground(WebElement element, String flag) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		if (flag.equalsIgnoreCase("pass")) {
			jse.executeScript("arguments[0].style.background='yellow'", element);
		} else {
			jse.executeScript("arguments[0].style.background='pink';", element);
		}

	}
	///Generel Method for higlight list
//	public void HighlightListElementBorderAndBackground(List<WebElement>element, String flag) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		if (flag.equalsIgnoreCase("pass")) {
//			jse.executeScript("arguments[0].setAttribute('style','border: 2px solid green; background:yellow ');",
//					element);
//		} else {
//			jse.executeScript("arguments[0].setAttribute('style','border: 2px solid red; background:pink ');", element);
//		}
//
//	}
	
	public void JavaWait(int mils) {
		try {
			Thread.sleep(mils);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

}
