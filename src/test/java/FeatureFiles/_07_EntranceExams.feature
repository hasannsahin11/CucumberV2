Feature: Entrance Exams

  Background:Login
    Given Navigate to Campus
    When Enter valid credentials
    And Click on Login Button
    Then User should login successfully


  Scenario Outline: Create an Entrance Exam
    Given Navigate to Entrance Exam Page
    And Click on Add Entrance Exams Button
    And Fill Out the form
      | <Exam Name> |
    And Create a Description
      | <Description> |
    And Create a Note
      | <Note> |
    When Click on Save button
    Then Success message should be displayed

    Examples:
      | Exam Name         | Description                  | Note    |
      | Cucumber Project1 | Testing 1st set with Outline | Project |
      | Cucumber Project2 | Testing 2nd set with Outline | Is      |
      | Cucumber Project3 | Testing 3rd set with Outline | Really  |
      | Cucumber Project4 | Testing 4th set with Outline | Super   |
      | Cucumber Project5 | Testing 5th set with Outline | Fun     |

  Scenario Outline: Delete an Entrance Exam
    Given Navigate to Entrance Exam Page
    And Enter Entrance Exam name into the Name input
      | <Exam Name> |
    And Click on the Search button
    When Click the delete button
    Then Success message should be displayed
    Examples:
      | Exam Name         | Description                  | Note    |
      | Cucumber Project1 | Testing 1st set with Outline | Project |
      | Cucumber Project2 | Testing 2nd set with Outline | Is      |
      | Cucumber Project3 | Testing 3rd set with Outline | Really  |
      | Cucumber Project4 | Testing 4th set with Outline | Super   |
      | Cucumber Project5 | Testing 5th set with Outline | Fun     |