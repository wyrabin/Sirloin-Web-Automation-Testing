package StepDef;

import cucumber.api.PendingException;
import org.example.pageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private final WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("user click email field")
    public void userClickEmailField() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickEmail();
    }

    @And("user input email \"([^\"]*)\"")
    public void userInputEmail(String email) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        Thread.sleep(2000);
    }

    @When("user click password field")
    public void userClickPasswordField() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickPassword();
    }

    @And("user input \"([^\"]*)\" as password")
    public void userInputAsPassword(String pass) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setPassword(pass);
        Thread.sleep(2000);
    }

    @Then("user click login button")
    public void userClickLoginButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
    }

    @Given("user on the sirloinPOS website")
    public void userOnTheSirloinPOSWebsite() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @Then("pop up berhasil login is displayed")
    public void popUpBerhasilLoginIsDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.berhasilLoginDisplayed();
        Thread.sleep(10000);
    }

    @Then("^see modal successfully$")
    public void seeModalSuccessfully() {
        LoginPage.waitSeeModal();
    }

    @When("^click OK button modal$")
    public void clickOKButtonModal() {
        LoginPage.clickOkSeeModal();
    }


    @Then("^see modal unsuccessfully login$")
    public void seeModalUnsuccessfullyLogin() {
        LoginPage.waitSeeModalError();
    }

    @When("^click OK button modal error$")
    public void clickOKButtonModalError() {
        LoginPage.clickOkSeeModalError();
    }


}


