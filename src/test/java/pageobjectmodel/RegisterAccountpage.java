package pageobjectmodel;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class RegisterAccountpage extends Parentpage {

	String getregistertitletext = "items_top_area_ttl";
	String emailfield = "txtEmail";
	String usernamefield = "txtUserName";
	String passwordfield = "txtPassword";
	String confirmpasswordfield = "txtCnfPassword";
	String firstnamefield = "txtFirstName";
	String lastnamefield = "txtLastName";
	String getprofilename = "//button[@id='dLabel']//child::span";
	String createaccountbutton = "btnRegister";
	String errortext = "//div[@class=\"error\"]";
	String termsandconditionsfield = "//textarea[@name='custom_field_1']";
	String adressfield = "//input[@placeholder='Address *']";

	public RegisterAccountpage(WebDriver driver) {
		super(driver);

	}

	String email;
	String username;
	String password;
	String cpassword;
	// String firstname;
	String lastname;
	String adress;

	public void CreateAccountForNewUser(String firstName, String lastName) {
		lastName = lastName.trim().toLowerCase();

		if (lastName.contains("generateNew".trim().toLowerCase())) {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.ss").format(new Date());
			randomlastname = timeStamp;
			email = randomlastname + "@email.com";
			username = firstName + randomlastname;
			password = "password";
			cpassword = "password";
			lastname = randomlastname;
			adress = randomlastname;

		} ///All Existing Field
		else if (lastName.contains("All Existing Information".trim().toLowerCase())) {
			email = "example@email.com";
			username = "Mr Hasan example";
			password = "password";
			cpassword = "password";
			lastname = "example";
			adress = "31-10 37th Ave, Long Island";

		} ///All Empty Field
		else if (lastName.equals("All Field Empty".trim().toLowerCase())){
			email = "";
			username = "";
			password = "";
			cpassword = "";
			lastname = "";
			adress = "";
		}
		else {
			email = lastName + "@email.com";
			username = firstName + lastName;
			password = "password";
			cpassword = "password";
			lastname = lastName;
			adress = "31-10 37th Ave, Long Island";

		}
		/////////////Scecond perimiter
		
		////Existing information 
		if (lastName.contains("existingUserEmail".toLowerCase())) {
			email = "example@email.com";

		}else if(lastName.contains("existingUserName".toLowerCase())) {
			username = "Mr Hasan example";
		}
		////Invalid Email
		if (lastName.contains("InvalidEmail".toLowerCase())) {
			email ="Md Taher01@email.com";
			
		}
		///Empty Field
		if(lastName.contains("emptyEmailField".trim().toLowerCase())) {
			email="";
		}else if(lastName.contains("emptyUserNameField".trim().toLowerCase())) {
			username="";
		}else if(lastName.contains("emptyPasswordField".trim().toLowerCase())) {
			password="";
		}else if(lastName.contains("emptyConfirmPasswordField".trim().toLowerCase())) {
			cpassword="";
		}else if(lastName.contains("emptyLastNameField".trim().toLowerCase())) {
			lastname="";
		}else if(lastName.contains("emptyAdressField".trim().toLowerCase())) {
			adress="";
		}
		////Unmatched password and  Confirm Password
		if(lastName.contains("unmatchedConfirmPassword".trim().toLowerCase())) {
			cpassword="khckashc";
		}
		
		
		
		
		

		EnterValueOnWebElementById(emailfield, email);
		EnterValueOnWebElementById(usernamefield, username);
		EnterValueOnWebElementById(passwordfield, password);
		EnterValueOnWebElementById(confirmpasswordfield, cpassword);
		EnterValueOnWebElementById(firstnamefield, firstName);
		EnterValueOnWebElementById(lastnamefield, lastname);
		EnterValueOnWebElementByXpath(adressfield, adress);

	
		ClickWebElementById(createaccountbutton);

	}

	
	//
	// public String GetActualProfileName() {
	// //return GetTextFromWebElementById(getprofilename);
	// return GetTextFromWebElementByXpath(getprofilename);
	// }
	

	public String GetActualRegisterTittleText() {
		// TODO Auto-generated method stub
		return GetTextFromWebElementById(getregistertitletext);
		// browsercreateaccount.findElement(By.id("items_top_area_ttl")).getText().toLowerCase();
	}

	

	public String GetActualErrorText() {
		String actualErrorText = GetTextFromWebElementByXpath(errortext);

		actualErrorText = actualErrorText.replace("\n", "");
		actualErrorText = actualErrorText.trim();

		return actualErrorText;

	}
	//
	// public void EnterTermsAndConditions(String enterTermsAndConditions) {
	// // TODO Auto-generated method stub
	// EnterValueOnWebElementByXpath(termsandconditions, enterTermsAndConditions);
	// }
	//
	 public String GetActualAlertText() {
	 // TODO Auto-generated method stub
	 return GetTextFromAlertWindow();
	 }
	
	 public void ClickOkButton() {
	 ClickAlertOkButton();
	
	 }

}
