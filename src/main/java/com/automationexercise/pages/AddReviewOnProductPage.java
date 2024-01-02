package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddReviewOnProductPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "/product_details/1")
    WebElement viewProduct;

    @CacheLookup
    @FindBy(linkText = "//a[text()='Write Your Review']")
    WebElement writeReview;

    @CacheLookup
    @FindBy(id = "name")
    WebElement name1;

    @CacheLookup
    @FindBy(id = "email")
    WebElement email1;

    @CacheLookup
    @FindBy(id = "review")
    WebElement review1;

    @CacheLookup
    @FindBy(id = "button-review")
    WebElement submitButton;


    //span[normalize-space()='Thank you for your review.']
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
    WebElement thankYouForReview;

    public void clickOnViewProduct() {
        clickOnElement(viewProduct);
    }

    public String getWriteYourReviewText() {
        log.info("Write Your Review" + writeReview.toString());
        return getTextFromElement(writeReview);
    }

    private void sendTextToElement(WebElement yourName) {
    }

    public void enterYourName(String name) {
        sendTextToElement(name1);
    }

    public void enterYourEmail(String email) {
        sendTextToElement(email1);
    }

    public void enterYourReview(String review){
        sendTextToElement(review1);
    }

    public void clickOnSubmitButton(){
        clickOnElement(submitButton);
    }

    public String getReviewText() {
        log.info("Thank you for your review." + thankYouForReview.toString());
        return getTextFromElement(thankYouForReview);
    }

}
