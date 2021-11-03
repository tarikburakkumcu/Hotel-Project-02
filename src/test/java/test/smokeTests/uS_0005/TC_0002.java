package test.smokeTests.uS_0005;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class TC_0002 {

  //  2)"Details" butonuna tıklanılabilmeli ve çıkan sayfada "Edit hotel" yazısı kontrol edilmeli

    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage = new DefaultPage();

    @Test
    public void tc_0002() {
        reusableMethods.login();
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelListLink.click();
        defaultPage.detailsHotelLinki.click();

        System.out.println("ilk sayfanin handle değeri :" + Driver.getDriver().getWindowHandle());
        String ilkSayfaHandle=Driver.getDriver().getWindowHandle();

        Set <String> tumWindowHandlelari = Driver.getDriver().getWindowHandles();
        System.out.println("Tum Handlelar : " + tumWindowHandlelari );

        String ikinciWindowhandle="";
        for (String each:tumWindowHandlelari
        ) {
            if (!each.equals(ilkSayfaHandle)){
                ikinciWindowhandle=each;
            }
        }

        System.out.println("ikinci sayfa handle degeri : " + ikinciWindowhandle);
        Driver.getDriver().switchTo().window(ikinciWindowhandle);

        String EditHotelYazisi = Driver.getDriver().findElement(By.xpath("/html//form[@id='edit-form']/div/div[@class='portlet-title']/div[@class='caption']")).getText();
        String expectedResult ="Edit Hotel";
        Assert.assertEquals(EditHotelYazisi,expectedResult,"Edit Hotel yazısı birbiriyle uyuşmadı");





    }
}