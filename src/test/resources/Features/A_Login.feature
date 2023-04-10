Feature: Tesco Login Page
  Background:
    Given User must be open a browser
    And Enter url

    Scenario: Tesco Login Test
      Then  Click on Sign In Button
      And Enter Username And Password
      Then Click on Sign In Button
      And User is At Home Page
      Then User Close the Window
