package StepDef;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    private WebDriver webDriver;
    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @Given("^user already on login page$")
    public void userAlreadyOnLoginPage() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.judulIsDisplayed();
    }

    @When("^user click register field$")
    public void userClickRegisterField() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        Thread.sleep(2000);
        registerPage.clickToRegister();
    }

    @And("^user input nama bisnis / toko \"([^\"]*)\"$")
    public void userInputNamaBisnisToko(String toko) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setNamaToko(toko);
        Thread.sleep(1000);
    }


    @And("^user input \"([^\"]*)\" as email$")
    public void userInputAsEmail(String email) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setRegisterEmail(email);
        Thread.sleep(1000);
    }

    @And("^user input \"([^\"]*)\" as alamat$")
    public void userInputAsAlamat(String alamat) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setAlamat(alamat);
        Thread.sleep(1000);
    }

    @And("^user click register button$")
    public void userClickRegisterButton() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegister();
        Thread.sleep(2000);
    }

    @And("^user input password register have value \"([^\"]*)\"$")
    public void userInputPasswordRegisterHaveValue(String pwd) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setRegisterPassword(pwd);
        Thread.sleep(1000);
    }

    @And("^user input nomor telephone \"([^\"]*)\"$")
    public void userInputNomorTelephone(String nohp) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setNumberHp(nohp);

    }

    @Then("^button register should be disable$")
    public void buttonRegisterShouldBeDisable() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.registerDisable();
    }



    @Then("^modal is displayed$")
    public void modal_is_displayed()  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(registerPage.popModal());
    }

    @And("^verify title message text is \"([^\"]*)\"$")
    public void verifyMessageText(String judulModal)  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertEquals(judulModal, registerPage.getJudulModal());
        System.out.println(judulModal);

    }

    @And("^verify massage is \"([^\"]*)\"$")
    public void verifyMassageIs(String pesanModal)  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertEquals(pesanModal, registerPage.getPesanModal());
        System.out.println(pesanModal);
        registerPage.setClickModalOk();

    }

    @Then("^user click login text$")
    public void userClickLoginText() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickLoginOnRegister();
    }

    @And("^user should redirect to login page with verify title \"([^\"]*)\"$")
    public void userShouldRedirectToLoginPageWithVerifyTitle(String judulLogin)  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertEquals(judulLogin, registerPage.getTitleLogin());
        System.out.println(judulLogin);
    }

    @Then("^user redirect to login page verify title page \"([^\"]*)\"$")
    public void userRedirectToLoginPageVerifyTitlePage(String judulLogin)  {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertEquals(judulLogin, registerPage.getTitleLogin());
        System.out.println(judulLogin);
    }}
