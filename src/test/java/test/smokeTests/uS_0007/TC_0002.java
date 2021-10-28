package test.smokeTests.uS_0007;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class TC_0002 {
//Menüden "Hotel Management'' ardından "Hotel Rooms''butonuna tıklanılabilmeli ve Çıkan sayfada "LIST OF HOTELROOMS" yazısı görülmeli
//    1) https://qa-environment.concorthotel.com URL'ine gidilir.
//    2) Navbar'da bulunan Login butonuna tiklanir.
//    3) "Username" butonuna geçerli bir username girilir
//    4) "Password" butonuna geçerli bir password girilir
//    5) "Login" Butonuna tıklanır
    ReusableMethods reusableMethods = new ReusableMethods();
    @Test
    public void test1(){
    reusableMethods.login();
}
//    6) "Hotel Management" menüsüne tıklanır
//    7) "Hotel Rooms''butonuna tıklanır
//    8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
    @Test
    public void test2(){
    reusableMethods.hotelRooms();
}

}
