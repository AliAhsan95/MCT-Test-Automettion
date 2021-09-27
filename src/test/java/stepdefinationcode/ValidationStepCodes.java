package stepdefinationcode;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pageobjectmodel.Parentpage;

public class ValidationStepCodes {
	StepCodesHelper helper;

	public ValidationStepCodes(StepCodesHelper helper) {
		this.helper = helper;

	}

	//// Homepage start
	/// Regular expression step code
	@Then("I expect {string} text as {string}")
	public void i_expect_text_as(String elementName, String expectedProfileName) {
		elementName = elementName.trim().toLowerCase();
		/// member home page profile
		if (elementName.equals("profile name".toLowerCase())) {
			String actualProfileName = helper.GetHomepage().GetActualProfileName();
			Assert.assertEquals("Faild to find the correct profile name", actualProfileName,
					expectedProfileName.toLowerCase());

		}
		/// Seller home page profile
		else if (elementName.equals("seller profile name".toLowerCase())) {
			String actualProfileName = helper.GetSellerLoginPage().GetActualProfileName();
			Assert.assertEquals("", actualProfileName, expectedProfileName.toLowerCase());

		}
		/// New User profile name || create account
		else if (elementName.equals("new user profile name".toLowerCase())) {
			if (expectedProfileName.contains("generateNew")) {
				expectedProfileName = expectedProfileName.replace("generateNew", Parentpage.randomlastname);

			}
			String actualProfileName = helper.GetHomepage().GetActualProfileName();
		}
	}

	@Then("I expect empty {string} error  text as {string}")
	public void i_expect_empty_error_text_as(String fieldName, String expectedEmptyFieldErrorText) {
		fieldName = fieldName.trim().toLowerCase();
		if (fieldName.equals("user name".trim().toLowerCase())) {
			String actualEmptyUserNameFieldError = helper.GetHomepage().GetActualEmptyUserNameFieldError();
			Assert.assertEquals(actualEmptyUserNameFieldError, expectedEmptyFieldErrorText.toLowerCase());

		} else if (fieldName.equals("paasword".trim().toLowerCase())) {
			String actualdEmptyPasswowrdFieldError = helper.GetHomepage().GetActualEmptyPasswowrdFieldError();
			Assert.assertEquals(actualdEmptyPasswowrdFieldError, expectedEmptyFieldErrorText.toLowerCase());

		}

	}

	@Then("I expect a input invalid error  text as {string}")
	public void i_expect_a_input_invalid_error_text_as(String expectedInvalidErrorText) {

		String actualInvalidErrorText = helper.GetHomepage().GetActuaInvalidlErrorText();
		Assert.assertEquals(actualInvalidErrorText, expectedInvalidErrorText.toLowerCase());

	}
	// Homepage End
	// seller login mechanism

	@Then("I expect invalid input error text as {string}")
	public void i_expect_invalid_input_error_text_as(String expectedInvalideError) {
		String acctualInvalidError = helper.GetSellerLoginPage().GetActualInvalidError();
		Assert.assertEquals(expectedInvalideError.toLowerCase(), acctualInvalidError);

	}

	// pop up alert
	@Then("I expect seller page popup aletr window with  text as {string}")
	public void i_expect_seller_page_popup_aletr_window_with_text_as(String expectedAlertText) {
		String actualAlertText = helper.GetSellerLoginPage().GetActualAlertText();
		Assert.assertEquals("alert", expectedAlertText.toLowerCase(), actualAlertText);
	}

	/// register account page

	@Then("I land on {string} and expect title text  as {string}")
	public void i_land_on_and_expect_title_text_as(String pageName, String expectedPageTitleText) {
		pageName = pageName.trim().toLowerCase();
		// Seller Login page
		if (pageName.equals("seller login page")) {
			String actualLoginPageTitleText = helper.GetSellerLoginPage().GetActualLoginPageTitleText();
			Assert.assertEquals(expectedPageTitleText.toLowerCase(), actualLoginPageTitleText);

		} /// Register Account Page
		else if (pageName.equals("register page")) {
			String actualTitleText = helper.GetRegAccountPage().GetActualRegisterTittleText();
			Assert.assertEquals(actualTitleText, expectedPageTitleText.toLowerCase());

		}

	}

	@Then("I expect {string} error text as {string}")
	public void i_expect_error_text_as(String errorType, String expectedErrorText) {
		errorType = errorType.trim().toLowerCase();
		if (errorType.equals("existing".trim().toLowerCase())) {
			String actualErrorText = helper.GetRegAccountPage().GetActualErrorText();
			Assert.assertEquals(expectedErrorText.toLowerCase(), actualErrorText.toLowerCase());
		} /// Empty Adress field
		else if (errorType.equals("empty adress".trim().toLowerCase())) {
			String actualErrorText = helper.GetRegAccountPage().GetActualErrorText();
			Assert.assertEquals(expectedErrorText.toLowerCase(), actualErrorText.toLowerCase());
		}
	}

	// pop up alert
	@Then("I expect popup aletr window with text as {string}")
	public void i_expect_popup_aletr_window_with_text_as(String expectedAlertText) {
		String actualAlertText = helper.GetSellerLoginPage().GetActualAlertText();
		Assert.assertEquals("alert", expectedAlertText.toLowerCase(), actualAlertText);
		//
		// helper.GetRegAccountPage().JavaWait(1000);
		// helper.GetBrowser().driver.quit();

	}

	/// My account

	@Then("I expect all my account options are available")
	public void i_expect_all_my_account_options_are_available(DataTable dataTable) {

		List<String> expectedMyAccountOptions = dataTable.asList(String.class);
		// for(int i=0;i<expectedOptions.size();i++) {
		// //System.out.println("exp option from gherkin (" + i +")" +
		// expectedOptions.get(i));
		// }

		//// Get the List of Option From UI - Selenium
		List<String> actualMyAccountOptions = helper.GetMyAccountPage().GetAllMyAccountOptionsFromUI();
		///// Compare 2 List
		Assert.assertEquals("List Not Matched !!", actualMyAccountOptions, expectedMyAccountOptions);

	}

	/// Footer
	@Then("I expect all Get to know us option links are displayed in footer")
	public void i_expect_all_get_to_know_us_option_links_are_displayed_in_(DataTable getToKnowUsDataTable) {
		List<String> expectedGetToKnowUsOptions = getToKnowUsDataTable.asList(String.class);
		//
		// Get text from webelements
		List<String> actualGetToKnowUsOptions = helper.GetFooterSection().GetToKnowUsOptionsFromUI();
		// Compare both table
		Assert.assertEquals(expectedGetToKnowUsOptions, actualGetToKnowUsOptions);

	}

	@Then("I expect all Shop with us option links are displayed in footer")
	public void i_expect_all_shop_with_us_option_links_are_displayed_in_footer(DataTable shopWithUsDataTable) {
		List<String> expectedShopWithUsOptions = shopWithUsDataTable.asList(String.class);
		List<String> actualShopWithUsOptions = helper.GetFooterSection().GetShopWithUsOptionsFromUI();
		Assert.assertEquals(expectedShopWithUsOptions, actualShopWithUsOptions);

	}

	@Then("I expect all Make money with us option links are displayed in footer")
	public void i_expect_all_make_money_with_us_option_links_are_displayed_in_footer(
			DataTable makeMoneyWithUsDataTable) {
		List<String> expectedMakeMoneyWithUsOptions = makeMoneyWithUsDataTable.asList(String.class);
		List<String> actualMakeMoneyWithUsOptions = helper.GetFooterSection().GetMakeMoneyWithUsFromUI();
		Assert.assertEquals(expectedMakeMoneyWithUsOptions, actualMakeMoneyWithUsOptions);

	}

}
