package test.smokeTests.uS_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0002 extends TestBaseFinal {



    //2) "Hotel Management" butonuna tıklanıp "Hotel Rooms" butonuna tıklanmalı "LIST OF HOTELROOMS" yazısının görülebilir olmalı
    @Test
    public void tC_0002(){
        DefaultPage defaultPage=new DefaultPage();
        extentTest= extentReports.createTest("tC_0002 Login sayfasından Hotel Rooms gecis testi","Hotel Rooms butonunun calistigini test eder. ");


        ReusableMethods.login();
        extentTest.info("Sayfaya gidip Login yapıldı");
        ReusableMethods.hotelRooms();
        extentTest.info("HotelRooms sayfasına gidildi");
        Assert.assertTrue(defaultPage.listOfHotelRooms.isDisplayed());
        extentTest.pass("ListOfHotelRooms yazısının görüldü");

    }
}
