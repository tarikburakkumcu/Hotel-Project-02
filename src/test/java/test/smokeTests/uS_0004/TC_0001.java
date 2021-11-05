package test.smokeTests.uS_0004;

import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0001 extends TestBaseFinal {

    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void TC0001(){

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


    }


}
