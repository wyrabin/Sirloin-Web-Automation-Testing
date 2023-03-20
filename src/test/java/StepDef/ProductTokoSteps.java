package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import org.example.pageObject.CustomerPage;
import org.example.pageObject.PembayaranDetailPage;
import org.example.pageObject.ProductTokoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductTokoSteps {
    private WebDriver webDriver;
    ProductTokoPage productTokoPage;

    public ProductTokoSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        productTokoPage = new ProductTokoPage(webDriver);
    }


    @Then("^user should be \"([^\"]*)\" page$")
    public void userShouldBePage(String titleProductToko) throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        Assert.assertEquals(titleProductToko, productTokoPage.getTitleProductToko());
        System.out.println(titleProductToko);
        Thread.sleep(5000);
    }

    @Given("^user already on product toko page$")
    public void verifyDisplay() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.isDisplayed();
    }

    //Keranjang

    @And("^user click product item$")
    public void userClickProductItem() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        ProductTokoPage.clickProduct();
    }
    @And("^user click product item2$")
    public void userClickProductItem2() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        ProductTokoPage.clickProduct2();
    }

    @And("^verify product item on keranjang$")
    public void verifyProductItemOnKeranjang() throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        ProductTokoPage.getProduct();
        ProductTokoPage.getProduct2();
        Thread.sleep(2000);
    }

    @And("^user click button increment twenty items$")
    public void userClickButtonIncrementTwentyItems() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setClickInc();

    }

    @And("^user click button decrement ten items$")
    public void userClickButtonDecrementTenItems() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setClickDec();
    }

    @Then("^user delete item in list keranjang$")
    public void userDeleteItemInListKeranjang() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        ProductTokoPage.buttonDel();

    }

    @When("^user click member field$")
    public void userClickMemberField() throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.clickInputMember();
        Thread.sleep(5000);
    }

    @And("^user input member \"([^\"]*)\"$")
    public void userInputMember(String member) {
        // Write code here that turns the phrase above into concrete actions
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setNoMember(member);
    }

    @Then("^user click member button$")
    public void userClickMemberButton() throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.clickMember();
        Thread.sleep(3000);

    }
//
//    @And("^User will see checkout information payment \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void userWillSeeCheckoutInformationPaymentWithAnd(String expectedSubTotal, String expectedDiskonMember, String expectedTotalBelanja)  {
//        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
//        productTokoPage.verifySubTotal();
//        productTokoPage.verifyPriceDiskonMember();
//        productTokoPage.verifyPriceTotalBelanja();
//        Assert.assertEquals(expectedSubTotal, productTokoPage.verifySubTotal());
//        Assert.assertEquals(expectedDiskonMember, productTokoPage.verifyPriceDiskonMember());
//        Assert.assertEquals(expectedTotalBelanja, productTokoPage.verifyPriceTotalBelanja());
//        ProductTokoPage.buttonBayar();
//    }

    @And("^user click bayar button$")
    public void userClickBayarButton() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        ProductTokoPage.buttonBayar();

    }


    @When("^user click search barang$")
    public void userClickSearchBarang() throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.clickInputBarang();
        Thread.sleep(5000);

    }

    @And("^user input barang  \"([^\"]*)\"$")
    public void userInputBarang(String barang) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setSearchBarang(barang);
        Thread.sleep(3000);
    }

    @And("^user verify value sub total, diskon member, total belanja$")
    public void userVerifyValueSubTotalDiskonMemberTotalBelanja() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        System.out.println("Sub Total: "+productTokoPage.verifySubTotal());
        System.out.println("Diskon Member: "+productTokoPage.verifyPriceDiskonMember());
        System.out.println("Total Belanja: "+productTokoPage.verifyPriceTotalBelanja());
    }

    @Then("^user see all result search product on dashboard$")
    public void userSeeAllResultSearchProductOnDashboard() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        Assert.assertTrue(productTokoPage.isDisplayInputBarang());

    }

    @When("^user click cart quantity field$")
    public void userClickCartQuantityField() throws InterruptedException {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.clickCartQuantity();
        Thread.sleep(5000);
    }


    @And("^user input cart quantity \"([^\"]*)\"$")
    public void userInputCartQuantity(String quantity) {
        // Write code here that turns the phrase above into concrete actions
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setInputCartQuantity(quantity);
    }

//    @Then("^user redirect to \"([^\"]*)\" page$")
//    public void userRedirectToPage(String titleProductToko) {
//        // Write code here that turns the phrase above into concrete actions
//        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
//        Assert.assertEquals(titleProductToko, productTokoPage.getTitleProductToko());
//    }

    @Then("^user redirect to \"([^\"]*)\" page$")
    public void userRedirectToPage(String arg0) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        Assert.assertTrue(productTokoPage.isDisplayDetailPembayaran());
        Thread.sleep(3000);
    }

    @And("^user click button increment eighty items$")
    public void userClickButtonIncrementEightyItems() {
        ProductTokoPage productTokoPage = new ProductTokoPage(webDriver);
        productTokoPage.setClickIncMore();
    }
}





    
        