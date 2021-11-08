package test.smokeTests.uS_0005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.nio.ByteBuffer;
import java.util.Set;

public class TC_0004 extends TestBaseFinal {
    //4)"Hotel was updated successfully" Yazısı görebilmeli ve "Ok" Butonu tıklanılabilmeli

    DefaultPage defaultPage = new DefaultPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void tc_0004() throws InterruptedException {

        extentTest= extentReports.createTest("tc_0004 Değişiklikler başarılı bir şekilde save edilebilmeli ","Ok Butonuna tıklanıldı.");
        reusableMethods.login();
        extentTest.info("Siteye giriş yapıldı");
        defaultPage.hotelManagementLinki.click();
        extentTest.info("HotelManagement'e tıklanıldı");
        defaultPage.hotelListLink.click();
        extentTest.info("Hotel Listte tıklanıldı");
        defaultPage.detailsHotelLinki.click();
        extentTest.info("Details sayfasına tıklanıldı.");


        System.out.println("ilk sayfanin handle değeri :" + Driver.getDriver().getWindowHandle());
        String ilkSayfaninHandleDegeri = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowHandlelari = Driver.getDriver().getWindowHandles();
        System.out.println("Tum Handlelar : " + tumWindowHandlelari);

        String ikinciWindowHandleDegeri = "";
        for (String each : tumWindowHandlelari) {
            if (!each.equals(ilkSayfaninHandleDegeri)) {
                ikinciWindowHandleDegeri = each;
            }
        }

        System.out.println("ikinci sayfa handle değeri :" + ikinciWindowHandleDegeri);
        Driver.getDriver().switchTo().window(ikinciWindowHandleDegeri);


        WebElement saveButonu = Driver.getDriver().findElement(By.xpath("//button[@class='btn green'][1]"));
        saveButonu.click();
        extentTest.info("Save Butonuna tıklanıldı.");


        Thread.sleep(3000);
        String uptadeYazisi = Driver.getDriver().findElement(By.xpath("//div[@class='bootbox-body']")).getText();
        String expectedResult ="Hotel was updated successfully";
        Assert.assertEquals(uptadeYazisi,expectedResult,"Update yazısı birbiriyle uyuşmuyor");
        extentTest.info("Değişiklikler Başarılı bir şekilde kayıt edildi");

        WebElement okButonu = Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[6]"));
        okButonu.click();
        extentTest.info("Ok Butonuna tıklanıldı.");


    }

}
