Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully

  @SmokeTest
  Scenario: Create Country
    And Navigate to Country Page
    When Create a new country
    Then Success message should be displayed

  @Regression
  Scenario: Delete Country
    And Navigate to Country Page
    When Search the country name
    And Click the delete button
    Then User should see the Country successfully deleted message

  Scenario:Create country with parameters
    When Navigate to Country Page
    When Enter country name as "Brazil" and code as "Ney9"
    And Click on Save button
    Then Success message should be displayed

  Scenario: Delete country with parameters
    When Navigate to Country Page
    When Search the country name as "Brazil" and code as "Ney9"
    And Click the delete button
    Then  User should see the Country successfully deleted message