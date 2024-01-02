Feature: Verify Subscription in Home Page

  Scenario: I should able to Subscribe
    When I scroll down to footer
  And I can see text 'SUBSCRIPTION'
  And I enter email address 'honeyblogs567@gmail.com' in input
  And I click arrow button
  Then I can see success message 'You have been successfully subscribed!' is visible