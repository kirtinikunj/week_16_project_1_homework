Feature: Login with incorrect Email and Password

  Scenario: I should not able to login with incorrect Email and Password and able to see error message
  When  I click on 'Signup / Login' button
  And Verify 'Login to your account' is visible
  And I enter incorrect email address 'honeyblog567@gmail.com'
  And I enter incorrect password 'nik567'
  And I Click 'login' button
  Then I should able to see error 'Your email or password is incorrect!' is visible