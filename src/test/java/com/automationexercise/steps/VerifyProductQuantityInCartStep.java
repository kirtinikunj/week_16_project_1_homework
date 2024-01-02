package com.automationexercise.steps;

import com.automationexercise.pages.VerifyProductQuantityInCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerifyProductQuantityInCartStep {
    @When("I click {string} for any product on home page")
    public void iClickViewProductForAnyProductOnHomePage() {
        new VerifyProductQuantityInCartPage().clickOnViewProduct();
    }

    @And("I can see product detail is opened")
    public void iCanSeeProductDetailIsOpened() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingProductOnThePage(), "\t\n" +
                "Cotton Silk Hand Block Print Saree");
    }

    @And("I increase quantity to {string}")
    public void iIncreaseQuantityTo(String four) {
        new VerifyProductQuantityInCartPage().enterQtyFour();
    }

    @And("I click Add to cart button")
    public void iClickAddToCartButton() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @Then("I can see that product is displayed in cart page with exact quantity")
    public void iCanSeeThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingCartInfoIsCorrect(),  "cart_info");
    }


}
