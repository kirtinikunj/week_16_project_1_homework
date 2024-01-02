Feature: Verify all products on Product page and it's detail

  Scenario: I should able to see products in detail
  When I click on Products button
  And I should navigated to ALL PRODUCTS page successfully
  And I can see products list
  And I click on 'View Product' of first product
  And I should landed to product detail page
  Then I should able to see detail : product name, category, price, availability, condition, brand