package com.automationexercise.steps;

import com.automationexercise.pages.LogOutUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogoutSteps {
    @And("I enter correct email address")
    public void iEnterCorrectEmailAddress(String email) {
        new LogOutUserPage().enterEmailAddress(email);
    }

    @And("I enter correct password")
    public void iEnterCorrectPassword(String password) {
        new LogOutUserPage().enterPassword(password);
    }

    @And("I click on login  button")
    public void iClickOnLoginButton() {
        new LogOutUserPage().clickOnLoginButton();
    }

    @And("I Verify that {string} is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertEquals(new LogOutUserPage().getTextLoggedInAsUserName(),"Logged in as Honey");
    }

    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        {
            new LogOutUserPage().clickOnLogOutLink();
        }
    }

    @Then("I should able to verify that user is navigated to login page")
    public void iShouldAbleToVerifyThatUserIsNavigatedToLoginPage() {
    }
}
