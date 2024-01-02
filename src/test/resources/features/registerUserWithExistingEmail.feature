Feature: Register with Existing Email Address

  Scenario: I should not able to signup with existing email
  When I click on Signup button
  And Verify 'New User Signup!' is visible
  And I enter name 'Honey'
  And I enter already registered email address 'honeyblog567@gmail.com'
  And I click 'Signup' button
  Then I should able to Verify error 'Email Address already exist!' is visible