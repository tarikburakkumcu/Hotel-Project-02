package test.smokeTests.uS_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Tc_0002 {

    ReusableMethods reusableMethods=new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void tC_0002(){

        //2) "Hotel Management" butonuna tıklanıp "Hotel Rooms" butonuna tıklanmalı "LIST OF HOTELROOMS" yazısının görülebilir olmalı

        reusableMethods.login();
        reusableMethods.hotelRooms();
        Assert.assertTrue(defaultPage.listOfHotelRooms.isDisplayed());
        Driver.closeDriver();
    }
}
