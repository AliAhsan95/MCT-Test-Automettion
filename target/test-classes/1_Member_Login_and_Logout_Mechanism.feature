Feature: Member login and logout Mechanism

  Background: 
    Given I open my "chrome" browser
    And I naviget to mct webpage url "https://www.demo.iscripts.com/multicart/demo/index.php"
    And I click Login link

  @sc01
  Scenario: Successfully Login for User with Valid credentials.
    And I enter "User Name" as "user"
    And I enter "Password" as "pass"
    When I click "Login button"
    Then I expect "profile name" text as "James Williams"
    
    
    #######Logout#####
    Scenario: Successfully Logout for a user
    And I enter "User Name" as "user"
    And I enter "Password" as "pass"
    When I click "Login button"
    And I click "profile drop down button"
    When I click "logout link"
    
    

  @sc02
  Scenario: Login  with kepping both field empty
    And I enter "User Name" as "abc"
    And I click "Login button"
    And I clear  User Name
    When I click "Login button"
    Then I expect empty "user name" error  text as "Enter username"
    And I expect empty "paasword" error  text as "Enter password"
    

  Scenario: Login  with kepping username field empty
    And I enter "User Name" as ""
    And I enter "Password" as "pass"
    When I click "Login button"
    Then I expect empty "user name" error  text as "Enter username"
   

  Scenario: Login  with kepping password field empty
    And I enter "User Name" as "user"
    And I enter "Password" as ""
    When I click "Login button"
    Then I expect empty "paasword" error  text as "Enter password"
    

  Scenario: Login  with invalid credentials.
     And I enter "User Name" as "Invalid"
    And I enter "Password" as "Invalid"
    When I click "Login button"
    Then I expect a input invalid error  text as "Invalid username or password. Try agian with correct details."
   

  Scenario: Login  with valid user name and wrong password.
    And I enter "User Name" as "user"
    And I enter "Password" as "Invalid"
    When I click "Login button"
    Then I expect a input invalid error  text as "Invalid username or password. Try agian with correct details."
    

  Scenario: Login  with invalid user name valid password.
    And I enter "User Name" as "Invalid"
    And I enter "Password" as "pass"
    When I click "Login button"
    Then I expect a input invalid error  text as "Invalid username or password. Try agian with correct details."
    