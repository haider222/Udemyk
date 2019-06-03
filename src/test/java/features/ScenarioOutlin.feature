Feature: Login to application with correct and wrong password
  Scenario Outline: login functionality, correct with multiple data
    Given as I user i am on correct web page
    When click on login button
    Then  users enter "<Username>" and "<password>"
    Examples:
      |Username   |password |
      |muhammad   |ilyas    |
      |haider     |afridi   |
      |kurram     |agency   |