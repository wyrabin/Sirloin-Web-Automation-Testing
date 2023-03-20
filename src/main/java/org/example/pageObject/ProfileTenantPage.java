package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileTenantPage {
    public static WebDriver driver;

    public ProfileTenantPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@id='profil-tenant']")
    private WebElement menuProfileTenant;
    public void clickProfile(){
        menuProfileTenant.click();
    }
    @FindBy(xpath = "//h3[@class='font-bold text-2xl text-[#4AA3BA]']")
    private WebElement judulProfile ;
    public String getJudulProfile(){
        return judulProfile.getText() ;
    }
    @FindBy(xpath = "//h1[@class=' text-[#4AA3BA] font-bold text-4xl ']" )
    private WebElement namaToko ;
    public String getNamaToko(){
        return namaToko.getText();
    }

    @FindBy(css = "p:nth-of-type(1)")
    private WebElement emailToko ;
    public String getEmailToko(){
        return emailToko.getText() ;
    }

    @FindBy(css = "p:nth-of-type(2)")
    private WebElement nohpToko ;
    public String getNoHpToko(){
        return nohpToko.getText() ;
    }

    @FindBy(css = ".w-60")
    private WebElement alamatToko ;
    public String getAlamat(){
        return alamatToko.getText() ;
    }
    @FindBy(xpath = "//h3[@class='font-bold text-2xl m-10 text-[#4AA3BA]']")
    private WebElement titleUpdateProfile;
    public String getTitleUpdate(){
        return titleUpdateProfile.getText();
    }

    @FindBy(xpath ="//button[@id='edit-profile']" )
    private WebElement buttonEdit ;
    public void clickButtonEdit(){
        buttonEdit.click();
    }

    @FindBy(xpath = "//input[@id='business_name']")
    private WebElement placeNamaToko;
    public String getPlaceNamaToko(){
        return placeNamaToko.getText() ;
    }
    public void setNamaToko(String updateNamaToko){
        placeNamaToko.sendKeys(updateNamaToko);
    }
    public void updateNamaToko(String updateNamaToko){
        placeNamaToko.clear();
        placeNamaToko.sendKeys(updateNamaToko);
    }

    @FindBy(xpath = "//button[@id='save-profile']" )
    private WebElement saveButton;
    public void clickSave(){
        saveButton.click();
    }
    @FindBy(xpath = "//input[@id='phone_number']")
    private WebElement updatePhone ;
    public void updatePhoneNumber(String noHp){
        updatePhone.clear();
        updatePhone.sendKeys(noHp);
    }
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement editAlamat;
    public void updateAlamat(String alamat){
        editAlamat.clear();
        editAlamat.sendKeys(alamat);
    }

    @FindBy(xpath = "//button[@id='back']")
    private WebElement clickKembali ;
    public void setClickKembali(){
        clickKembali.click();
    }

    @FindBy(xpath = "//button[@id='back']" )
    private WebElement tombolKembali ;
    public void buttonBack(){
        clickKembali.click();
    }
    @FindBy(xpath = "//h3[@class='font-bold text-3xl text-[#4AA3BA]']")
    private WebElement judulProductToko ;
    public String judulProductToko(){
        return judulProductToko.getText();
    }

}
