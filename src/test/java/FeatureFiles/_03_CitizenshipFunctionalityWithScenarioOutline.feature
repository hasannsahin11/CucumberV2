Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Citizenships page

    ##It just works like DataProvider from TestNG with a different syntax
  Scenario Outline: Create a Citizenship
    And Click on Add Button
    And Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
    When Click on Save button
    Then Citizenship successfully added message should be displayed

    Examples:
      | CitizenshipName | CitizenshipShortName |
      | ABD1            | AM1                  |
      | TUR1            | TR1                  |
      | USA1            | US1                  |
      | GER1            | DE1                  |

  Scenario Outline:Delete a Citizenship
    And Search for Citizenship with name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
    And Delete Citizenship
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | ABD1            | AM1                  |
      | TUR1            | TR1                  |
      | USA1            | US1                  |
      | GER1            | DE1                  |