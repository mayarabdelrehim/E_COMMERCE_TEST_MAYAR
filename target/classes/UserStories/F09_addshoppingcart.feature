
@smoke

Feature: user could add products to shopping cart

  Scenario: success message is visible after adding product to shopping cart

    When user add product to shopping cart
    Then shopping chart notification success is visible