package com.automationexercise.steps;

import com.automationexercise.pages.AddProductsInCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddProductsInCartSteps {
    @And("I hover over first product")
    public void iHoverOverFirstProduct() {
        new AddProductsInCartPage().hoverOverFirstProduct();
    }

    @And("I click {string}")
    public void iClickAddToCart() {
    }

    @And("I click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new AddProductsInCartPage().clickOnContinueShopping();
    }

    @And("I hover over second product")
    public void iHoverOverSecondProduct() {
        new AddProductsInCartPage().hoverOverSecondProduct();
    }

    @And("I click View Cart button")
    public void iClickViewCartButton() {
        new AddProductsInCartPage().clickOnViewCartLinkText();
    }

    @And("I can see both products are added to Cart")
    public void iCanSeeBothProductsAreAddedToCart() {
        Assert.assertEquals(new AddProductsInCartPage().verifyAllProductsOnThePage(),  "Shopping Cart");
    }

    @Then("I should see their prices, quantity and total price")
    public void iShouldSeeTheirPricesQuantityAndTotalPrice() {
        Assert.assertEquals(new AddProductsInCartPage().verifyPrice(),  "Rs. 3000");
        Assert.assertEquals(new AddProductsInCartPage().verifyQuantity(),  "2");
        Assert.assertEquals(new AddProductsInCartPage().verifyCartTotalAmount(),  "Rs. 6000");
    }
}
