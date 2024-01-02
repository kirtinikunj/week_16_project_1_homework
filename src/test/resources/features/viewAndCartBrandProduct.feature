Feature: View and cart brand products

  Scenario: I should navigate to brand page and can see products
    When I click on 'Products' button
  And I can see that Brands are visible on left side bar
  And I click on any brand name
  And I can see that user is navigated to brand page and brand products are displayed
  And  On left side bar, i click on any other brand link
  Then I should navigated to that brand page and can see products