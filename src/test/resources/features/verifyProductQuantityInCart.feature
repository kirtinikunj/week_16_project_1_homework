Feature: Verify Product Quantity in Cart

  Scenario: I should able to see exact quantity in cart
    When I click 'View Product' for any product on home page
  And I can see product detail is opened
  And I increase quantity to 4
  And I click Add to cart button
  And I click View Cart button
  Then I can see that product is displayed in cart page with exact quantity