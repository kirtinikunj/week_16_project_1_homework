Feature: Background feature file for automation demo site

  Background: User should able to see home page sucessfuully
    Given  I launch Browser
    When I navigate to URL "http://automationexercise.com"
    Then I should able to visible Home Page successfully