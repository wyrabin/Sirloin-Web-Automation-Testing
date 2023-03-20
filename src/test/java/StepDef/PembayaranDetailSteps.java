package StepDef;



import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.PembayaranDetailPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class PembayaranDetailSteps {
    private WebDriver webDriver;
    PembayaranDetailPage pembayaranDetailPage;

    public PembayaranDetailSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        pembayaranDetailPage = new PembayaranDetailPage(webDriver);
    }

    @Given("user already detail pembayaran page")
    public void verifyDetailPembayaranPage() {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        Assert.assertTrue(pembayaranDetailPage.isDisplayDetailPembayaran());
    }

    @And("^user verify nama product, qty, harga$")
    public void userVerifyNamaProductQtyHarga() {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        System.out.println("Nama Product: " + pembayaranDetailPage.verifyNamaProduct());
        System.out.println("Qty: " + pembayaranDetailPage.verifyQty());
        System.out.println("Harga: " + pembayaranDetailPage.verifyHarga());
    }


    @And("^user verify total belanja product, diskon member, total belanja$")
    public void userVerifyTotalBelanjaProductDiskonMemberTotalBelanja() {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        System.out.println("Total Belanja: " + pembayaranDetailPage.verifyTotalBelanjaProduct());
        System.out.println("Diskon Member: " + pembayaranDetailPage.verifyDiskonMember());
        System.out.println("Total Belanja: " + pembayaranDetailPage.verifyTotalBelanja());
    }

    @And("user sort pembayaran list by tunai")
    public void selectPembayaranContainer() throws InterruptedException {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        String a = "Tunai";
        pembayaranDetailPage.selectPembayaranContainer(a);
        Thread.sleep(10000);
    }

    @And("^user sort pembayaran list by qris$")
    public void userSortPembayaranListByQris() throws InterruptedException {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        String b = "QRIS";
        pembayaranDetailPage.selectPembayaranContainer(b);
        Thread.sleep(10000);
    }

    @Then("^see modal scan barcode$")
    public void seeModalScanBarcode() {
        PembayaranDetailPage.waitSeeModalScaBarcode();
    }

    @When("^click OK button modal scan barcode$")
    public void clickOKButtonModalScanBarcode() {
        PembayaranDetailPage.clickOkSeeModalScanBarcode();
    }

    @And("^user sort pembayaran list by gopay$")
    public void userSortPembayaranListByGopay() throws InterruptedException {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        String c = "Gopay";
        pembayaranDetailPage.selectPembayaranContainer(c);
        Thread.sleep(10000);
    }

    @And("^user sort pembayaran list by shopeepay$")
    public void userSortPembayaranListByShopeepay() throws InterruptedException {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        String d = "ShopeePay";
        pembayaranDetailPage.selectPembayaranContainer(d);
        Thread.sleep(10000);
    }

    @Then("^see modal gagal$")
    public void seeModalGagal() {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        pembayaranDetailPage.waitSeeModalScaBarcode();
        }

    @And("^user input value quantity product is \"([^\"]*)\"$")
    public void userInputValueQuantityProductIs(String jumlah) {
        PembayaranDetailPage pembayaranDetailPage = new PembayaranDetailPage(webDriver);
        pembayaranDetailPage.setQuantity(jumlah);
    }

    @Then("^see modal gagal quantity is not enough$")
    public void seeModalGagalQuantityIsNotEnough() {
    }

    @When("^click OK button modal gagal payment$")
    public void clickOKButtonModalGagalPayment() {
    }
}











