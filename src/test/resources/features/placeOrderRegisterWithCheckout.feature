Feature: Verify place an order while checkout

  Scenario: I should able to plave an order
    When I add products to cart
    And I click Cart button
    And I can see that cart page is displayed
    And I click Proceed To Checkout
    And I click Register button
    And I fill all details in Signup
    And I create account name "Honey"
    And I enter email "honeyblogs567@gmail.com"
    And I enter password "Nik567"
    And I enter first name "honey"
    And I enter last name "Blogs"
    And I enter address "Royal pam street"
    And I enter country "India"
    And I enter state "Gujrat"
    And I enter city "Rajkot"
    And I enter postcode "360045"
    And I enter mobile number "6367605563"
    And I click on Create Account button
  And I can see 'ACCOUNT CREATED!'
  And I click 'Continue' button
  And I can see 'Logged in as username' at top
  And I click 'Cart' button
  And I click 'Proceed To Checkout' button
  And I can see Address Details and Review Your Order
  And I enter description in comment text area "Thank you"
  And I click 'Place Order'
  And I enter payment details: Name on Card "Honey", Card Number"6767 8776 4355 6907", CVC "567", Expiration date "10","2027"
  And I click 'Pay and Confirm Order' button
  And I verify success message 'Your order has been placed successfully!'
  And I click 'Delete Account' button
  Then I can see 'ACCOUNT DELETED!' and click 'Continue' button