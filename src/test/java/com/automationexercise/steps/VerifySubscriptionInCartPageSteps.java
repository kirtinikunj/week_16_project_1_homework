package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifySubscriptionInHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifySubscriptionInCartPageSteps {
    @When(" Click {string} button")
    public void clickCartButton() {
        new HomePage().clickOnCartButton();
    }

    @And("I can see text SUBSCRIPTION")
    public void iCanSeeTextSUBSCRIPTION() {
        Assert.assertEquals(new VerifySubscriptionInHomePage().getTextSubscription(),  "SUBSCRIPTION");
    }

    @And("I enter email address honeyblogs{int}@gmail.com in input")
    public void iEnterEmailAddressHoneyblogsGmailComInInput(String email) {
        new VerifySubscriptionInHomePage().sendEmailAddress(email);
    }

    @Then("I can see success messages {string} is visible")
    public void iCanSeeSuccessMessagesYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new VerifySubscriptionInHomePage().getTextYouHaveBeenSuccessfullySubscribed(),  "You have been successfully subscribed!");
    }
}
