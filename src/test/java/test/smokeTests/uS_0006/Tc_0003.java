package test.smokeTests.uS_0006;

import net.bytebuddy.asm.Advice;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import javax.swing.*;

public class Tc_0003 extends TestBaseFinal {
    //3) "add HotelRoom" butonuna tıklanmalı ve "Create Hotelroom" yazısının görünürlüğü test edilmeli

    @Test
    public void tC_0003(){
        DefaultPage defaultPage=new DefaultPage();
        extentTest= extentReports.createTest("tC_0003 Hotel ekleme sayfasına geçiş testi","Add Hotel Rooms butonunun calistigini test eder. ");

        ReusableMethods.login();
        extentTest.info("Sayfaya gidip Login yapıldı");

        ReusableMethods.hotelRooms();
        extentTest.info("HotelRooms sayfasına gidildi");

        defaultPage.addHotelRoomBtn.click();
        extentTest.info("add Hotel Room butonuna tıklandı");
        Assert.assertTrue(defaultPage.createHotelRoomText.isDisplayed());
        extentTest.pass("Create Hotelroom yazısı görüldü");
        Driver.closeDriver();


    }
}
