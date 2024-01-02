package com.automationexercise.steps;

import com.automationexercise.pages.AddToCartFromRecommendedItemsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddtoCartFromRecomendedItemSteps {
    @When("I scroll to bottom of page")
    public void iScrollToBottomOfPage() {
        Assert.assertEquals(new AddToCartFromRecommendedItemsPage().getRecommendedItemsText(),  "RECOMMENDED ITEMS");
    }

    @And("I verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible() {
    }

    @And("I click on {string} on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct() {
        new AddToCartFromRecommendedItemsPage().clickOnAddToCartFromRecommended();
    }

    @Then("I verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {
        Assert.assertEquals(new AddToCartFromRecommendedItemsPage().getShoppingCartText(),  "Shopping Cart");
    }
}
