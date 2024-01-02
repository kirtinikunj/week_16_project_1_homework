Feature: Verify Add Products In Cart

  Scenario: I should able to see prices, quantity and total price of product
    When  Click 'Products' button
    And I hover over first product
    And I click 'Add to cart'
    And I click Continue Shopping button
    And I hover over second product
    And I click 'Add to cart'
    And I click View Cart button
    And I can see both products are added to Cart
    Then I should see their prices, quantity and total price
