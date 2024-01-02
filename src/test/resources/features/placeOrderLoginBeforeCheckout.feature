Feature: Place order login before checkout

  Scenario: I should able to place an order
    When I click 'Signup / Login' button
    And  I fill all details in Signup
    And I can see 'ACCOUNT CREATED!' and click 'Continue' button
    And I can see 'Logged in as username' at top
    And I add products to cart
    And I click 'Cart' button
    And I can see that cart page is displayed
    And I click Proceed To Checkout
    And I can see Address Details and Review Your Order
    And I enter description in comment text area "Thank you"
    And I click 'Place Order'
    And I enter payment details: Name on Card "Honey", Card Number"6767 8776 4355 6907", CVC "567", Expiration date "10","2027"
    And I click 'Pay and Confirm Order' button
    And I verify success message 'Your order has been placed successfully!'
    And I click 'Delete Account' button
    Then I can see 'ACCOUNT DELETED!' and click 'Continue' button