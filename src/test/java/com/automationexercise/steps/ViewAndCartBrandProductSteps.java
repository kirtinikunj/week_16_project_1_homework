package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ViewAndCartBrandProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ViewAndCartBrandProductSteps {
    @And("I can see that Brands are visible on left side bar")
    public void iCanSeeThatBrandsAreVisibleOnLeftSideBar() {
        new HomePage().clickOnProductsButton();
        Assert.assertEquals(new ViewAndCartBrandProductPage().verifyingBrandsProduct(), "BRANDS");
    }

    @And("I click on any brand name")
    public void iClickOnAnyBrandName() {
        new ViewAndCartBrandProductPage().clickOnPoloBrand();
    }

    @And("I can see that user is navigated to brand page and brand products are displayed")
    public void iCanSeeThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new ViewAndCartBrandProductPage().verifyingPoloBrandsProducts(), "BRAND - POLO PRODUCTS");
    }

    @And("On left side bar, i click on any other brand link")
    public void onLeftSideBarIClickOnAnyOtherBrandLink() {
        new ViewAndCartBrandProductPage().clickOnHandMBrand();
    }

    @Then("I should navigated to that brand page and can see products")
    public void iShouldNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertEquals(new ViewAndCartBrandProductPage().verifyingHandMBrandsProducts(), "BRAND - H&M PRODUCTS");
    }
}
