package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginWithInCorrectEmailAndPasswordStep {
    @And("Verify {string} is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertEquals(new HomePage().iVerifyLoginToYourAccountLinkIsVisible(), "Login to your account");
    }

    @And("I enter incorrect email address {string}")
    public void iEnterIncorrectEmailAddressHoneyblogGmailCom(String email) {
        new LoginPage().enterEmailAddress(email);
    }

    @And("I enter incorrect password {string}")
    public void iEnterIncorrectPasswordNik(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("I should able to see error {string} is visible")
    public void iShouldAbleToSeeErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new LoginPage().getErrorMsgEmailAndPasswordIncorrect(), "Your email or password is incorrect!");
    }
}
