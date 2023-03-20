package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuperAdminPage {
    public static WebDriver driver;

    public LoginSuperAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h3[@class='font-bold text-3xl text-[#4AA3BA]']")
    private WebElement judulSuperAdmin;
    public String getJudulAdmin(){
        return judulSuperAdmin.getText();
    }

    @FindBy(xpath = "//span[.='Home']")
    private WebElement fiturHome ;
    public String getHome(){
        return fiturHome.getText() ;
    }
    @FindBy(xpath = "//span[.='Product']")
    private WebElement fiturProduct ;
    public String getProduct(){
        return fiturProduct.getText();
    }
    @FindBy(xpath = "//span[.='Laporan Penjualan']")
    private WebElement laporanPenjualan ;
    public String getLaporan(){
        return laporanPenjualan.getText() ;
    }
    @FindBy(xpath = "//span[.='Profile Super Admin']")
    private WebElement profileAdmin ;
    public String getProfile(){
        return profileAdmin.getText();
    }

    @FindBy(xpath = "//span[.='Log Out']")
    private WebElement logout ;
    public String getLogout(){
        return logout.getText() ;
    }

}
