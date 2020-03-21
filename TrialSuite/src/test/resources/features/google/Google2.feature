@Search
Feature: Search Parallel Test

  As a user I want to search my self in google.

  Scenario Outline: Simple search
    Given I navigate to "<url>" with "<Browser>"
    And Search for "<searchFor>"

    Examples:
      | url                    | searchFor | Browser |
      | https://www.google.com | Sofia     | chrome |