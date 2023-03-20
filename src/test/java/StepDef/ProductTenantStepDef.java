package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.ProductTenantPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class ProductTenantStepDef {

    private WebDriver webDriver;
    public ProductTenantStepDef(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @When("^user login with input \"([^\"]*)\" as email and \"([^\"]*)\" as password$")
    public void userInputAsEmailAndAsPassword(String email, String pass) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(email);
        loginPage.setPassword(pass);
        loginPage.clickLogin();
        Thread.sleep(4000);
    }

    @And("^user click menu product$")
    public void userClickMenuProduct() throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.clickBarProduct();
        Thread.sleep(4000);

    }

    @Then("^verify title menu is \"([^\"]*)\"$")
    public void verifyTitleMenuIs(String titleProdukPage)  {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(titleProdukPage, productTenant.titleProductTenant());
        System.out.println(titleProdukPage);

    }

    @And("^verify succes login title \"([^\"]*)\"$")
    public void verifySuccesLoginTitle(String pesanSukses) throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(pesanSukses, productTenant.pesanLoginSukses());
        System.out.println(pesanSukses);
        Thread.sleep(1000);
        productTenant.clickOkeButton();

    }

    @And("^user click button Tambah Product$")
    public void userClickButtonTambahProduct() {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.clickTambahProduct();

    }


    @And("^user should be redirect \"([^\"]*)\" page$")
    public void userShouldBeRedirectPage(String judulAddProduct) throws Throwable {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(judulAddProduct, productTenant.getTitleAddProduct());
        System.out.println(judulAddProduct);
        Thread.sleep(3000);
    }

    @Given("^user choose photos from directory$")
    public void userChoosePhotosFromDirectory() throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.choosePhoto();

    }

    @And("^user input nomor barcode \"([^\"]*)\"$")
    public void userInputNomorBarcode(String inputBarcode) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setNoBarcode(inputBarcode);

    }
    @And("^user input kategory product \"([^\"]*)\"$")
    public void userInputKategoryProduct(String inputKategori)  {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setInputKategori(inputKategori);

    }

    @And("^user input supplier \"([^\"]*)\"$")
    public void userInputSupplier(String inputSuplier) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setInputSuplier(inputSuplier);
    }

    @And("^user input nama product \"([^\"]*)\"$")
    public void userInputNamaProduct(String productName) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setInputProduct(productName);

    }

    @And("^user input harga jual \"([^\"]*)\"$")
    public void userInputHargaJual(String hargajual) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setHargaJual(hargajual);
    }

    @And("^user input harga beli \"([^\"]*)\"$")
    public void userInputHargaBeli(String hargabeli) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setHargaBeli(hargabeli) ;
    }

    @And("^user input stok product \"([^\"]*)\"$")
    public void userInputStokProduct(String stokProduk) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setStokProduk(stokProduk);

    }

    @And("^user input minimum stok \"([^\"]*)\"$")
    public void userInputMinimumStok(String minStok) throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setMinimumStok(minStok);
        Thread.sleep(2000);
    }

    @Then("^user click simpan button$")
    public void userClickSimpanButton() throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.clickSave();
        Thread.sleep(5000);
    }

    @Given("^user choose photos from directory with file name \"([^\"]*)\"$")
    public void userChoosePhotosFromDirectoryWithFileName(String namafoto)  {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.pilihFoto(namafoto);

    }

    @And("^Button simpan is disable$")
    public void buttonSimpanIsDisable() {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.saveDisable();
    }

    @Then("^user click button edit for oreo$")
    public void userClickButtonEditForKecapABC() throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.clickEdit();
        Thread.sleep(4000);

    }


    @And("^user redirect to edit product and verify title is \"([^\"]*)\"$")
    public void userRedirectToEditProductAndVerifyTitleIs(String juduledit) throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(juduledit, productTenant.getTitleEdit());
        System.out.println(juduledit);
        Thread.sleep(3000);
    }

    @Then("^user update foto kecap \"([^\"]*)\"$")
    public void userUpdateFotoKecap(String updateNamaFoto) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.pilihFoto(updateNamaFoto);
    }

    @And("^user edit kategori kecap \"([^\"]*)\"$")
    public void userEditKategoriKecap(String editKategori) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setInputKategori(editKategori);
    }

    @And("^user edit product name \"([^\"]*)\"$")
    public void userEditProductName(String editProduct) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setInputProduct(editProduct);
    }

    @And("^user update stock product \"([^\"]*)\"$")
    public void userUpdateStockProduct(String updateStok) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setStokProduk(updateStok);
    }

    @And("^user edit minimum stock barang \"([^\"]*)\"$")
    public void userEditMinimumStockBarang(String minStok) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setMinimumStok(minStok);
    }

    @And("^user update harga jual \"([^\"]*)\"$")
    public void userUpdateHargaJual(String hargaJual) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setHargaJual(hargaJual);
    }

    @And("^user update harga beli \"([^\"]*)\"$")
    public void userUpdateHargaBeli(String hargaBeli) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setHargaBeli(hargaBeli);
    }

    @And("^user click button simpan on edit page$")
    public void userClickButtonSimpanOnEditPage() throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.clickSave();
        Thread.sleep(3000);
    }

    @And("^user get message success edit \"([^\"]*)\"$")
    public void userGetMessageSuccessEdit(String suksesPesan) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(suksesPesan, productTenant.getSuccessEdit());
        productTenant.clickOk();

    }

    @And("^user get message failed \"([^\"]*)\"$")
    public void userGetMessageFailedEdit(String failedPesan) {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        Assert.assertEquals(failedPesan, productTenant.getSuccessEdit());
        productTenant.clickOk();
    }

    @And("^user edit barcode with number already used in another product \"([^\"]*)\"$")
    public void userEditBarcodeWithNumberAlreadyUsedInAnotherProduct(String editBarcode){
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.setNoBarcode(editBarcode);

    }

    @Then("^user input \"([^\"]*)\" from fitur search product tenant$")
    public void userInputFromFiturSearchProductTenant(String searchProduct) throws InterruptedException {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.cariBarang(searchProduct);
        Thread.sleep(1000);

    }

    @And("^product first name with value Kec displayed$")
    public void productFirstNameWithValueKecDisplayed() {
        ProductTenantPage productTenant = new ProductTenantPage(webDriver);
        productTenant.getKecapABC();
        productTenant.getKecapBango();

    }
}
