package pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterSection extends Parentpage {

	public FooterSection(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// properties

	String gettoknowus = "//h1[contains(text(),'Get to know us')]//parent::div//a";
	String shopwithus = "//h1[contains(text(),'Shop with us')]//parent::div//a";
	String makemoneywithus = "//h1[contains(text(),'Make money with us')]//parent::div//a";

	// method

	/// Scroll Down
	public void GetScrollBar() {
		JavaWait(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Scroll Down
		jse.executeScript("window.scrollBy(0,1295);");

	}

	public List<String> GetToKnowUsOptionsFromUI() {

		List<String> resultList = new ArrayList<String>();
		List<WebElement> actualList = GetWebElementsByXpath(gettoknowus);
		for (int i = 0; i < actualList.size(); i++) {
			// System.out.println(actualList.get(i).getText());
			resultList.add(actualList.get(i).getText());
		}

		return resultList;
	}

	public List<String> GetShopWithUsOptionsFromUI() {
		// TODO Auto-generated method stub
		List<String> resultList = new ArrayList<String>();
		List<WebElement> actualList = GetWebElementsByXpath(shopwithus);
		for (int i = 0; i < actualList.size(); i++) {
			System.out.println(actualList.get(i).getText());
			resultList.add(actualList.get(i).getText());
		}

		return resultList;
	}

	public List<String> GetMakeMoneyWithUsFromUI() {
		// TODO Auto-generated method stub
		List<String> resultList = new ArrayList<String>();
		List<WebElement> actualList = GetWebElementsByXpath(makemoneywithus);
		for (int i = 0; i < actualList.size(); i++) {
			resultList.add(actualList.get(i).getText());

		}

		return resultList;
	}

}
