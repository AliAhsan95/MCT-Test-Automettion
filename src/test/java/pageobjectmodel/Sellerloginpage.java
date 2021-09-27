package pageobjectmodel;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sellerloginpage extends Parentpage{


	public Sellerloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	String sellerusernamefield = "txtUserName";
	String sellerpasswordfield = "txtPassword";
	String loginbutton = "submit";
	String sellerprofilename = "//span[@class='header_user_btt']";
	String invalidinput = "//div[@class='text_information']";
	String loginpagetitletext ="//div[@class='registrationform_container']//child::h3";
	String logoutlink = "//a[@class='header_login_btt']";
	

	public void EnterUserName(String elementValue) {
		// TODO Auto-generated method stub
		EnterValueOnWebElementById(sellerusernamefield, elementValue);
		
	}



	public void EnterPassword(String elementValue) {
		// TODO Auto-generated method stub
		EnterValueOnWebElementById(sellerpasswordfield, elementValue);
		
	}



	public void ClickLoginButton() {
		// TODO Auto-generated method stub
		ClickWebElementByName(loginbutton);
		
	}



	public String GetActualProfileName() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementByXpath(sellerprofilename);
	}



	public String GetActualInvalidError() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementByXpath(invalidinput);
	}


///logout mechanism
	public void ClickLogoutButton() {
		// TODO Auto-generated method stub
		ClickWebElementByXpath(logoutlink);
		
	}



	public String GetActualLoginPageTitleText() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementByXpath(loginpagetitletext);
	}

///pop up Alert

	public String GetActualAlertText() {
		// TODO Auto-generated method stub
		return GetTextFromAlertWindow();
	}



	public void ClickOkOnAlertwindow() {
		
		ClickAlertOkButton();
	}
	
	
	

}
