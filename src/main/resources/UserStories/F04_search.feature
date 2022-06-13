
@smoke

Feature: User could search for any product
# FIRST Scenario:
  Scenario: user could open site and search

    Given user navigate to home page
    And Search for "Iphone 7s"
    Then Click on SEARCH button

  # SECOND Scenario:

  Scenario: user could open site and search

    Given user navigates to home page
    And user Search for "SKU"
    Then Click on SEARCH
