Feature: Create a new Account and Delete that Account

  Scenario: I should able to sign in
    When I click on login button
    And I can see 'New User SignUp!'
    And I enter name "Honey"
    And I enter email id "honeyblogs567@gmail.com"
    And I click on 'Signup' button
    Then I can verify that 'ENTER ACCOUNT INFORMATION' is visible

  Scenario: Fill in the detail
    When I click on title
    And I enter my name "Honey"
    And I enter my email address "honeyblogs567@gmail.com"
    And I enter my password "Nik567"
    And I enter my date of birth
    And I click on Select checkbox Sign up for our newsletter!
    Then I click on Select checkbox 'Receive special offers from our partners!

  Scenario: Fill in the address information
    When I enter first name "Honey"
    And I enter last name "Blogs"
    And I enter company detail "PrimeIt"
    And I enter first line of the address "Royal Pam Street"
    And I enter second line of the address "Rajkot"
    And I select country from drop down list "India"
    And I enter State "Gujrat"
    And I enter City "Rajkot"
    And I enter Zipcode "360045"
    And I enter Mobile number "6367605563"
    And I click on Create Account button
    And I can verify that 'ACCOUNT CREATED!' is visible
    And Click 'Continue' button
    And I can Verify that 'Logged in as Honey' is visible

  Scenario: I should able to delete account
    When I Click 'Delete Account' button
    And  I can Verify that 'ACCOUNT DELETED!' is visible
    And I click 'Continue' button