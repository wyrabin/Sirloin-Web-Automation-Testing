package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LaporanAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LaporanAdminSteps {
    private WebDriver webDriver;
    public LaporanAdminSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }


    @And("^laporan transaksi penjualan is displayed$")
    public void laporanTransaksiPenjualanIsDisplayed() throws InterruptedException {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        laporanAdminPage.getTransaksi1();
        laporanAdminPage.getTransaksi2();
        Thread.sleep(1000);
    }

    @And("^verify total transaksi penjualan, total transaksi penjualan sukses$")
    public void verifyTotalTransaksiPenjualanTotalTransaksiPenjualanSukses() {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        System.out.println("Total Transaksi Penjualan Sukses : "+laporanAdminPage.getTransaksiSukses());
        System.out.println("Total Transaksi Penjualan : "+laporanAdminPage.getAllTransaksi());
    }

    @Then("^verify title menu laporan penjualan admin is Laporan Penjualan$")
    public void verifyTitleMenuLaporanPenjualanAdminIsLaporanPenjualan() {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        laporanAdminPage.getJudul() ;
    }

    @And("^user click menu laporan penjualan$")
    public void userClickMenuLaporanPenjualan() throws InterruptedException {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        laporanAdminPage.clickLaporanPenjualan();
        Thread.sleep(2000);
    }

    @And("^laporan transaksi penjualan displayed$")
    public void laporanTransaksiPenjualanDisplayed() throws InterruptedException {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        laporanAdminPage.getTransaksi1() ;
        laporanAdminPage.getTransaksi2() ;
        Thread.sleep(1000);
    }

    @And("^verify total transaksi penjualan and total transaksi penjualan sukses$")
    public void verifyTotalTransaksiPenjualanAndTotalTransaksiPenjualanSukses() {
        LaporanAdminPage laporanAdminPage =new LaporanAdminPage(webDriver) ;
        System.out.println("Total Transaksi Penjualan Sukses : "+laporanAdminPage.getTransaksiSukses());
        System.out.println("Total Transaksi Penjualan : "+laporanAdminPage.getAllTransaksi());

    }
}
