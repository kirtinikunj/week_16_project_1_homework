Feature: Verify Subscription in Cart Page

  Scenario: I should able to Subsribe sucessfully
    When 4. Click 'Cart' button
  And I scroll down to footer
  And I can see text SUBSCRIPTION
  And I enter email address honeyblogs567@gmail.com in input
  And I click arrow button
  Then I can see success messages 'You have been successfully subscribed!' is visible