package com.automationexercise.steps;

import com.automationexercise.pages.RemoveProductFromCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RemoveProductsFromCartSteps {
    @And("I click {string} button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct() {
        new RemoveProductFromCartPage().clickOnXToDeleteProductFromCart();
    }

    @Then("I can see that product is removed from the cart")
    public void iCanSeeThatProductIsRemovedFromTheCart() {
    }
}
