Feature: Register For Login
  Background:
    Given User Able to open Browser
    And Enter URL

   Scenario: Create a New User
     And Click on Register Link
     And Enter valid Email address and Password
     Then select valid clubcard option
     And Enter Personal details Title,First Name and Last Name and Mobile Number
     Then Enter Address
     And select Marketing Communication
     And Click on Create Account
     And also Register your account
    Then Close the Browser
