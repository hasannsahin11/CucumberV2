Feature: Citizenship with ApachePOI


  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully
    Given Navigate to Citizenships page

  Scenario: Create a new Citizenship
    Then Create a citizenship by ApachePOI
