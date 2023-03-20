package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Tr;
import org.example.pageObject.ProfileTenantPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProfileTenanttSteps {
    private WebDriver webDriver;
    public ProfileTenanttSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @And("^user click profile tenant menu$")
    public void userClickProfileTenantMenu() {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.clickProfile();
    }


    @Then("^user should be on \"([^\"]*)\" page$")
    public void userShouldBeOnPage(String judulProfile) throws InterruptedException {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(judulProfile, profileTenantPage.getJudulProfile());
        System.out.println(judulProfile);
        Thread.sleep(3000);
    }

    @And("^verify toko have name \"([^\"]*)\"$")
    public void verifyTokoHaveName(String namaToko) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(namaToko, profileTenantPage.getNamaToko());
    }

    @And("^verify email have value \"([^\"]*)\"$")
    public void verifyEmailHaveValue(String emailToko) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(emailToko, profileTenantPage.getEmailToko());
    }

    @And("^verify nomor telephone is \"([^\"]*)\"$")
    public void verifyNomorTelephoneIs(String noHp) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(noHp, profileTenantPage.getNoHpToko());
    }

    @And("^verify address is \"([^\"]*)\"$")
    public void verifyAddressIs(String alamatToko) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(alamatToko, profileTenantPage.getAlamat());
    }

    @And("^user click button edit profile$")
    public void userClickButtonEditProfile() throws InterruptedException {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.clickButtonEdit();
        Thread.sleep(3000);

    }

    @And("^verify user on \"([^\"]*)\"$")
    public void verifyUserOn(String judulEdit){
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(judulEdit, profileTenantPage.getTitleUpdate());
    }

    @Then("^user verify placeholder nama toko \"([^\"]*)\"$")
    public void userVerifyPlaceholderNamaToko(String placeToko) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(placeToko, profileTenantPage.getPlaceNamaToko());

    }

    @Then("^user update nama bisnis toko with \"([^\"]*)\"$")
    public void userUpdateNamaBisnisTokoWith(String updateToko) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.updateNamaToko(updateToko);

    }

    @And("^user click save button$")
    public void userClickSaveButton() throws InterruptedException {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.clickSave();
        Thread.sleep(3000);

    }

    @Then("^user verify nama bisnis atau toko updated with \"([^\"]*)\" on profile tenant page$")
    public void userVerifyNamaBisnisAtauTokoUpdatedWithOnProfileTenantPage(String tokoupdate) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(tokoupdate, profileTenantPage.getNamaToko());
    }

    @Then("^user update phone number with \"([^\"]*)\"$")
    public void userUpdatePhoneNumberWith(String nomorhp) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.updatePhoneNumber(nomorhp);
    }

    @Then("^user verify phone number updated with \"([^\"]*)\" on profile tenant page$")
    public void userVerifyPhoneNumberUpdatedWithOnProfileTenantPage(String hpupdate) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(hpupdate, profileTenantPage.getNoHpToko());

    }


    @Then("^user update alamat with \"([^\"]*)\"$")
    public void userUpdateAlamatWith(String updatealamat)  {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.updateAlamat(updatealamat);

    }

    @Then("^user verify alamat updated with \"([^\"]*)\" on profile tenant page$")
    public void userVerifyAlamatUpdatedWithOnProfileTenantPage(String alamat) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(alamat, profileTenantPage.getAlamat());
    }

    @And("^user click button kembali$")
    public void userClickButtonKembali() throws InterruptedException {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.setClickKembali();
        Thread.sleep(2000);

    }


    @And("^user click button kembali on profile tenant page$")
    public void userClickButtonKembaliOnProfileTenantPage() {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        profileTenantPage.buttonBack();

        
    }

    @Then("^user should be on home page \"([^\"]*)\"$")
    public void userShouldBeOnHomePage(String judulH1) {
        ProfileTenantPage profileTenantPage = new ProfileTenantPage(webDriver);
        Assert.assertEquals(judulH1, profileTenantPage.judulProductToko());

    }
}
