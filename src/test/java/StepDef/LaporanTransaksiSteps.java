package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LaporanTransaksiPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LaporanTransaksiSteps {
    private WebDriver webDriver;
    public LaporanTransaksiSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @And("^user click menu laporan transaksi$")
    public void userClickMenuLaporanTransaksi() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.clickLaporanTransaksi();
    }

    @Then("^verify title menu \"([^\"]*)\"$")
    public void verifyTitleMenu(String judul) throws InterruptedException {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        Assert.assertEquals(judul, laporanTransaksiPage.getJudulLaporan());
        Thread.sleep(2000);
    }

    @And("^user click date from$")
    public void userClickDateFrom() throws InterruptedException {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.clickTanggalMulai();
        Thread.sleep(1000);
    }

    @And("^user set date from$")
    public void userSetDateFrom() throws InterruptedException {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.pilihTanggalMulai();
        Thread.sleep(1000);
    }

    @And("^user click date until$")
    public void userClickDateUntil() throws InterruptedException {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.clickTanggalSampai();
        Thread.sleep(1000);

    }

    @And("^user set date until$")
    public void userSetDateUntil() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.setPilihTanggalSampai();
    }

    @Then("^user click tampilkan data laporan transaksi$")
    public void userClickTampilkanDataLaporanTransaksi() throws InterruptedException {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.clickTampilData();
        Thread.sleep(2000);

    }

    @And("^user get text no transaksi$")
    public void userGetTextNoTransaksi() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.getTransaksi() ;
    }

    @And("^user get text status transaksi$")
    public void userGetTextStatusTransaksi() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        laporanTransaksiPage.getStatus() ;
    }

    @And("^user verify total transaksi sukses$")
    public void userVerifyTotalTransaksiSukses() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        System.out.println("Total Transaksi Sukses : "+laporanTransaksiPage.getTotalSukses());
    }

    @And("^user verify total transaksi$")
    public void userVerifyTotalTransaksi() {
        LaporanTransaksiPage laporanTransaksiPage = new LaporanTransaksiPage(webDriver);
        System.out.println("Total Transaksi : "+laporanTransaksiPage.getTotalTransaksi());
    }

    @And("^user click send to email$")
    public void userClickSendToEmail() {
    }

    @And("^user click print button laporan transaksi$")
    public void userClickPrintButtonLaporanTransaksi() {
    }
}
