@Search
Feature: Search Sample

  As a user I want to search my self in google.

  @TestListener
  Scenario Outline: Simple search
    Given Sel. I navigate to "<url>" with "<Browser>"
    And Search for "<searchFor>"
    And Sel. I navigate to "https://www.bing.com/"

    Examples:
      | url                    | searchFor | Browser |
      | https://www.google.com | Jose J    | Chrome    |

