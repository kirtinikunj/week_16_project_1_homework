import com.automationexercise.pages.ViewCategoryProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ViewcategoryProductStep {
    @When("I can see that categories are visible on left side bar")
    public void iCanSeeThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new ViewCategoryProductPage().verifyingSidePanel(), "CATEGORY");
    }

    @And("I click on {string} category")
    public void iClickOnWomenCategory() {
            new ViewCategoryProductPage().clickOnWomenCategory();
    }

    @And("I click on any category link under {string} category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new ViewCategoryProductPage().clickOnWomensDressCategory();
    }

    @And("I can see that category page is displayed")
    public void iCanSeeThatCategoryPageIsDisplayed() {
        Assert.assertEquals(new ViewCategoryProductPage().verifyingwomenDressProductsText(), "WOMEN - DRESS PRODUCTS");
    }

    @And("confirm text {string}")
    public void confirmTextWOMENTOPSPRODUCTS() {
    }

    @And("On left side bar, click on any sub-category link of {string} category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        new ViewCategoryProductPage().clickOnMenSubCategoryTshirts();
    }

    @Then("I should able to  navigate to that category page")
    public void iShouldAbleToNavigateToThatCategoryPage() {
        Assert.assertEquals(new ViewCategoryProductPage().verifyingMenTshirtsProductsText(), "MEN - TSHIRTS PRODUCTS");
    }
}
