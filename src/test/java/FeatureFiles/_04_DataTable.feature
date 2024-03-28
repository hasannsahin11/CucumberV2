Feature: Data Table Usage

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | Ghost         |
      | Cat           |
      | 922 Meow Ave. |
      | 45078228      |
    Then Save the form

  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
      | Ghost         |
      | Cat           |
      | 922 Meow Ave. |
      | 45078228      |
    And Enter valid information
      | Name      | Ghost         |
      | Last Name | Cat           |
      | Address   | 920 Meow Ave. |
      | Phone     | 1346547623    |
    Then Save the form

#    Scenario outline runs the entire scenario for each set of data
#      Data table sends the entire data to only one step at the the same time
#      and runs the scenario once