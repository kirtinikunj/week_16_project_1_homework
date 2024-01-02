package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.LoginWithValidCredentialsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginWithCorrectEmailPasswordSteps {
    @When("I enter correct email address {string}")
    public void iEnterCorrectEmailAddress(String email) {
        new LoginWithValidCredentialsPage().enterEmailAddress(email);
    }

    @And("I enter correct password {string}")
    public void iEnterCorrectPassword(String password) {
        new LoginWithValidCredentialsPage().enterPassword(password);
    }

    @And("Verify that {string} is visible")
    public void verifyThatACCOUNTDELETEDIsVisible(String text) {
        Assert.assertEquals(new LoginPage().verifyAccountDeleted(),text,"ACCOUNT DELETED!");
    }
}
