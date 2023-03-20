package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LoginSuperAdminPage;
import org.example.pageObject.ProductTokoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSuperAdminSteps {
    private WebDriver webDriver;
    ProductTokoPage productTokoPage;

    public LoginSuperAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        productTokoPage = new ProductTokoPage(webDriver);
    }
    @Then("^admin should be \"([^\"]*)\" page$")
    public void adminShouldBePage(String judulAdmin) throws InterruptedException {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(judulAdmin, loginSuperAdminPage.getJudulAdmin());
        Thread.sleep(2000);

    }

    @And("^admin verify menu home displayed \"([^\"]*)\"$")
    public void adminVerifyMenuHomeDisplayed(String home) {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(home, loginSuperAdminPage.getHome());
    }

    @And("^admin verify menu product displayed \"([^\"]*)\"$")
    public void adminVerifyMenuProductDisplayed(String product) {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(product, loginSuperAdminPage.getProduct());

    }

    @And("^admin verify menu laporan penjualan displayed \"([^\"]*)\"$")
    public void adminVerifyMenuLaporanPenjualanDisplayed(String laporan) {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(laporan, loginSuperAdminPage.getLaporan());
    }

    @And("^admin verify menu profile displayed \"([^\"]*)\"$")
    public void adminVerifyMenuProfileDisplayed(String profile) {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(profile, loginSuperAdminPage.getProfile());
    }

    @And("^admin verify menu logout displayed \"([^\"]*)\"$")
    public void adminVerifyMenuLogoutDisplayed(String logout) {
        LoginSuperAdminPage loginSuperAdminPage = new LoginSuperAdminPage(webDriver);
        Assert.assertEquals(logout, loginSuperAdminPage.getLogout());
    }
}
