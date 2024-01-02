package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class placeOrderRegisterWithCheckoutSteps {
    @When("I add products to cart")
    public void iAddProductsToCart() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @And("I click Cart button")
    public void iClickCartButton() {
        new VerifyProductQuantityInCartPage().clickOnAddToCart();
    }

    @And("I can see that cart page is displayed")
    public void iCanSeeThatCartPageIsDisplayed() {
        Assert.assertEquals(new VerifyProductQuantityInCartPage().verifyingCartInfoIsCorrect(),  "cart_info");
    }

    @And("I click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new PlaceOrderRegisterWhileCheckoutPage().clickOnProceedToCheckout();
    }

    @And("I click Register button")
    public void iClickRegisterButton() {
        new PlaceOrderRegisterWhileCheckoutPage().clickOnRegisterLoginButton();
    }

    @And("I fill all details in Signup")
    public void iFillAllDetailsInSignup() {
    }

    @And("I create account name {string}")
    public void iCreateAccountName(String name) {
        new RegisterWithExistingEmailPage().enterFirstName(name);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterWithExistingEmailPage().sendEmailAddress(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new EnterAccountInfoPage().enterPassword(password);
    }

    @And("I enter address {string}")
    public void iEnterAddress(String address1) {
        new EnterAccountInfoPage().enterFirstLineOfTheAddress1(address1);
    }

    @And("I enter country {string}")
    public void iEnterCountry(String country) {
        new EnterAccountInfoPage().selectCountryUKFromList(country);
    }

    @And("I enter state {string}")
    public void iEnterState(String state) {
        new EnterAccountInfoPage().enterState(state);
    }

    @And("I enter city {string}")
    public void iEnterCity(String city) {
        new EnterAccountInfoPage().enterCity(city);
    }

    @And("I enter postcode {string}")
    public void iEnterPostcode(String arg0) {
    }

    @And("I enter mobile number {string}")
    public void iEnterMobileNumber(String postcode) {
        new EnterAccountInfoPage().enterZipCode(postcode);
    }

    @And("I can see {string} at top")
    public void iCanSeeLoggedInAsUsernameAtTop() {
        Assert.assertEquals(new LoginWithValidCredentialsPage().getTextLoggedInAsJo(),"Logged in as Honey");
    }

    @And("I can see Address Details and Review Your Order")
    public void iCanSeeAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckoutPage().getTextAddressDetails(),"Address Details");
        Assert.assertEquals(new PlaceOrderRegisterWhileCheckoutPage().getTextReviewYourOrder(),"Review Your Order");
    }

    @And("I enter description in comment text area {string}")
    public void iEnterDescriptionInCommentTextArea(String text) {
        new PlaceOrderRegisterWhileCheckoutPage().enterCommentInTheField(text);
    }

    @And("I enter payment details: Name on Card {string}, Card Number{string}, CVC {string}, Expiration date {string},{string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate(String name, String cardNumber, String cvc, String expireMonth, String expireYear) {
//        new PlaceOrderRegisterWhileCheckoutPage().enterNameOnCard(name);
//        new PlaceOrderRegisterWhileCheckoutPage().enterCardNumber(cardNumber);
//        new PlaceOrderRegisterWhileCheckoutPage().enterCVCNumber(cvc);
//        new PlaceOrderRegisterWhileCheckoutPage().enterExpiryMonth(expireMonth);
//        new PlaceOrderRegisterWhileCheckoutPage().enterExpiryYear(expireYear);
    }

    @And("I verify success message {string}")
    public void iVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }

    @Then("I can see {string} and click {string} button")
    public void iCanSeeACCOUNTDELETEDAndClickContinueButton() {
        new LoginWithValidCredentialsPage().clickOnDeleteAccount();
    }
}
