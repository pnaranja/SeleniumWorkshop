Feature: Login

  Scenario: Login to the App
    Given I am on the Login screen
    When I submit the username and password and press login
    Then I should go to the HomePage