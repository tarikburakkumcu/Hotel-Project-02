package test.smokeTests.uS_0006;

import net.bytebuddy.asm.Advice;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class Tc_0003 {
    //3) "add HotelRoom" butonuna tıklanmalı ve "Create Hotelroom" yazısının görünürlüğü test edilmeli

    ReusableMethods reusableMethods=new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();



    @Test
    public void tC_0003(){
        reusableMethods.login();
        reusableMethods.hotelRooms();
        defaultPage.addHotelRoomBtn.click();
        Assert.assertTrue(defaultPage.createHotelRoomText.isDisplayed());
        Driver.closeDriver();


    }
}
