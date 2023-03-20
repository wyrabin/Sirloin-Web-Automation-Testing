package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtalaseBelanjaPage {
    public static WebDriver driver;

    public EtalaseBelanjaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@id='etalase-belanja']")
    private WebElement buttonEtalase ;
    public void clickMenuEtalase(){
        buttonEtalase.click();
    }
    @FindBy(xpath ="//h3[@class='font-bold text-3xl text-[#4AA3BA]']" )
    private WebElement judulEtalase;
    public String getJudulEtalase(){
        return judulEtalase.getText();
    }

    @FindBy(xpath = "//div[@class='grid grid-cols-4  gap-4 mt-20 sm:grid-cols-2 lg:grid-cols-4']/div[1]//button[@class='btn tracking-wider btn-sm w-32 bg-[#4AA3BA] border-none']")
    private WebElement beliItem1 ;
    public void clickBeliItem1(){
        beliItem1.click();
    }
    @FindBy(xpath = "//div[@class='grid grid-cols-4  gap-4 mt-20 sm:grid-cols-2 lg:grid-cols-4']/div[2]//button[@class='btn tracking-wider btn-sm w-32 bg-[#4AA3BA] border-none']")
    private WebElement beliItem2 ;
    public void clickBeliItem2(){
        beliItem2.click();
    }
    @FindBy(xpath = "//p[.='Mentega']")
    private WebElement getItem1 ;
    public boolean getItem1(){
        getItem1.isDisplayed();
        return true ;
    }

    @FindBy(xpath = "//p[.='Gula Pasir']")
    private WebElement getItem2 ;
    public boolean getItem2(){
        getItem1.isDisplayed();
        return true ;
    }
    @FindBy(xpath = "//button[@id='inc-product']")
    private WebElement clickInc ;
    public void setClickInc(){
        for (int i=0; i<10 ; i++){
            clickInc.click();
        }
    }
    @FindBy(xpath = "//button[@id='dec-product']")
    private WebElement clickDec ;
    public void setClickDec(){
        for (int i=0; i<6 ; i++){
            clickDec.click();
        }
    }
    @FindBy(xpath = "//input[@id='cart_quantity']" )
    private WebElement totalItem ;
    public boolean getTotalItem(){
        totalItem.isDisplayed();
        return true ;
    }

    @FindBy(xpath = "//button[@id='order']")
    private WebElement clickBayar;
    public void clickBayar(){
        clickBayar.click();
    }
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement getTotal ;
    public String getTotal(){
        return getTotal.getText();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement clickOrder;
    public void clickOrder(){
        clickOrder.click();
    }
    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled swal2-default-outline']")
    private WebElement clickCancel;
    public void clickCancel(){
        clickCancel.click();
    }
    @FindBy(css = "#del-product")

    private WebElement buttonDelete ;
    public void buttonDelete(){
        buttonDelete.click();
    }
    @FindBy(xpath = "//p[.='Mentega']")
    private WebElement cekItem;
    public boolean cekItem(){
        return cekItem.isDisplayed() ;
    }



}
