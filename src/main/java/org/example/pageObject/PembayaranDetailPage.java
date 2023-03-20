package org.example.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PembayaranDetailPage {
    public static WebDriver driver;

    public PembayaranDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3[@class='font-bold text-2xl text-[#4AA3BA] m-5']")
    private WebElement titleDetailPembayaran;


    public String getTitleDetailPembayaran() {
        return titleDetailPembayaran.getText();
    }

    public boolean isDisplayDetailPembayaran() {
        titleDetailPembayaran.isDisplayed();
        return true;
    }

    @FindBy(css = "td:nth-of-type(1)")
    private static WebElement namaProduct;
    @FindBy(css = "td:nth-of-type(2)")
    private static WebElement qty;
    @FindBy(css = "td:nth-of-type(3)")
    private static WebElement harga;


    public String verifyNamaProduct() {
        return namaProduct.getText();
    }

    public String verifyQty() {
        return qty.getText();
    }

    public String verifyHarga() {
        return harga.getText();
    }

    @FindBy(css = ".text-end > p:nth-of-type(1)")
    private static WebElement totalBelanjaTotal;
    @FindBy(css = ".text-end > p:nth-of-type(2)")
    private static WebElement diskonMember;

    @FindBy(css = ".text-end > .font-bold")
    private static WebElement totalBelanja;

    public String verifyTotalBelanjaProduct(){
        return totalBelanjaTotal.getText();
    }
    public String verifyDiskonMember(){
        return diskonMember.getText();
    }

    public String verifyTotalBelanja(){
        return totalBelanja.getText();
    }

    @FindBy(id = "chose-payment")
    public WebElement selectContainer;

    public void selectPembayaranContainer(String sortPembayaranList) {
        Select a = new Select(selectContainer);
        Select b = new Select(selectContainer);
        Select c = new Select(selectContainer);
        Select d = new Select(selectContainer);

        a.selectByVisibleText(sortPembayaranList);
        b.selectByVisibleText(sortPembayaranList);
        c.selectByVisibleText(sortPembayaranList);
        d.selectByVisibleText(sortPembayaranList);
    }

    public static void waitSeeModal(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".swal2-container")));
    }
    public static void clickOkSeeModal() {
        WebElement modalContainer = driver.findElement(By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-success animate__animated animate__fadeIn animate__faster']"));
        WebElement modalAcceptButton = modalContainer.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
        modalAcceptButton.click();
    }
    public static void waitSeeModalScaBarcode(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".swal2-container")));
    }
    public static void clickOkSeeModalScanBarcode() {
        WebElement modalContainer = driver.findElement(By.cssSelector(".swal2-popup']"));
        WebElement modalAcceptButton = modalContainer.findElement(By.cssSelector("//button[@class='swal2-confirm swal2-styled swal2-default-outline']']"));
        modalAcceptButton.click();
    }

    public static void waitSeeModalScanGagal(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".swal2-container")));
    }
    public static void clickOkSeeModalScanGagal() {
        WebElement modalContainer = driver.findElement(By.cssSelector(".swal2-popup']"));
        WebElement modalAcceptButton = modalContainer.findElement(By.cssSelector("//button[@class='swal2-confirm swal2-styled swal2-default-outline']']"));
        modalAcceptButton.click();
    }
    @FindBy(xpath = "//input[@id='cart_quantity']")
    private WebElement inputQunatity ;
    public void setQuantity(String jumlah){
        inputQunatity.click();
        inputQunatity.clear();
        inputQunatity.sendKeys(jumlah);
    }

    @FindBy(css="//h2[@class='swal2-title']")
    private WebElement gagal ;
    public boolean modalGagal(){
        return gagal.isDisplayed() ;
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okGagal ;
    public void clickOkGagal(){
        okGagal.click();
    }




}







