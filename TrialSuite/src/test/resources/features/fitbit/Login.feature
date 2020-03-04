Feature: Login Test for Fitbit

  Scenario: Login into Fit bit
    Given I navigate to "Fitbit"
    And Login as "Admin"
    Then Welcome Msg is displayed.