package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.HistoryBelanjaPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HistoryBelanjaSteps {
    private WebDriver webDriver;
    public HistoryBelanjaSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @Then("^user click menu history pembelanjaan$")
    public void userClickMenuHistoryPembelanjaan() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.clickHistory();
    }

    @And("^user shouldbe on \"([^\"]*)\"$")
    public void userShouldbeOn(String titlehistory) {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        Assert.assertEquals(titlehistory, historyBelanjaPage.getTitleHistory());


    }

    @And("^user set date from \"([^\"]*)\"$")
    public void userSetDateFrom(String from) throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.setClickTanggalDari();
        Thread.sleep(1000);
        historyBelanjaPage.setTanggalDari();



    }

    @And("^user set date until \"([^\"]*)\"$")
    public void userSetDateUntil(String until) throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.setClickTanggalSampai();
        Thread.sleep(1000);
        historyBelanjaPage.setPilihTanggalSampai();

    }

    @Then("^user click tampilkan data product$")
    public void userClickTampilkanDataProduct() throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.clickTampilData();
        Thread.sleep(3000);
    }

    @And("^transaction is displayed$")
    public void transactionIsDisplayed() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.transaksiDisplayed();

    }

    @And("^user get value total belanja produk sukses$")
    public void userGetValueTotalBelanjaProdukSukses() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println("Total Belanja Product Sukses : " + historyBelanjaPage.getValueSukses());

    }

    @And("^user get value total belanja product$")
    public void userGetValueTotalBelanjaProduct() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println("Total Belanja Product : " + historyBelanjaPage.getValueAll());
    }

    @And("^user click print button$")
    public void userClickPrintButton() throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.clickPrint();
        Thread.sleep(3000);
    }

    @And("^click detail transaction payment$")
    public void clickDetailTransactionPayment() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.clickDetailTransaction();
    }

    @And("^user verify on \"([^\"]*)\" history belanja page$")
    public void userVerifyOnPage(String judul) throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        Assert.assertEquals(judul, historyBelanjaPage.getTitleDetail());
        Thread.sleep(3000);
    }

    @Then("^user verify status transaction$")
    public void userVerifyStatusTransaction() throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println(historyBelanjaPage.getJudulStatus());
        Thread.sleep(1000);

    }

    @And("^user get status transaction payment$")
    public void userGetStatusTransactionPayment() throws InterruptedException {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println(historyBelanjaPage.getStatus());
        Thread.sleep(1000);
    }

    @And("^user get code invoice on list history$")
    public void userGetCodeInvoiceOnListHistory() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println(historyBelanjaPage.getNoTransaksi());
    }

    @And("^user get date invoice on list history$")
    public void userGetDateInvoiceOnListHistory() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println(historyBelanjaPage.getTanggal());
    }

    @And("^user verify code invoice on detail transaction$")
    public void userVerifyCodeInvoiceOnDetailTransaction() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.noTransaksiDetail();
    }

    @And("^user verify date invoice on detail transaction$")
    public void userVerifyDateInvoiceOnDetailTransaction() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.detailTanggal();
    }

    @And("^user verify history product is valid$")
    public void userVerifyHistoryProductIsValid() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.getItem1();
        historyBelanjaPage.getItem2() ;
        historyBelanjaPage.getItem3();
    }

    @Then("^user verify total payment product$")
    public void userVerifyTotalPaymentProduct() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        System.out.println("Total Harga : "+historyBelanjaPage.getTotalHarga());
    }

    @And("^user click button kembali on detail transaction$")
    public void userClickButtonKembaliOnDetailTransaction() {
        HistoryBelanjaPage historyBelanjaPage =  new HistoryBelanjaPage(webDriver);
        historyBelanjaPage.clickBack();
    }
}
