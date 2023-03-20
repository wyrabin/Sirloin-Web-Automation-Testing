package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryBelanjaPage {
    public static WebDriver driver;

    public HistoryBelanjaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@id='history-pembelanjaan']")
    private WebElement historybelanja ;
    public void clickHistory(){
        historybelanja.click();
    }
    @FindBy(xpath = "//h3[@class='font-bold text-2xl text-[#4AA3BA] mb-10']")
    private WebElement titleHistory;
    public String getTitleHistory(){
        return titleHistory.getText() ;
    }
    @FindBy(xpath = "//input[@id='start-date']")
    private WebElement clickTanggalDari ;
   public void setClickTanggalDari(){
       clickTanggalDari.click();
   }
   @FindBy(xpath ="//div[@class='react-datepicker__day react-datepicker__day--001']" )
   private WebElement pilihTanggalDari ;
   public void setTanggalDari(){
       pilihTanggalDari.click();
   }


    @FindBy(xpath = "//input[@id='end-date']" )
    private WebElement clickTanggalSampai ;
    public void setClickTanggalSampai(){
        clickTanggalSampai.click();
    }
    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--010']")
    private WebElement pilihTanggalSampai ;
    public void setPilihTanggalSampai(){
        pilihTanggalSampai.click();
    }


    @FindBy(xpath = "//button[@id='tampil-data']")
    private WebElement tampilData ;
    public void clickTampilData(){
        tampilData.click();
    }

    @FindBy(css = "tr:nth-of-type(4) > td:nth-of-type(2)")
    private WebElement transaksi ;
    public boolean transaksiDisplayed(){
        transaksi.isDisplayed();
        return true ;
    }
    @FindBy(css ="tfoot > tr:nth-of-type(1) > th:nth-of-type(5)" )
    private WebElement productSukses;
    public String getValueSukses(){
        return productSukses.getText();
    }

    @FindBy(css = "tfoot > tr:nth-of-type(2) > th:nth-of-type(5)")
    private WebElement totalProduct ;
    public String getValueAll(){
        return totalProduct.getText();
    }

    @FindBy(xpath = "//button[@id='pdf']")
    private WebElement buttonPrint;
    public void clickPrint(){
        buttonPrint.click();

    }
    @FindBy(xpath = "//tr[4]//button[@class='btn btn-ghost btn-square']")
    private WebElement detailTransaction ;
    public void clickDetailTransaction(){
        detailTransaction.click();
    }
    @FindBy(xpath = "//h3[@class='flex m-10 font-bold text-2xl text-[#4AA3BA]']")
    private WebElement titleDetail ;
    public String getTitleDetail(){
        return titleDetail.getText() ;
    }
    @FindBy(xpath = "//td[@class='text-green-600']")
    private WebElement statusTransaksi ;
    public String getStatus(){
        return statusTransaksi.getText() ;
    }
    @FindBy(xpath = "//h1[@class='border-b-2 font-bold text-xl pb-5 mb-4 capitalize']" )
    private WebElement judulStatus;
    public String getJudulStatus(){
        return judulStatus.getText() ;
    }
    @FindBy(xpath = "//td[.='INV/MPL/215']")
    private WebElement noTransaksi ;
    public String getNoTransaksi(){
        return noTransaksi.getText();
    }
    @FindBy(xpath = "//td[.='2023-02-08 09:02 PM']")
    private WebElement tanggalTransaksi ;
    public String getTanggal(){
        return tanggalTransaksi.getText();
    }

    @FindBy(xpath = "//p[.='INV/MPL/215']")
    private WebElement codeTransaksi ;
    public String noTransaksiDetail(){
        return codeTransaksi.getText();
    }

    @FindBy(xpath ="//p[.='2023-02-08 09:02 PM']" )
    private WebElement tanggalDetail ;
    public String detailTanggal(){
        return tanggalDetail.getText() ;
    }
    @FindBy(css = ".p-5 > div:nth-of-type(4) .font-semibold")
    private WebElement item1 ;
    public boolean getItem1(){
        return item1.isDisplayed() ;
    }
    @FindBy(css = "div:nth-of-type(5) .font-semibold")
    private WebElement item2 ;
    public boolean getItem2(){
        return item2.isDisplayed() ;
    }
    @FindBy(css = "div:nth-of-type(6) .font-semibold")
    private WebElement item3 ;
    public boolean getItem3(){
        return item3.isDisplayed() ;
    }
    @FindBy(css = ".m-4 > p:nth-of-type(2)")
    private WebElement totalHarga ;
    public String getTotalHarga(){
        return totalHarga.getText();
    }
    @FindBy(xpath = "//button[@id='back']")
    private WebElement tombolBack ;
    public void clickBack(){
        tombolBack.click();
    }


}
