package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CustomerPage;
import org.example.pageObject.EtalaseBelanjaPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EtalaseProductSteps {
    private WebDriver webDriver;
    public EtalaseProductSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }
    @Then("^user click Etalase belanja menu$")
    public void userClickEtalaseBelanjaMenu() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickMenuEtalase();
    }

    @And("^user should be on \"([^\"]*)\"$")
    public void userShouldBeOn(String juduletalase) throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        Assert.assertEquals(juduletalase,etalaseBelanjaPage.getJudulEtalase());
        Thread.sleep(3000);
    }


    @Then("^user click button beli first item$")
    public void userClickButtonBeliFirstItem() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickBeliItem1();
    }

    @And("^verify first item appeared on keranjang feature$")
    public void verifyFirstItemAppearedOnKeranjangFeature() throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.getItem1() ;
        Thread.sleep(1000);
    }

    @And("^user click button beli second item$")
    public void userClickButtonBeliSecondItem() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickBeliItem2();
    }

    @And("^verify second item appeared on keranjang feature$")
    public void verifySecondItemAppearedOnKeranjangFeature() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.getItem2() ;
    }

    @And("^user click button increment ten times$")
    public void userClickButtonTenTimes() throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.setClickInc();
        Thread.sleep(1000);
    }

    @And("^user click button decrement six times$")
    public void userClickButtonSixTimes() throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.setClickDec();
        Thread.sleep(1000);
    }

    @Then("^value total items is five$")
    public void valueTotalItemsIs() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.getTotalItem();

    }

    @Then("^user click button bayar$")
    public void userClickButtonBayar() throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickBayar();
        Thread.sleep(2000);

    }

    @And("^user verify total payment$")
    public void userVerifyTotalPayment() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        System.out.println(etalaseBelanjaPage.getTotal());
    }

    @And("^user click order button and redirect payment method$")
    public void userClickOrderButton() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickOrder();
    }

    @And("^user click cancel button$")
    public void userClickCancelButton() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.clickCancel();
    }

    @And("^user click delete button on keranjang fields$")
    public void userClickDeleteButtonOnKeranjangFields() throws InterruptedException {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        etalaseBelanjaPage.buttonDelete();
        Thread.sleep(1000);

    }

    @And("^item is deleted$")
    public void itemIsDeleted() {
        EtalaseBelanjaPage etalaseBelanjaPage = new EtalaseBelanjaPage(webDriver);
        System.out.println("Produk displayed ? : "+etalaseBelanjaPage.cekItem());
    }
}
