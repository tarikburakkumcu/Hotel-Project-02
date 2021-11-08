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

public class TC_0003 extends TestBaseFinal {

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
    //11-"Date Start",  tarihini update edin
    //12-"Save" butonuna tıklayıp, kaydedildiğinden emin olun



    DefaultPage defaultPage=new DefaultPage();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test public void test() throws InterruptedException {
        extentTest=extentReports.createTest("TC_0003 Anasayfadan Room Reservation sayfasına gecis testi", "reservation secilebildigini test eder");

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
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", defaultPage.searchButonu);
      defaultPage.searchButonu.click();
        extentTest.pass("search butonu tıklandı");
        Thread.sleep(2000);

        //10-Cıkan sonucu "Details" butonuna tıklayarak secin
        extentTest.info("cıkan sonucun Details butonu tıklanarak secilir");
      defaultPage.detailsButonu.click();
        js.executeScript("window.scrollBy(0,600)");
        extentTest.pass("cıkan sonucun Details butonu tıklanarak secildi");

        //11-"Date Start",  tarihini update edin
        extentTest.info("Date Start takvimine verilen datayı girin");
        defaultPage.dateStart.clear();
        defaultPage.dateStart.sendKeys(ConfigReader.getProperty("dateStart"));

        js.executeScript("window.scrollBy(0,600)");
        extentTest.pass("Date Start takvimine verilen data girildi");

        //12-"Save" butonuna tıklayıp, kaydedildiğinden emin olun
        extentTest.info("Save butonuna tıklanır");
        defaultPage.generalDataSaveButonu.click();
        extentTest.pass("Save butonuna tıklandı");
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertAll();

    }

}
