package test.smokeTests.uS_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0005 extends TestBaseFinal {

    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage = new DefaultPage();

    @Test
    public void TC0005() throws InterruptedException {
        extentTest= extentReports.createTest("tc_0005 Otel id bilgisi ve otel tipi girer ve search butonuna tıklar"," otel id ve otel tipi girilerek unique  giriş yapıldıgını test eder");

        reusableMethods.login();
        extentTest.info("istenen sayfaya gidildi");
        //  "Hotel Management" menüsüne tıklayın
        defaultPage.hotelManagementLinki.click();
        extentTest.info("hotel management linkine tıklandı");
        // "Hotel List" menüsüne tıklayın
        defaultPage.hotelListLink.click();
        extentTest.info("hotel list linkine tıklandı");
        //"Add Hotel" Buttonuna tıklayın
        defaultPage.addHotelLink.click();
        extentTest.info(" addHotel  linkine tıklandı");

        defaultPage.addHotelCodeKutusu.sendKeys("1453");

        /*
        "Name" kutucuğuna tıklayıp bir İsim giriniz
        "Adress" kutucuğuna tıklayıp Adres giriniz
         "Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
        "Mail" kutucuğuna tıklayıp Email Adresi giriniz

        */

        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).
                sendKeys("Fatih Otel").
                sendKeys(Keys.TAB).
                sendKeys("Fatih Caddesi Fetih Sok No:145/3 Fatih/İstanbul").
                sendKeys(Keys.TAB).
                sendKeys("05514531453").
                sendKeys(Keys.TAB).
                sendKeys("fatih1453@gmail.com").perform();
        extentTest.info("Yönetici eklenecek otel name,adress,phone ve mail bilgileri girdi");

        // "idGroup" dropdown butonuna tıklayıp Grup seçiniz

        Select select = new Select(defaultPage.idGroupHotelEkle);
        select.selectByVisibleText("Hotel Type2");
        extentTest.info("Yönetici olarak otel tipi konusunda secim yapıldı");
        ReusableMethods.waitFor(1);
        //"Save" butonuna tıklayın
        defaultPage.addHotelSaveButonu.click();
        extentTest.info("Otel kayıt butonuna tıklandı");

        ReusableMethods.waitFor(1);

        String addHotelExpectedAlertYazisi="Hotel was inserted successfully";
        String addHotelActualAlertYazisi= Driver.getDriver().findElement(By.xpath("//div[@class='bootbox-body']")).getText();

        Assert.assertEquals(addHotelActualAlertYazisi,addHotelExpectedAlertYazisi,"unique bir add Hotel kaydi yapilamamistir");
        extentTest.info("Hotel was inserted successfully yazısının görünürlüğü test edildi");

        defaultPage.okButonu.click();
        extentTest.info("Ok butonuna tıklandı");

        ReusableMethods.waitFor(1);
        Actions actions1=new Actions(Driver.getDriver());
        actions1.
                sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(1);

        //otel list linkini tıklayın

        defaultPage.hotelListLink.click();
        extentTest.info("Hotel List  menüsüne tıklandı");
        ReusableMethods.waitFor(1);

        //"İd" kutusuna otel kayıt yaptığınız otel "id" giriniz
        defaultPage.otelListidCheck.sendKeys("2434");
        extentTest.info("Kayıt oldugumuz id numarası kutucuga girildi ");


        Select select1 = new Select(defaultPage.idGroupSearch);
        select1.selectByVisibleText("Hotel Type2");
        extentTest.info("Yönetici olarak otel tipi konusunda secim yapıldı");
        // "Search" butonuna tıklayın
        defaultPage.hotelSearchButton.click();
        extentTest.info("(Yönetici olarak otel tipi konusunda secim yapıldı");
        //unique bir kaydın yapılıp yapılmadıgını dogrulayın

        String addHotelExpectedResult="|Found total 1 records";
        String addHotelActualResult= Driver.getDriver().findElement(By.xpath("//*[text()='Found total 1 records']")).getText();

        Assert.assertEquals(addHotelActualResult,addHotelExpectedResult,"unique bir add Hotel kaydi yapilamamistir");
        extentTest.info("Yönetici olarak unique bir kaydın yapıldıgı dogrulandı");

    }
}

