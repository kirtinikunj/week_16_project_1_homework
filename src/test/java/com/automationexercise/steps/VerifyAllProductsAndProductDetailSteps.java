package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.VerifyAllProductAndProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class VerifyAllProductsAndProductDetailSteps {
    @When("I click on Products button")
    public void iClickOnProductsButton() {
        new HomePage().clickOnProductsButton();
    }

    @And("I should navigated to ALL PRODUCTS page successfully")
    public void iShouldNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductPriceText(),  "ALL PRODUCTS");
    }

    @And("I can see products list")
    public void iCanSeeProductsList() {
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().verifyingAllProductsOnThePage(),  "ALL PRODUCTS");
    }

    @And("I click on {string} of first product")
    public void iClickOnViewProductOfFirstProduct() {
        new VerifyAllProductAndProductDetailPage().clickOnFirstProduct();
    }

    @And("I should landed to product detail page")
    public void iShouldLandedToProductDetailPage() {
        driver.navigate().to("https://automationexercise.com/product_details/1");
    }

    @Then("I should able to see detail : product name, category, price, availability, condition, brand")
    public void iShouldAbleToSeeDetailProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductCategoryText(), "Blue Top");
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductPriceText(), "Rs. 500");
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductAvailabilityText(), "Availability");
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getProductConditionText(), "Condition");
        Assert.assertEquals(new VerifyAllProductAndProductDetailPage().getproductBrandText(), "Brand");
    }
}
