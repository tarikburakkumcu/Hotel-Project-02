package test.smokeTests.uS_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;

import utilities.ReusableMethods;

public class TC_0001 {
    //1-https://qa-environment.concorthotel.com/ sayfasına gidin
//2-Sağ üstteki "Login"butonuna tıklayın
//3-"Username" butonuna geçerli bir username girin
//4-"Password" butonuna geçerli bir password girin
//5-"Login" Butonuna tıklayın
//6-"Hotel Management" menüsüne tıklayın
//7-"Room reservatioon" butonuna tıklayın
//8-Cıkan sayfada "LIST OF HOTELROOMS" yazısının görüldüğünü doğrulayın


    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void test() throws InterruptedException {

        reusableMethods.login();


        //6-"Hotel Management" menüsüne tıklayın


        defaultPage.hotelManagementLinki.click();

        //7-"Room reservatioon" butonuna tıklayın

        Thread.sleep(2000);

        defaultPage.roomReservationLinki.click();

        //8-Cıkan sayfada "LIST OF HOTELROOMS" yazısının görüldüğünü doğrulayın

        Assert.assertTrue(defaultPage.listOfRoomReservation.isDisplayed());

    }

}
