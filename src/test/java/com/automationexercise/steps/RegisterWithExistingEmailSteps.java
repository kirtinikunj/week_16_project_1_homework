package com.automationexercise.steps;

import com.automationexercise.pages.RegisterWithExistingEmailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterWithExistingEmailSteps {
    @When("I click on Signup button")
    public void iClickOnSignupButton() {
        new RegisterWithExistingEmailPage().iClickOnSignupLoginLink();
    }

    @And("I enter already registered email address {string}")
    public void iEnterAlreadyRegisteredEmailAddressHoneyblogGmailCom(String email) {
        new RegisterWithExistingEmailPage().sendEmailAddress(email);
    }

    @Then("I should able to Verify error {string} is visible")
    public void iShouldAbleToVerifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new RegisterWithExistingEmailPage().getErrorMsgTextEmailAddressAlreadyExist(), "Email Address already exist!");
    }
}
