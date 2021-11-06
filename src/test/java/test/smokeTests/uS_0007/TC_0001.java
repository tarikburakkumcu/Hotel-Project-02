package test.smokeTests.uS_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0001 extends TestBaseFinal {

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
    extentTest= extentReports.createTest("TC_0001 Anasayfadan Hotelrooms sayfasına geçiş testi","Hotelrooms sayfasına geçişi test eder");

//    6) "Hotel Management" menüsüne tıklanır
     DefaultPage defaultPage=new DefaultPage();
     defaultPage.hotelManagementLinki.click();
        extentTest.info("Hotel Management dropdownu tıklandı");
//    7) "Hotel Rooms''butonuna tıklanır
     defaultPage.hotelRoomsLinki.click();
        extentTest.info("Hotel Rooms butonuna tıklandı");
//    8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
        Assert.assertTrue(defaultPage.listOfHotelRooms.isDisplayed());
        Thread.sleep(3000);
        extentTest.info("LIST OF HOTELROOMS sayfası açıldı");
        //Driver.closeDriver();
    }

}