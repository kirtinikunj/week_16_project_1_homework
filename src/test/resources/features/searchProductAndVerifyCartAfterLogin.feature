Feature: Search Product and verify cart

  Scenario: I should see those products in cart after login as well
    When I click on 'Products' button
  And I  navigate to ALL PRODUCTS page successfully
  And I enter product name in search input
  And I click on search button
  And I verify 'SEARCHED PRODUCTS' is visible
  And I verify all the products related to search are visible
  And I add those products to cart
  And I click on 'Cart' button
  And I can see that products are visible in cart
  And I click 'Signup' button and submit login details
  And Again, i go to Cart page
  Then I can see those products are visible in cart after login as well