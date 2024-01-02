package com.automationexercise.steps;

import com.automationexercise.pages.EnterAccountInfoPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterUserSteps {
    @When("I click on login button")
    public void iClickOnLoginButton() {
    }

    @And("I can see {string}")
    public void iCanSeeNewUserSignnUp(String text) {
        Assert.assertEquals(new LoginPage().getNewUserSignupText(),text,"new user signup!");
    }

    @And("I enter name {string}")
    public void iEnterName(String firstName) {
        new LoginPage().enterFirstName(firstName);
    }

    @And("I enter email id {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().sendEmailAddress(email);

    }

    @And("I click on {string} button")
    public void iClickOnSignupButton() {
        new HomePage().clickOnSignupLoginLink();
    }

    @Then("I can verify that {string} is visible")
    public void iCanVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertEquals(new LoginPage().getNewUserSignupText(), "ENTER ACCOUNT INFORMATION");
    }

    @When("I click on title")
    public void iClickOnTitle() {
        new EnterAccountInfoPage().clickOnMrsRadioButton();
    }

    @And("I enter my name {string}")
    public void iEnterMyName(String firstName) {
        new EnterAccountInfoPage().enterFirstName(firstName);
    }

    @And("I enter my email address {string}")
    public void iEnterMyEmailAddress(String email) {
        new EnterAccountInfoPage().sendEmailAddress(email);
    }

    @And("I enter my password {string}")
    public void iEnterMyPassword(String password) {
        new EnterAccountInfoPage().enterPassword(password);
    }

    @And("I enter my date of birth")
    public void iEnterMyDateOfBirth() {

    }

    @And("I click on Select checkbox Sign up for our newsletter!")
    public void iClickOnSelectCheckboxSignUpForOurNewsletter() {
        new EnterAccountInfoPage().clickOnSignUpForOurNewsletterTickBox();
    }

    @Then("I click on Select checkbox 'Receive special offers from our partners!")
    public void iClickOnSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new EnterAccountInfoPage().clickOnReceiveSpecialOffersFromOurPartners();
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String fName) {
        new EnterAccountInfoPage().enterFirstName(fName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lName) {
        new EnterAccountInfoPage().enterLastNameUnderAddressInfo(lName);
    }

    @And("I enter company detail {string}")
    public void iEnterCompanyDetail(String companyName) {
        new EnterAccountInfoPage().enterCompanyNameUnderAddressInfo(companyName);
    }

    @And("I enter first line of the address {string}")
    public void iEnterFirstLineOfTheAddress(String addressLine1) {
        new EnterAccountInfoPage().enterFirstLineOfTheAddress1(addressLine1);
    }

    @And("I enter second line of the address {string}")
    public void iEnterSecondLineOfTheAddress(String addressLine2) {
        new EnterAccountInfoPage().enterSecondLineOfTheAddress(addressLine2);
    }

    @And("I select country from drop down list {string}")
    public void iSelectCountryFromDropDownList(String country) {
        new EnterAccountInfoPage().selectCountryUKFromList(country);
    }

    @And("I enter State {string}")
    public void iEnterState(String state) {
        new EnterAccountInfoPage().enterState(state);
    }

    @And("I enter City {string}")
    public void iEnterCity(String city) {
        new EnterAccountInfoPage().enterCity(city);
    }

    @And("I enter Zipcode {string}")
    public void iEnterZipcode(String zipCode) {
        new EnterAccountInfoPage().enterZipCode(zipCode);
    }

    @And("I enter Mobile number {string}")
    public void iEnterMobileNumber(String mobileNumber) {
        new EnterAccountInfoPage().enterMobileNumber(mobileNumber);
    }

    @Then("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new EnterAccountInfoPage().clickOnCreateAccount();
    }

    @And("Click {string} button")
    public void clickContinueButton() {
        new EnterAccountInfoPage().clickOnContinueButton();
    }

    @And("I can Verify that {string} is visible")
    public void iCanVerifyThatLoggedInAsUsernameIsVisible(String text1) {
        Assert.assertEquals(new LoginPage().verifyLoginAsUserName(),text1,"Logged in as Honey");
    }

    @When("I Click {string} button")
    public void iClickDeleteAccountButton() {
        new LoginPage().clickOnDeleteAccount();
    }

    @Then("I can Verify that {string} is visible and click {string} button")
    public void iCanVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String text2) {
        Assert.assertEquals(new LoginPage().verifyAccountDeleted(),text2,"ACCOUNT DELETED!");
    }

    @And("I click {string} button")
    public void iClickContinueButton() {
        new LoginPage().clickOnContinueButton();
    }
}
