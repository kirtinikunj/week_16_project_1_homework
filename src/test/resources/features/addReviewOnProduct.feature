Feature: Add review on product

  Scenario: I should able to review products
    When I click on 'Products' button
  And I can navigate to 'ALL PRODUCTS' page successfully
  And I click on 'View Product' button
  And I can see 'Write Your Review' is visible
  And I enter name "Honey", email "honeyblogs567@gmail.com" and review "Testing"
  And I click 'Submit' button
  Then I can see success message 'Thank you for your review.'