Feature: Testing Database

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully

  Scenario: States testing with JDBC
    Given Navigate to States page
    When Send query "select * from country"
    Then Check if they match with UI