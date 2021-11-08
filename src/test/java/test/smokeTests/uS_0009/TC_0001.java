package test.smokeTests.uS_0009;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefaultPage;

import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0001 extends TestBaseFinal {
    //1-https://qa-environment.concorthotel.com/ sayfasına gidin
//2-Sağ üstteki "Login"butonuna tıklayın
//3-"Username" butonuna geçerli bir username girin
//4-"Password" butonuna geçerli bir password girin
//5-"Login" Butonuna tıklayın
//6-"Hotel Management" menüsüne tıklayın
//7-"Room reservatioon" butonuna tıklayın
//8-Cıkan sayfada "LIST OF HOTELROOMS" yazısının görüldüğünü doğrulayın



    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void test() throws InterruptedException {


extentTest=extentReports.createTest("TC_0001 Anasayfadan Hotel Management sayfasına geçiş testi", "Login linkinin calıştıgını test eder");

        extentTest.info("istenen adrese gidilir");
        ReusableMethods.login();
        extentTest.pass("istenen adrese gidildi");

        //6-"Hotel Management" menüsüne tıklayın

        extentTest.info("hotel management linki tıklanır");
        defaultPage.hotelManagementLinki.click();
        extentTest.pass("hotel management linki acıldı");

        //7-"Room reservatioon" butonuna tıklayın

        Thread.sleep(2000);

        extentTest.info("room reservation linki tıklanır");
        defaultPage.roomReservationLinki.click();
        extentTest.pass("room reservation linki acıldı");

        //8-Cıkan sayfada "LIST OF HOTELROOMS" yazısının görüldüğünü doğrulayın

        extentTest.info("list of hotelroom butonu goruldugu kontrol edilir");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(defaultPage.listOfRoomReservation.isDisplayed());
        extentTest.pass("list of hotelroom butonu görüldü");
        softAssert.assertAll();


    }

}
