Feature: Remove products from cart

  Scenario: I should able to remove products from cart sucessfully
    When I add products to cart
  And I click 'Cart' button
  And I can see that cart page is displayed
  And I click 'X' button corresponding to particular product
  Then I can see that product is removed from the cart