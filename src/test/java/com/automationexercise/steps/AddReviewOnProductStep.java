package com.automationexercise.steps;

import com.automationexercise.pages.AddReviewOnProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddReviewOnProductStep {


    @And("I can see {string} is visible")
    public void iCanSeeWriteYourReviewIsVisible() {
        Assert.assertEquals(new AddReviewOnProductPage().getWriteYourReviewText(),  "WRITE YOUR REVIEW");
    }

    @And("I enter name {string}, email {string} and review {string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) {
        new AddReviewOnProductPage().enterYourName(name);
        new AddReviewOnProductPage().enterYourEmail(email);
        new AddReviewOnProductPage().enterYourReview(review);
    }

    @Then("I can see success message {string}")
    public void iCanSeeSuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new AddReviewOnProductPage().getReviewText(),  "Thank you for your review.");
    }
}
