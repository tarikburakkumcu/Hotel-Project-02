package test.smokeTests.uS_0005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.util.Set;

public class TC_0006 extends TestBaseFinal{

    //6)"Ok" butonuna tıklanılabilmeli  ve otel bilgisi silinebilmeli

    DefaultPage defaultPage = new DefaultPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void tc_0005() throws InterruptedException {

        reusableMethods.login();
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelListLink.click();
        defaultPage.detailsHotelLinki.click();


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

        WebElement deleteButonu = Driver.getDriver().findElement(By.xpath("//button[@id='btnDelete']"));
        deleteButonu.click();


        WebElement okButonu = Driver.getDriver().findElement(By.xpath("//button[@data-bb-handler='confirm']"));
        okButonu.click();
        Thread.sleep(5000);

    }

    }
