
@smoke

Feature: User could search for any product by NAME
# FIRST Scenario:
  Scenario: user could open site and search

    Given user navigate to home page
    And Search for "Iphone 7s"
    Then Click on SEARCH button

  # SECOND Scenario:


  Scenario: user can search for product by SKU
    When user navigates to homepage to search SKU
    And user clicks on sku search field in homepage
    Then sku search result appears on screen
