package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsFromPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsSteps {
    @When("I click on Contact Us button")
    public void iClickOnContactUsButton() {
        new ContactUsFromPage().clickOnContactUsLink();
    }

    @And("I Verify GET IN TOUCH is visible")
    public void iVerifyGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactUsFromPage().getTextGetInTouch(),  "GET IN TOUCH");
    }

    @And("I enter name in name field {string}")
    public void iEnterNameInNameField(String name) {
        new ContactUsFromPage().enterYourName(name);
    }

    @And("I enter email in emial field {string}")
    public void iEnterEmailInEmialField(String email) {
        new ContactUsFromPage().enterEmailAddressInEmailField(email);
    }

    @And("I write subject {string}")
    public void iWriteSubject(String sub) {
        new ContactUsFromPage().enterSubjectInField(sub);
    }

    @And("I type message {string}")
    public void iTypeMessage(String message) {
        new ContactUsFromPage().enterMessageInField(message);
    }

    @And("I Upload file")
    public void iUploadFile() {
    }

    @And("I Click Submit button")
    public void iClickSubmitButton() {
        new ContactUsFromPage().clickOnSubmitButton();
    }

    @And("I click OK button")
    public void iClickOKButton() {
    }

    @And("I Verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(new ContactUsFromPage().getTextDetailsHaveBeenSubmittedSuccessfully(),  "Success! Your details have been submitted successfully.");
    }

    @Then("I click {string} button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        new ContactUsFromPage().clickOnHomeButton();
    }
}
