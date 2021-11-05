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
       reusableMethods.login();

       //  "Hotel Management" menüsüne tıklayın
       defaultPage.hotelManagementLinki.click();
       // "Hotel List" menüsüne tıklayın
       defaultPage.hotelListLink.click();
       //"Add Hotel" Buttonuna tıklayın
       defaultPage.addHotelLink.click();




    }


}
