package stepdefinationcode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjectmodel.Homepage;

public class CommonActionsStepCodes {

	StepCodesHelper helper;

	public CommonActionsStepCodes(StepCodesHelper helper) {
		this.helper = helper;
	}

	//// New Regular Expression Step code

	@Given("I enter {string} as {string}")
	public void i_enter_as(String elementName, String elementValue) {
		elementName = elementName.toLowerCase().trim();
		if (elementName.equals("User Name".toLowerCase())) {
			helper.GetHomepage().EnterUserName(elementValue);

		} else if (elementName.equals("password".toLowerCase())) {
			helper.GetHomepage().EnterPassword(elementValue);

		} else if (elementName.equals("seller User Name".toLowerCase())) {
			helper.GetSellerLoginPage().EnterUserName(elementValue);

		} else if (elementName.equals("seller Password".toLowerCase())) {
			helper.GetSellerLoginPage().EnterPassword(elementValue);

		}
	}

	@When("I click {string}")
	public void i_click(String elementName) {
		elementName = elementName.toLowerCase().trim();
		/// Member login page
		if (elementName.equals("Login Button".toLowerCase())) {
			helper.GetHomepage().ClickloginButton();
		} else if (elementName.equals("profile drop down button".toLowerCase())) {
			helper.GetHomepage().ClickProfileDropdownButton();
		} else if (elementName.equals("logout link".toLowerCase())) {
			helper.GetHomepage().ClickLogOutLink();
		} else if (elementName.equals("signup button".toLowerCase())) {
			helper.GetHomepage().ClickSignUpButton();
		}
		// Seller login page
		else if (elementName.equals("seller page login button".toLowerCase())) {
			helper.GetSellerLoginPage().ClickLoginButton();
		} else if (elementName.equals("seller page Logout Button".toLowerCase())) {
			helper.GetSellerLoginPage().ClickLogoutButton();
		}
		/// Click ok in popup alert widow
		else if (elementName.equals("ok button in pop up alert window".toLowerCase())) {
			helper.GetSellerLoginPage().ClickOkOnAlertwindow();
		}
		// My account Page
		else if (elementName.equals("my account link".toLowerCase())) {
			helper.GetHomepage().ClickMyAccountLink();
		}

	}

	@And("I click Login link")
	public void i_click_login_link() {

		helper.GetHomepage().Clickloginlink();
	}

	@Given("I clear  User Name")
	public void i_clear_user_name() {
		helper.GetHomepage().ClearUserNameField();
	}

}
