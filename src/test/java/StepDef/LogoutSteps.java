package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogoutSteps {
    private final WebDriver webDriver;

    public LogoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("^user click button logout$")
    public void userClickButtonLogout() {
        LogoutPage logoutPage = new LogoutPage(webDriver) ;
        logoutPage.clickLogout();
    }

    @And("^user have message \"([^\"]*)\"$")
    public void userHaveMessage(String pesanLogout) {
        LogoutPage logoutPage = new LogoutPage(webDriver) ;
        Assert.assertEquals(pesanLogout, logoutPage.getMessageLogout());
        logoutPage.clickOk();

    }
}
