package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[@class='text-center text-[#306D75] font-bold text-5xl mb-11']")
    private WebElement titleLogin;
    @FindBy(id = "email")
    private WebElement akunEmail;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement akunPassword;
    @FindBy(id = "login")
    private WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='text-center text-[#306D75] font-bold text-5xl mb-11']")
    private WebElement judulLogin;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement loginSuccess;

    public String getTitleLogin(){
        return titleLogin.getText();
    }


    public void clickEmail() {
        akunEmail.click();
    }

    public void setEmail(String email) {
        akunEmail.sendKeys(email);
    }


    public void clickPassword() {
        akunPassword.click();
    }

    public void setPassword(String pwd) {
        akunPassword.sendKeys(pwd);
    }


    public void clickLogin() {
        btnLogin.click();
    }


    public boolean isDisplayed() {
        judulLogin.isDisplayed();
        return true;
    }

    public boolean berhasilLoginDisplayed() {
        loginSuccess.isDisplayed();
        return true;
    }
    public static void waitSeeModal(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='swal2-container swal2-center swal2-backdrop-show']")));
        }
        public static void clickOkSeeModal() {
            WebElement modalContainer = driver.findElement(By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-success animate__animated animate__fadeIn animate__faster']"));
            WebElement modalAcceptButton = modalContainer.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
            modalAcceptButton.click();
        }

    public static void waitSeeModalError(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='swal2-container swal2-center swal2-backdrop-show']")));
    }
    public static void clickOkSeeModalError() {
        WebElement modalContainer = driver.findElement(By.xpath("//div[@class='swal2-popup swal2-modal swal2-icon-error animate__animated animate__fadeIn animate__faster']"));
        WebElement modalAcceptButton = modalContainer.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
        modalAcceptButton.click();
    }

    }

