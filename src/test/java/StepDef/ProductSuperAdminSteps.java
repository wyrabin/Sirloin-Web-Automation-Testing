package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.ProductSuperAdminPage;
import org.example.pageObject.ProductTenantPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSuperAdminSteps {
    private WebDriver webDriver;
    public ProductSuperAdminSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @Then("^admin should be redirect to list \"([^\"]*)\" page$")
    public void adminShouldBeRedirectToListPage(String judul) {
        ProductSuperAdminPage productSuperAdminPage = new ProductSuperAdminPage(webDriver) ;
        Assert.assertEquals(judul, productSuperAdminPage.getProductPage());
    }

    @And("^admin verify product kecap is displayed$")
    public void adminVerifyProductKecapIsDisplayed() {
        ProductSuperAdminPage productSuperAdminPage = new ProductSuperAdminPage(webDriver);
        productSuperAdminPage.getKecap() ;
    }

    @And("^admin click edit product$")
    public void adminClickEditProduct() throws InterruptedException {
        ProductSuperAdminPage productSuperAdminPage = new ProductSuperAdminPage(webDriver);
        productSuperAdminPage.clickEdit();
        Thread.sleep(2000);
    }
}
