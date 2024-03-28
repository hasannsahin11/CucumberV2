Feature: Login Functionality

  @SmokeTest @Regression
  Scenario: Login with valid credentials
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully