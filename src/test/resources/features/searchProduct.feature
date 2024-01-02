Feature: Search Product Functionality

  Scenario: I should able to search product
    When I click on Products button
  And I should navigated to 'ALL PRODUCTS' page successfully
  And I enter product name 'Saree' in search input
  And I click search button
  And I can see 'SEARCHED PRODUCTS'
  Then I can see all the products related to search are visible