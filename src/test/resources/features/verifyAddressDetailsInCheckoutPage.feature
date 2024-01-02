Feature: Verify adress detail in checkout page

  Scenario: I should able to verify address details
    When I click 'Signup / Login' button
    And  I fill all details in Signup
    And I can see 'ACCOUNT CREATED!' and click 'Continue' button
    And I can see 'Logged in as username' at top
    And I add products to cart
    And I click 'Cart' button
    And I can see that cart page is displayed
    And I click Proceed To Checkout
    And I can see Address Details and Review Your Order
    And I click 'Delete Account' button
    Then I can see 'ACCOUNT DELETED!' and click 'Continue' button