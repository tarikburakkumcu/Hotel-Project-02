package test.smokeTests.uS_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_0001 {

//Menüden "Hotel Management'' ardından "Hotel Rooms''butonuna tıklanılabilmeli ve Çıkan sayfada "LIST OF HOTELROOMS" yazısı görülmeli
//    1) https://qa-environment.concorthotel.com URL'ine gidilir.
//    2) Navbar'da bulunan Login butonuna tiklanir.
//    3) "Username" butonuna geçerli bir username girilir
//    4) "Password" butonuna geçerli bir password girilir
//    5) "Login" Butonuna tıklanır
ReusableMethods reusableMethods = new ReusableMethods();
    @Test
    public void test() throws InterruptedException {
    reusableMethods.login();
//    6) "Hotel Management" menüsüne tıklanır
     DefaultPage defaultPage=new DefaultPage();
     defaultPage.hotelManagementLinki.click();
//    7) "Hotel Rooms''butonuna tıklanır
     defaultPage.hotelRoomsLinki.click();
//    8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
        Assert.assertTrue(defaultPage.listOfHotelRooms.isDisplayed());
        Thread.sleep(3000);
        //Driver.closeDriver();
    }

}