Feature: Fee Functionality

  Background: Login
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Fee Page

  Scenario:Create a Fee
    And Click on Add Fee Button
    And Fill the add fee form
      | BIATCH7 FrEE |
      | B7 FrEE      |
      | B7Fr         |
      | 7777         |
    When Click on Save & Close button
    Then Success message should be displayed

  Scenario: Delete Fee
    When Search for the Fee
      | BIATCH7 FrEE |
      | B7 FrEE      |
      | 7777         |
    And Delete the Fee
    Then  Success message should be displayed
