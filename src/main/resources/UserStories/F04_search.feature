
@Smoke

Feature: User could search for any product

  Scenario: user could open site and search

    Given user navigate to home page
    And Search for "Apple phones"
    Then Click on SEARCH button
