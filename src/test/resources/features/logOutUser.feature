Feature: Logout user

  Scenario: I should able to logout
  When I click on 'Signup / Login' button
  And  Verify 'Login to your account' is visible
  And I enter correct email address
  And I enter correct password
  And I click on login  button
  And I Verify that 'Logged in as username' is visible
  And I click on logout button
  Then I should able to verify that user is navigated to login page