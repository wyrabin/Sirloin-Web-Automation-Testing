package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTenantPage {
    public static WebDriver driver;

    public ProductTenantPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    String pathImage = System.getProperty("user.dir") + "\\src\\test\\resources\\image\\" ;
    @FindBy(xpath = "//span[.='Product']")
    private WebElement barProduct ;
    public void clickBarProduct(){
        barProduct.click();
    }

    @FindBy(xpath ="//h3[@class='font-bold text-2xl text-[#4AA3BA]']")
    private WebElement titleProductPage ;

    public String titleProductTenant(){
        return titleProductPage.getText();
    }

    @FindBy(xpath ="//h2[@class='swal2-title']" )
    private WebElement pesanSuccesLogin ;
    public String pesanLoginSukses(){
        return pesanSuccesLogin.getText() ;

    }
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okeButtonLogin;
    public void clickOkeButton(){
        okeButtonLogin.click();
    }

    @FindBy(xpath = "//button[@id='add-product']")
    private WebElement buttonTambahProduct ;
    public void clickTambahProduct(){
        buttonTambahProduct.click();
    }
    @FindBy(xpath = "//h3[@class='flex m-10 font-bold text-2xl text-[#4AA3BA]']")
    private WebElement titleTambahProduct ;
    public String getTitleAddProduct(){
        return titleTambahProduct.getText();
    }

    @FindBy(xpath = "//input[@id='product_image']" )
    private WebElement uploadFoto ;
    public void choosePhoto(){
        uploadFoto.sendKeys(pathImage+"abc.jpg");
    }
    public String textFoto(){
       return uploadFoto.getText();
    }

    public void pilihFoto(String photosName){
        uploadFoto.sendKeys(pathImage+photosName);
    }

    @FindBy(xpath = "//input[@id='upc']")
    private WebElement noBarcode ;
    public void setNoBarcode(String barcode){
        noBarcode.clear();
        noBarcode.sendKeys(barcode);
    }
    public String getPlaceBarcode(){
        return noBarcode.getText() ;
    }

    @FindBy(xpath = "//input[@id='category']")
    private WebElement inputKategori ;


    public void setInputKategori(String kategori){
        inputKategori.click();
        inputKategori.clear();
        inputKategori.sendKeys(kategori);
    }
    public String getPlaceKategori(){
        return inputKategori.getText() ;
    }

    @FindBy(xpath = "//input[@id='supplier']")
    private WebElement inputSuplier ;

    public void setInputSuplier(String suplier){
        inputSuplier.clear();
        inputSuplier.sendKeys(suplier);
    }
    public String getPlaceSuplier(){
        return inputSuplier.getText();
    }

    @FindBy(xpath = "//input[@id='product_name']")
    private WebElement inputProduct ;
    public void setInputProduct(String namaProduk){
        inputProduct.clear();
        inputProduct.sendKeys(namaProduk);
    }
    public String getPlaceProduct(){
        return inputProduct.getText();
    }

    @FindBy(xpath ="//input[@id='price']" )
    private WebElement inputHargaJual ;
    private WebElement editHargaJual ;

    public void setHargaJual(String hargaJual){
        inputHargaJual.clear();
        inputHargaJual.sendKeys(hargaJual);
    }
    public String getPlaceJual(){
        return inputHargaJual.getText();
    }

    @FindBy(xpath = "//input[@id='buying_price']")
    private WebElement inputHargaBeli;

    public void setHargaBeli(String hargaBeli){

        inputHargaBeli.clear();
        inputHargaBeli.sendKeys(hargaBeli);
    }
    public String getPlaceBeli(){
        return inputHargaBeli.getText();
    }
    @FindBy(xpath = "//input[@id='stock']")
    private WebElement inputStok;

    public void setStokProduk(String stokproduk){
        inputStok.clear();
        inputStok.sendKeys(stokproduk);
    }
    public String getPlaceStok(){
        return inputStok.getText();
    }
    @FindBy(xpath = "//input[@id='minimum_stock']" )
    private WebElement inputMinimumStok ;

    public void setMinimumStok(String minStok){
        inputMinimumStok.clear();
        inputMinimumStok.sendKeys(minStok);
    }
    public String getPlaceMinStok(){
        return inputMinimumStok.getText();
    }

    @FindBy(xpath = "//button[@id='save']")
    private WebElement buttonSave ;
    public void saveUpdate(){
        buttonSave.click();
    }
    public void clickSave(){
        buttonSave.click();
    }
    public void saveDisable(){
        System.out.println("Button simpan is enabled ? "+buttonSave.isEnabled());
    }

    @FindBy(xpath = "//tr[8]//button[2]")
    private WebElement buttonEdit ;
    public void clickEdit(){
        buttonEdit.click();
    }
    @FindBy(xpath ="//h3[@class='flex m-10 font-bold text-2xl text-[#4AA3BA]']")
    private WebElement titleEdit;
    public String getTitleEdit(){
        return titleEdit.getText();
    }


    @FindBy(xpath ="//div[@class='swal2-html-container']" )
    private WebElement getMessageEdit ;
    public String getSuccessEdit(){
        return getMessageEdit.getText() ;
    }
    @FindBy(xpath ="//button[@class='swal2-confirm swal2-styled swal2-default-outline']" )
    private WebElement okMessagge ;
    public void clickOk(){
        okMessagge.click();
    }
    @FindBy(xpath = "//input[@id='input-product']")
    private WebElement searchBarang;
    public void cariBarang(String barang){
        searchBarang.click();
        searchBarang.sendKeys(barang);
    }
    @FindBy(xpath = "//td[.='Kecap ABC']")
    private WebElement kecapABC ;
    public boolean getKecapABC(){
        return kecapABC.isDisplayed();
    }

    @FindBy(xpath = "//td[.='Kecap Bango']" )
    private WebElement kecapBango ;
    public boolean getKecapBango(){
        return kecapBango.isDisplayed();
    }





}
