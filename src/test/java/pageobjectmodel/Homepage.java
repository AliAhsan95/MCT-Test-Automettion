package pageobjectmodel;

import org.openqa.selenium.WebDriver;

public class Homepage extends Parentpage {

	//// All The properties of home page with id and xpath
	String loginlink = "dLabellogin";
	String loginbutton = "jqLogin";
	String signupbutton = "jqSignup";
	String profiledropdownbutton = "drp_div";
	String logoutlink = "//i[@class='fa fa-sign-out']//parent::a";
	String usernamefield = "username";
	String passwordfield = "password";
	String emptyusernamefielderror = "name_error";
	String emptypasswordfielderror = "password_error";
	String getprofilenametext = "//button[@id='dLabel']/span";
	String myaccountlink = "//a[text()[normalize-space(.)=\"My Account\"]]";
	String getinvaliderrortext = "//div[@class='text_information errormsg']";

	/// implementing construct
	public Homepage(WebDriver driver) {
		super(driver);
	}

	//// All Click Method //////

	public void Clickloginlink() {
		// TODO Auto-generated method stub
		// browserhome.findElement(By.id("dLabellogin")).click();
		ClickWebElementById(loginlink);
	}

	public void ClickloginButton() {
		// TODO Auto-generated method stub
		ClickWebElementById(loginbutton);

	}

	public void ClickSignUpButton() {
		ClickWebElementById(signupbutton);

	}

	public void ClickProfileDropdownButton() {

		// TODO Auto-generated method stub
		ClickWebElementById(profiledropdownbutton);

	}
	public void ClickMyAccountLink() {
		// TODO Auto-generated method stub
		
		ClickWebElementByXpath(myaccountlink);
	}

	public void ClickLogOutLink() {
		// TODO Auto-generated method stub
		ClickWebElementByXpath(logoutlink);
	}
	////Enter Value Method

	public void EnterUserName(String elementValue) {

		EnterValueOnWebElementById(usernamefield, elementValue);

	}

	public void EnterPassword(String elementValue) {
		// TODO Auto-generated method stub
		EnterValueOnWebElementById(passwordfield, elementValue);

	}
////All Get Method
	public String GetActualProfileName() {

		// return GetTextFromWebElementById(getprofilenametext);

		return GetTextFromWebElementByXpath(getprofilenametext);

	}

	public String GetActualEmptyUserNameFieldError() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementById(emptyusernamefielderror);
	}

	public String GetActualEmptyPasswowrdFieldError() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementById(emptypasswordfielderror);
	}

	public void ClearUserNameField() {
		ClearWebElementFieldById(usernamefield);

	}

	public String GetActuaInvalidlErrorText() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementByXpath(getinvaliderrortext);

		/// browserparent.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[2]")).getText().toLowerCase();

	}

	 

	
}
