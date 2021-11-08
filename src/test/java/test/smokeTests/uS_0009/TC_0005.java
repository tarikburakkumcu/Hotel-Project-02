package test.smokeTests.uS_0009;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefaultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0005 extends TestBaseFinal {
    //1-https://qa-environment.concorthotel.com/ sayfasına gidin
    //2-Sağ üstteki "Login"butonuna tıklayın
    //3-"Username" butonuna geçerli bir username girin
    //4-"Password" butonuna geçerli bir password girin
    //5-"Login" Butonuna tıklayın
    //6-"Hotel Management" menüsüne tıklayın
    //7-"Room reservatioon" butonuna tıklayın
    //8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın
    //9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın
    //10-Cıkan sonucu "Details" butonuna tıklayarak secin
    //11-"Delete" box tıklayın
    //12-reservation ın silindiğinden emin olun


    DefaultPage defaultPage = new DefaultPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test() throws InterruptedException {
        extentTest=extentReports.createTest("TC_0005 Secilen reservationun silinebilmesi testi", "reservation delete yapılır");

        extentTest.info("istenen adrese gidilir");
        ReusableMethods.login();
        extentTest.pass("istenen adrese gidildi");

        //6-"Hotel Management" menüsüne tıklayın
        extentTest.info("hotel management linki tıklanır");
        defaultPage.hotelManagementLinki.click();
        extentTest.pass("hotel management linki acıldı");

        //7-"Room reservatioon" butonuna tıklayın
        extentTest.info("room reservation linki tıklanır");
        defaultPage.roomReservationLinki.click();
        extentTest.pass("room reservation linki acıldı");

        //8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın
        extentTest.info("contactNameSurname butonuna istenen data girilir");
        defaultPage.contactNameSurnameKutusu.sendKeys(ConfigReader.getProperty("contactNameSurname"));
        actions.click(defaultPage.contactNameSurnameKutusuGecis).perform();
        extentTest.pass("contactNameSurname butonuna istenen data girildi");

        // 9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın
        extentTest.info("search butonu tıklanır");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", defaultPage.searchButonu);
        actions.click(defaultPage.searchButonu).perform();
        extentTest.pass("search butonu tıklandı");
        Thread.sleep(1000);

        //10-Cıkan sonucu "Details" butonuna tıklayarak secin
        extentTest.info("cıkan sonucun Details butonu tıklanarak secilir");
        actions.click(defaultPage.detailsButonu).perform();
        extentTest.pass("cıkan sonucun Details butonu tıklanarak secildi");

        //11-Sayfayı asagı kaydırarak "Delete" box tıklayın
        extentTest.info("Delete butonu tıklanır");


        js.executeScript("window.scrollBy(0,600)");
        defaultPage.deleteButonu.click();
        extentTest.pass("Delete butonu tıklandı");

        //12-reservation ın silindiğinden emin olun
        SoftAssert softAssert=new SoftAssert();
       extentTest.info("reservation silinir");
        softAssert.assertTrue(defaultPage.propertiesSaveButonuOnay.isDisplayed());

       extentTest.pass("reservation silinmedi, Delete butonu calısmıyor");
        softAssert.assertAll();
    }
}