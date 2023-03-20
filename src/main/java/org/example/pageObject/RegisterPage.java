package org.example.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public static WebDriver driver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[@class='text-center text-[#306D75] font-bold text-5xl mb-11']")
    private WebElement judulLogin;

    public boolean judulIsDisplayed() {
        judulLogin.isDisplayed();
        return true;
    }

    @FindBy(id = "to-register")
    private WebElement toRegister;

    public void clickToRegister() {
        toRegister.click();
    }

    @FindBy(id = "business-name")
    private WebElement namaToko;

    public void clickNamaToko() {
        namaToko.click();
    }

    public void setNamaToko(String toko) {
        namaToko.sendKeys(toko);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement registerEmail;

    public void clickRegisterEmail() {
        registerEmail.click();
    }

    public void setRegisterEmail(String email) {
        registerEmail.sendKeys(email);
    }

    @FindBy(id = "password")
    private WebElement registerPassword;

    public void clickRegisterPassword() {
        registerPassword.click();
    }

    public void setRegisterPassword(String passDaftar) {
        registerPassword.sendKeys(passDaftar);
    }

    @FindBy(id = "number-hp")
    private WebElement setNumberHp;

    public void clickNumberHp() {
        setNumberHp.click();
    }

    public void setNumberHp(String noHp) {
        setNumberHp.sendKeys(noHp);
    }

    @FindBy(id = "address")
    private WebElement setAddress;

    public void clickAddress() {
        setAddress.click();
    }

    public void setAlamat(String alamat) {
        setAddress.sendKeys(alamat);
    }

    @FindBy(id = "register")
    private WebElement registerUser;

    public void clickRegister() {
        registerUser.click();
    }

    public void registerDisable() {
        System.out.println("Button is enabled ? "+registerUser.isEnabled());
    }

    @FindBy(xpath = "//div[@class='swal2-container swal2-center swal2-backdrop-show']")
    private WebElement modal;
    public boolean popModal(){
        modal.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement judulModal ;
    public String getJudulModal(){
        return judulModal.getText();
    }

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement messageModal ;
    public String getPesanModal(){
        return messageModal.getText();
    }

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement clickModalOk;
    public void setClickModalOk(){
        clickModalOk.click();
    }

    @FindBy(xpath = "//p[@id='to-login']")
    private WebElement loginOnRegister ;
    public void clickLoginOnRegister(){
        loginOnRegister.click();
    }

    @FindBy(xpath ="//h1[@class='text-center text-[#306D75] font-bold text-5xl mb-11']")
    private WebElement titleLogin ;
    public String getTitleLogin(){
        return titleLogin.getText();
    }
}