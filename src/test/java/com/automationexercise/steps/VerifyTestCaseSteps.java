package com.automationexercise.steps;

import com.automationexercise.pages.VerifyTestCasesPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class VerifyTestCaseSteps {
    @When("I click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new VerifyTestCasesPages().clickOnTestCasesButton();
    }

    @Then("I verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        driver.navigate().to("https://automationexercise.com/test_cases");
    }
}
