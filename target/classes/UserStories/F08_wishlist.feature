@regression
@smoke

Feature: user could add products to wishList

  Scenario: success message is visible after adding product to wishlist

    When user add product to wishlist
    Then wishlist notification success is visible