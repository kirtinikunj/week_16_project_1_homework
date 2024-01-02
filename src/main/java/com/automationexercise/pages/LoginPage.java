package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement newUserSignup;


    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;



    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email Address']")
    WebElement emailAddressFfield;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement yourEmailOrPasswordIsIncorrect;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-user']")
    WebElement loginAs;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    WebElement deleteAccount;

    @CacheLookup
    @FindBy(xpath = "//b[text()='Account Deleted!']")
    WebElement deleteAccountText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton1;

    public String getNewUserSignupText(){
        log.info("Getting New User Signup! text" + newUserSignup.toString());
        return getTextFromElement(newUserSignup);
    }

    public void sendTextToElement(WebElement enterName) {
    }

    public void enterFirstName(String fName){
        sendTextToElement(enterName);
    }

    public void sendEmailAddress(String email){
        sendTextToElement(emailField);
    }


    public void enterEmailAddress(String emailAddress){
        sendTextToElement(emailAddressFfield);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMsgEmailAndPasswordIncorrect(){
        log.info("Your email or password is incorrect! text" + yourEmailOrPasswordIsIncorrect.toString());
        return getTextFromElement(yourEmailOrPasswordIsIncorrect);
    }

    public String verifyLoginAsUserName(){
        log.info(" Logged in as Honey "+loginAs.toString());
        return getTextFromElement(loginAs);
    }

    public void clickOnDeleteAccount(){
        clickOnElement(deleteAccount);
    }

    public String verifyAccountDeleted(){
        log.info("ACCOUNT DELETED! text"+deleteAccountText.toString());
        return getTextFromElement(deleteAccountText);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton1);
    }
}
