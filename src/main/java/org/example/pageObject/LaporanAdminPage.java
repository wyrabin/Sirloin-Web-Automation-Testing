package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaporanAdminPage {
    public static WebDriver driver;

    public LaporanAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = "tbody > tr:nth-of-type(1) > td:nth-of-type(2)")
    private WebElement transaksi1 ;
    public boolean getTransaksi1(){
        return transaksi1.isDisplayed() ;
    }

    @FindBy(css = "tr:nth-of-type(56) > td:nth-of-type(2)")
    private WebElement transaksi2;
    public boolean getTransaksi2(){
        return transaksi2.isDisplayed() ;
    }

    @FindBy(css = "tfoot > tr:nth-of-type(1) > .font-bold")
    private WebElement transaksiSukses ;
    public String getTransaksiSukses(){
        return transaksiSukses.getText() ;
    }

    @FindBy(css = "tfoot > tr:nth-of-type(2) > .font-bold" )
    private WebElement semuaTransaksi;
    public String getAllTransaksi(){
        return semuaTransaksi.getText() ;
    }
    @FindBy(css = ".text-2xl")
    private WebElement judulLaporan ;
    public boolean getJudul(){
        return judulLaporan.isDisplayed() ;
    }
    @FindBy(xpath = "//a[@id='laporan-penjualan']")
    private WebElement laporanPenjualan ;
    public void clickLaporanPenjualan(){
        laporanPenjualan.click();
    }
}
