Feature: Contact Us Functionality

  Scenario: I should able to submit my details
  When I click on Contact Us button
  And I Verify GET IN TOUCH is visible
  And I enter name in name field "Honey"
  And I enter email in emial field "honeyblogs567@gmail.com"
  And I write subject "Test"
  And I type message "Test001"
  And I Upload file
  And I Click Submit button
  And I click OK button
  And I Verify success message 'Success! Your details have been submitted successfully.' is visible
  Then I click 'Home' button and verify that landed to home page successfully