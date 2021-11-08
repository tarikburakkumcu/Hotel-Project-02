package test.smokeTests.uS_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;


public class TC_0001 extends TestBaseFinal {
    /*
    TC_0001-Us_0010 1)Anasayfadaki "Our Rooms" kısmı gorunebilir olmali, altindaki
     "View Room Details" butonlari gorunur ve kullanilabilir olmali
     */

    @Test
    public void test1() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0001 from uS_0010 ","Our rooms ve view room details butonlari gorunur olmali");

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.pass("sayfanin ilgili bolumune gidiliyor");

        Thread.sleep(1000);

        Assert.assertTrue(US_0010_QAConcortPage.ourRoomsText.isDisplayed(),"our rooms text yazisi gozukmuyor");
        extentTest.pass("our rooms butonunun gorunurlugu test ediliyor");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails1.isDisplayed(),"view room details 1. butonu gozukmuyor");

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails2.isDisplayed(),"view room details 2. butonu gozukmuyor");

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails3.isDisplayed(),"view room details 3. butonu gozukmuyor");
        extentTest.pass("view rooms butonlarinin gorunurlugu test ediliyor");

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails4.isDisplayed(),"view room details 4. butonu gozukmuyor");

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails5.isDisplayed(),"view room details 5. butonu gozukmuyor");

        Assert.assertTrue(US_0010_QAConcortPage.viewRoomDetails6.isDisplayed(),"view room details 6. butonu gozukmuyor");

        extentTest.pass("butun butonlar gorundu");

        Driver.closeDriver();
    }

    @Test
    public void test2() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0001 from uS_0010 ","Our rooms ve view room details butonlarini kullanilabilir olmali");


        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();


        US_0010_QAConcortPage.viewRoomDetails1.click();

        Thread.sleep(1500);
        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 1 butonunda sorun var");
        Thread.sleep(2000);
        US_0010_QAConcortPage.geriGitmeTusu();
        extentTest.pass("ilk buton calisti");


        Thread.sleep(1500);


        US_0010_QAConcortPage.viewRoomDetails2.click();
        extentTest.pass("ikinci buton calisti");

        Thread.sleep(1500);
        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 2 butonunda sorun var");
        Thread.sleep(2000);
        US_0010_QAConcortPage.geriGitmeTusu();

        Thread.sleep(1500);

         US_0010_QAConcortPage.viewRoomDetails3.click();
        extentTest.pass("ucuncu buton calisti");

        Thread.sleep(1500);
        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 3 butonunda sorun var");
        Thread.sleep(2000);
        US_0010_QAConcortPage.geriGitmeTusu();

        Thread.sleep(1500);

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        US_0010_QAConcortPage.viewRoomDetails4.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500);
        extentTest.pass("dorduncu buton calisti");



        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 4 butonunda sorun var");
        US_0010_QAConcortPage.geriGitmeTusu();

        Thread.sleep(1500);

        US_0010_QAConcortPage.viewRoomDetails5.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);
        extentTest.pass("besinci buton calisti");

        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 5 butonunda sorun var");
        Thread.sleep(2000);
        US_0010_QAConcortPage.geriGitmeTusu();

        Thread.sleep(1500);

         US_0010_QAConcortPage.viewRoomDetails6.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        extentTest.pass("altinci buton calisti");

        Assert.assertTrue(US_0010_QAConcortPage.availableRoom.isDisplayed(),"view room details 6 butonunda sorun var");
        Thread.sleep(2000);

        extentTest.pass("tum butonlar sorunsuz calisti");

        Driver.closeDriver();
    }
}
