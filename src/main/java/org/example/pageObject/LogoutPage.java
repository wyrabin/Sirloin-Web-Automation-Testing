package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver driver;

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement messageLogout ;
    public String getMessageLogout(){
        return messageLogout.getText() ;
    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement buttonOk ;
    public void clickOk(){
        buttonOk.click();
    }
    @FindBy(xpath = "//a[@id='logout']")
    private WebElement clickLogout ;
    public void clickLogout(){
        clickLogout.click();
    }
}
