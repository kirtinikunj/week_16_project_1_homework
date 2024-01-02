Feature: View category products

  Scenario: I should able to navigate to category page
    When I can see that categories are visible on left side bar
  And I click on 'Women' category
  And I click on any category link under 'Women' category, for example: Dress
  And I can see that category page is displayed
  And confirm text 'WOMEN - TOPS PRODUCTS'
  And  On left side bar, click on any sub-category link of 'Men' category
  Then I should able to  navigate to that category page