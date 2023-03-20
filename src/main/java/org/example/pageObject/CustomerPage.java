package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    public static WebDriver driver;

    public CustomerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@id='customer']")
    private WebElement menuCustomer ;
    public void clickCustomer(){
        menuCustomer.click();
    }
    @FindBy(xpath = "//h3[@class='font-bold text-2xl text-[#4AA3BA]']")
    private WebElement titleCustomer ;
    public String getTitleCustomer(){
        return titleCustomer.getText() ;
    }

    @FindBy(xpath ="//h3[@class='flex m-10 font-bold text-2xl text-[#4AA3BA]']")
    private WebElement getTambahCustomer ;
    public String getTitleTambahCustomer(){
        return getTambahCustomer.getText() ;
    }
    @FindBy(xpath = "//button[@id='back']")
    private WebElement buttonKembali ;
    public void clickKembali(){
        buttonKembali.click();
    }
    @FindBy(xpath = "//button[@id='add-custumer']" )
    private WebElement buttonAddCustomer ;
    public void clickAddCustomer(){
        buttonAddCustomer.click();
    }

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement getPesanSukses ;
    public String getSuksesPesan(){
        return getPesanSukses.getText();
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement clickOk;
    public void setClickOk(){
        clickOk.click();
    }
    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaCustomer ;
    public void setNamaCustomer(String nama){
        namaCustomer.sendKeys(nama);
    }
    public void editNama(String editNama){
        namaCustomer.clear();
        namaCustomer.sendKeys(editNama);
    }
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailCustomer;
    public void setEmailCustomer(String email){
        emailCustomer.sendKeys(email);
    }
    public void editEmail(String emailEdit){
        emailCustomer.clear();
        emailCustomer.sendKeys(emailEdit);
    }

    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement phoneCustomer;
    public void setPhoneCustomer(String noHp){
        phoneCustomer.clear();
        phoneCustomer.sendKeys(noHp);
    }
    public void editNoHp(String hp){
        phoneCustomer.clear();
        phoneCustomer.sendKeys(hp);
    }
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement alamatCustomer ;
    public void setAlamatCustomer(String alamat){
        alamatCustomer.sendKeys(alamat);
    }
    public void editAlamat(String editAlamat){
        alamatCustomer.clear();
        alamatCustomer.sendKeys(editAlamat);
    }
    @FindBy(xpath = "//button[@id='save']")
    private WebElement tombolSave ;
    public void clickSave(){
        tombolSave.click();
    }
    public void saveDisable(){
        System.out.println("Button is enabled ? : "+tombolSave.isEnabled());
    }
    @FindBy(xpath = "//tbody[1]/tr[1]//button[@class='btn btn-ghost btn-square']")
    private WebElement editMukhlis;
    public void clickEdit(){
        editMukhlis.click();
    }

    @FindBy(xpath = "//button[@id='save-customer']")
    private WebElement saveEdit ;
    public void clickSimpanEdit(){
        saveEdit.click();
    }
    @FindBy(xpath = "//button[@id='save']")
    private WebElement saveNew;
    public void clickSaveNew(){
        saveNew.click();
    }
}
