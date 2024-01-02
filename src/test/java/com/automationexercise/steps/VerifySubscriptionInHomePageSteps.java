package com.automationexercise.steps;

import com.automationexercise.pages.VerifySubscriptionInHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifySubscriptionInHomePageSteps {
    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
    }

    @And("I can see text {string}")
    public void iCanSeeTextSUBSCRIPTION() {
        Assert.assertEquals(new VerifySubscriptionInHomePage().getTextSubscription(),  "SUBSCRIPTION");
    }

    @And("I enter email address {string} in input")
    public void iEnterEmailAddressHoneyblogsGmailComInInput(String email) {
        new VerifySubscriptionInHomePage().sendEmailAddress(email);
    }

    @And("I click arrow button")
    public void iClickArrowButton() {
        new VerifySubscriptionInHomePage().clickOnSubscribeButton();
    }

    @Then("I can see success message {string} is visible")
    public void iCanSeeSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new VerifySubscriptionInHomePage().getTextYouHaveBeenSuccessfullySubscribed(),  "You have been successfully subscribed!");
    }
}
