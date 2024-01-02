Feature: Login with correct Email and Password

  Scenario: I sholud able to login with correct Email and Password
  When I enter correct email address "honeyblog567@gmail.com"
  And I enter correct password "Nik567"
  And I click 'login' button
  And I Click 'Delete Account' button
  And Verify that 'ACCOUNT DELETED!' is visible