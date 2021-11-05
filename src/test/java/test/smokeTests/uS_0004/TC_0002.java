package test.smokeTests.uS_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0002 extends TestBaseFinal {

    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void TC0002() {

        /*
        https://qa-environment.concorthotel.com/ sayfasına gidiniz
        Sağ üstteki "Login"butonuna tıklayın
        "Username" butonuna geçerli bir username girin
        "Password" butonuna geçerli bir password girin
        "Login" Butonuna tıklayın
        */

        extentTest= extentReports.createTest("tc_0001 Anasayfadan Login sayfasına gider, username ve password girer ve login linkine tıklar"," username, pasword ile siteye giriş yapıldıgını test eder");

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

    }
}
