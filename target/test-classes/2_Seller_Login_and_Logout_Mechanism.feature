Feature: Seller Login and Logout Mechanism

  Background: 
    Given I open my "chrome" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/sellers/login.php?from=logout"

  Scenario: Successfully Login for seller with Valid credentials.
    And I enter "seller User Name" as "seller"
    And I enter "seller Password" as "seller"
    When I click "seller page login button"
    Then I expect "seller profile name" text as "SELLER"

  Scenario: Successfully Login and logout for seller with Valid credentials.
    And I enter "seller User Name" as "seller"
    And I enter "seller Password" as "seller"
    When I click "seller page login button"
    Then I expect "seller profile name" text as "SELLER"
    When I click "seller page Logout Button"
    Then I land on "seller login page" and expect title text  as "Seller login"

  Scenario: Login for seller invalid credentials
    And I enter "seller User Name" as "Invalid"
    And I enter "seller Password" as "Invalid"
    When I click "seller page login button"
    Then I expect invalid input error text as "The username you provided is incorrect. Please check it and try again"

  Scenario: Login for seller invalid user name valid password
    And I enter "seller User Name" as "Invalid"
    And I enter "seller Password" as "seller"
    When I click "seller page login button"
    Then I expect invalid input error text as "The username you provided is incorrect. Please check it and try again"

  Scenario: Login for seller invalid password valid user name
    And I enter "seller User Name" as "seller"
    And I enter "seller Password" as "Invalid"
    When I click "seller page login button"
    Then I expect invalid input error text as "The password you provided is incorrect. Please check it and try again"

  Scenario: Login for seller with both field empty
    And I enter "seller User Name" as ""
    And I enter "seller Password" as ""
    When I click "seller page login button"
    Then I expect seller page popup aletr window with  text as "User Name  is a required field !!"
    And I click "ok button in pop up alert window"

  Scenario: Login for seller with user name field empty
    And I enter "seller User Name" as ""
    And I enter "seller Password" as "seller"
    When I click "seller page login button"
    Then I expect seller page popup aletr window with  text as "User Name  is a required field !!"
    And I click "ok button in pop up alert window"

  Scenario: Login for seller with password field empty
    And I enter "seller User Name" as "seller"
    And I enter "seller Password" as ""
    When I click "seller page login button"
    Then I expect seller page popup aletr window with  text as "Password  is a required field !!"
    And I click "ok button in pop up alert window"
