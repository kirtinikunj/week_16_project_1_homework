package com.automationexercise.steps;

import com.automationexercise.pages.SearchProductPage;
import com.automationexercise.pages.VerifyAllProductAndProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SearchProductSteps {
    @And("I should navigated to {string} page successfully")
    public void iShouldNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductPriceText(),  "ALL PRODUCTS");
    }

    @And("I enter product name {string} in search input")
    public void iEnterProductNameSareeInSearchInput(String saree) {
        new SearchProductPage().enterProductNameOnSearchLabel(saree);
    }

    @And("I click search button")
    public void iClickSearchButton() {
        new SearchProductPage().clickOnSearchButton();
    }

    @Then("I can see all the products related to search are visible")
    public void iCanSeeAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertEquals(new SearchProductPage().getSearchedProductsText(),  "SEARCHED PRODUCTS");
    }
}
