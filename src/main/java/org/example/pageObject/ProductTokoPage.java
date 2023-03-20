package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductTokoPage {
    public static WebDriver driver;

    public ProductTokoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3[@class='font-bold text-3xl text-[#4AA3BA] mb-20']")
    private WebElement titleKeranjang;


    public String getKeranjang() {
        return titleKeranjang.getText();
    }

    @FindBy(xpath = "//h3[@class='font-bold text-3xl text-[#4AA3BA]']")
    private WebElement titleProductToko;


    public String getTitleProductToko() {
        return titleProductToko.getText();
    }

    public boolean isDisplayed() {
        titleProductToko.isDisplayed();
        return true;
    }

    @FindBy(css = ".grid-cols-4 > div:nth-of-type(1)")
    private static WebElement itemProduct;

    public static void clickProduct() {
        itemProduct.click();
    }

    @FindBy(xpath = "//p[.='Kecap ABC']")
    private static WebElement getProduct;

    public static boolean getProduct() {
        getProduct.isDisplayed();
        return true;
    }

    @FindBy(css = ".grid-cols-4 > div:nth-of-type(4)")
    private static WebElement itemProduct2;

    public static void clickProduct2() {
        itemProduct2.click();
    }

    @FindBy(xpath = "//p[.='Minyak Fortune']")
    private static WebElement getProduct2;

    public static boolean getProduct2() {
        getProduct2.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//div[@class='md:text-xs lg:text-base']/div[1]//button[@id='inc-product']")
    private WebElement clickInc;

    public void setClickInc() {
        for (int i = 0; i < 20; i++) {
            clickInc.click();
        }

    }


    @FindBy(xpath = "//div[@class='md:text-xs lg:text-base']/div[1]//button[@id='dec-product']")
    private WebElement clickDec;

    public void setClickDec() {
        for (int i = 0; i < 10; i++) {
            clickDec.click();

        }
    }

    @FindBy(css = ".font-medium.w-full > .p-10 > div > div:nth-of-type(1) #del-product")
    private static WebElement buttonDel;

    public static void buttonDel() {
        buttonDel.click();
    }

    @FindBy(id = "customer_id")
    private WebElement noMember;

    public void clickInputMember() {
        noMember.click();
    }

    public void setNoMember(String member) {
        noMember.sendKeys(member);
    }

    @FindBy(id = "select-member")
    private WebElement btnMember;

    public void clickMember() {
        btnMember.click();
    }

    @FindBy(css = ".py-10 > div:nth-of-type(1) > p:nth-of-type(2)")
    private static WebElement subTotal;
    @FindBy(css = ".py-10 > div:nth-of-type(2) > p:nth-of-type(2)")
    private static WebElement diskonMember;
    @FindBy(css = ".py-10 > div:nth-of-type(3) > p:nth-of-type(2)")
    private static WebElement totalBelanja;


    public String verifySubTotal() {
        return subTotal.getText();
    }

    public String verifyPriceDiskonMember() {
        return diskonMember.getText();
    }

    public String verifyPriceTotalBelanja() {
        return totalBelanja.getText();
    }

    @FindBy(xpath = "//button[@id='order']")
    private static WebElement buttonBayar;

    public static void buttonBayar() {
        buttonBayar.click();
    }

    @FindBy(id = "input-product")
    private WebElement searchBarang;

    public void clickInputBarang() {
        searchBarang.click();
    }

    public boolean isDisplayInputBarang() {
        return searchBarang.isDisplayed();
    }

    public void setSearchBarang(String barang) {
        searchBarang.sendKeys(barang);
    }

    @FindBy(id = "cart_quantity")
    private WebElement inputCartQuantity;

    public void clickCartQuantity() {
        inputCartQuantity.click();
    }

    public void setInputCartQuantity(String quantity) {
        inputCartQuantity.sendKeys(quantity);
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

    @FindBy(xpath = "//button[@id='inc-product']]")
    private WebElement clickIncMore;

    public void setClickIncMore() {
        for (int i = 0; i < 80; i++) {
            clickInc.click();
        }
    }

}




































