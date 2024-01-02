Feature: Add product to cart from recomended items

  Scenario: I should Able to add recomended items to cart
    When I scroll to bottom of page
  And I verify 'RECOMMENDED ITEMS' are visible
  And I click on 'Add To Cart' on Recommended product
  And I click on 'View Cart' button
  Then I verify that product is displayed in cart page