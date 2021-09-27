package pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountpage extends Parentpage {

	/// Constructor
	public MyAccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Properties of this page
	String myaccountoptions = "//div[@class='col-sm-12 col-lg-3 col-md-3']/a";

	//// All method /////
	public List<String> GetAllMyAccountOptionsFromUI() {
		List<String> resultList = new ArrayList<String>();
		List<WebElement> actualList = GetWebElementsByXpath(myaccountoptions);

		for (int i = 0; i < actualList.size(); i++) {
			// System.out.println(actualList.get(i).getText());
			resultList.add(actualList.get(i).getText());

		}
		return resultList;
	}

}
