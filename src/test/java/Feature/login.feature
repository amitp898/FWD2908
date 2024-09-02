Feature: Login Functionality for AutomationExercise E-commerce Website

  Background:
    Given I am on the AutomationExercise login page

  Scenario Outline: Successful login with valid credentials
    Given I have entered valid "<username>" and "<password>"
    When I click on the login button
    Then I should be logged in successfully

    Examples:
      | username                 | password  |
      | amitpatnaik008@gmail.com | Test@1234 |


  Scenario Outline: Unsuccessful login with invalid credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples:
      | username          | password        | error_message                        |
      | invalid@email.com | invalidPassword | Your email or password is incorrect! |


