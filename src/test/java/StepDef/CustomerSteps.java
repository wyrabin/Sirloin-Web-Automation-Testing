package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CustomerPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CustomerSteps {
    private final WebDriver webDriver;

    public CustomerSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("^user click menu customer$")
    public void userClickMenuCustomer() {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickCustomer();
    }

    @And("^user should be on list \"([^\"]*)\"$")
    public void userShouldBeOnList(String judulCustomer) throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(webDriver);
        Assert.assertEquals(judulCustomer, customerPage.getTitleCustomer());
        Thread.sleep(4000);
    }

    @And("^user click button tambah customer$")
    public void userClickButtonTambahCustomer() {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickAddCustomer();
    }

    @Then("^user should be redirect to \"([^\"]*)\" page$")
    public void userShouldBeRedirectToPage(String judulAdd) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        Assert.assertEquals(judulAdd, customerPage.getTitleTambahCustomer());

    }

    @And("^user click button kembali on add customer page$")
    public void userClickButtonKembaliOnAddCustomerPage() {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickKembali();
    }

    @And("^user input name customer \"([^\"]*)\"$")
    public void userInputNameCustomer(String nama) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.setNamaCustomer(nama);

    }

    @And("^user input phone number \"([^\"]*)\"$")
    public void userInputPhoneNumber(String noHp) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.setPhoneCustomer(noHp);
    }

    @And("^user input email customer \"([^\"]*)\"$")
    public void userInputEmailCustomer(String email) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.setEmailCustomer(email);
    }

    @And("^user input alamat customer \"([^\"]*)\"$")
    public void userInputAlamatCustomer(String alamat) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.setAlamatCustomer(alamat);
    }

    @Then("^user click simpan customer$")
    public void userClickSimpanCustomer() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickSimpanEdit();
        Thread.sleep(3000);
    }


    @Then("^button simpan is disable$")
    public void buttonSimpanIsDisable() {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.saveDisable();
    }


    @And("^user stay on \"([^\"]*)\" page and get message eror format email$")
    public void userStayOnPageAndGetMessageErorFormatEmail(String judul){
        CustomerPage customerPage = new CustomerPage(webDriver);
        Assert.assertEquals(judul, customerPage.getTitleTambahCustomer());

    }

    @And("^user click button edit button customer Mukhlis$")
    public void userClickButtonEditButtonCustomerMukhlis() {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickEdit();
    }

    @And("^user change name \"([^\"]*)\"$")
    public void userChangeName(String nama){
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.editNama(nama);
    }

    @And("^user change phone number \"([^\"]*)\"$")
    public void userChangePhoneNumber(String noHp) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.editNoHp(noHp);
    }

    @And("^user change email \"([^\"]*)\"$")
    public void userChangeEmail(String email) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.editEmail(email);
    }

    @And("^user change alamat \"([^\"]*)\"$")
    public void userChangeAlamat(String alamat){
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.editAlamat(alamat);
    }

    @Then("^user click simpan new customer$")
    public void userClickSimpanNewCustomer() throws InterruptedException {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.clickSaveNew();
        Thread.sleep(3000);
    }

    @And("^user have message Berhasil \"([^\"]*)\"$")
    public void userHaveMessageBerhasil(String Cust) {
        CustomerPage customerPage = new CustomerPage(webDriver);
        customerPage.getSuksesPesan();
        customerPage.setClickOk();
    }
}
