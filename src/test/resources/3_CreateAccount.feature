Feature: Create Account Mechanism

  Background: 
    Given I open my "chrome" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click Login link

  Scenario: Successfull land registration page
    When I click "signup button"
    Then I land on "register page" and expect title text  as "User Registration"

  Scenario: Successfully creation of a new user
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew"
  #####Then I expect "new user profile name" text as "Mr Hasan generateNew"
  
  ##Creating Account With Existing information
  Scenario: Creating account with the information of a exesting user
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "All Existing Information"
    Then I expect "existing" error text as "Please correct the following errors to continue!* User Name already exists!* The email address is already in use!."

  Scenario: Creating account with existing user email Id
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-existingUserEmail"
    Then I expect "existing" error text as "Please correct the following errors to continue!* The email address is already in use!."

  Scenario: Creating account with existing user email Id
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-existingUserName"
    Then I expect "existing" error text as "Please correct the following errors to continue!* User Name already exists!"

  ## Creating Account With Invalid Email
  Scenario: Creating account with Invaild email Id
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-InvalidEmail"
    Then I expect popup aletr window with text as "Invalid Email Address"
    And I click "ok button in pop up alert window"

  ##Create Account keeping empty  field
  Scenario: Creating account with all field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "" lastname "All Field Empty"
    Then I expect popup aletr window with text as "enter email address. "
    And I click "ok button in pop up alert window"

  Scenario: Creating account with Email Id field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-emptyEmailField"
    Then I expect popup aletr window with text as "enter email address. "
    And I click "ok button in pop up alert window"

  Scenario: Creating account with user name field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-emptyUserNameField"
    Then I expect popup aletr window with text as "Enter Username."
    And I click "ok button in pop up alert window"

  Scenario: Creating account with password field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-emptyPasswordField"
    Then I expect popup aletr window with text as "Enter Password."
    And I click "ok button in pop up alert window"

  Scenario: Creating account with Confirm password field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-emptyConfirmPasswordField"
    Then I expect popup aletr window with text as "Enter Confirm Password."
    And I click "ok button in pop up alert window"

  Scenario: Creating account with firstname field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "" lastname "generateNew"
    Then I expect popup aletr window with text as "Enter Firstname."
    And I click "ok button in pop up alert window"

  Scenario: Creating account with lastname field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-emptyLastNameField"
    Then I expect popup aletr window with text as "Enter Lastname."
    And I click "ok button in pop up alert window"

  Scenario: Creating account with adress field empty
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan " lastname "generateNew-emptyAdressField"
    Then I expect "empty adress" error text as "Please correct the following errors to continue!Address cannot be empty !"

  ##Creating Account With two different password in  password and confirm password field
  Scenario: Creating account with unmatched confirm password.
    And I click "signup button"
    When I complete the registration form for a new user firstname "Mr Hasan" lastname "generateNew-unmatchedConfirmPassword"
    Then I expect popup aletr window with text as "Confirm password does not match with the password"
    And I click "ok button in pop up alert window"
