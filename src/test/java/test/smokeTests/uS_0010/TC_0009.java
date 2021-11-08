package test.smokeTests.uS_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Driver;
import utilities.TestBaseFinal;

public class TC_0009 extends TestBaseFinal {
/*
09)"here" butonu kullanmayacak kullanicilar icin "OK" butonu gorunur ve calisir olmali
 */

    @Test
    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0009 from uS_0010 ",
                "Rezervasyon yapildiktan sonra kullanici ok tusuna basabiliyor, rezervasyon detaylarini gormuyor");

        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();
        us_0010_qaConcortPage.loginAsNewUser();

        Thread.sleep(2000);
        String expectedOutputForNewAccount = "UserName : bilalkaya1";
        Assert.assertEquals(us_0010_qaConcortPage.checkForTrueLoginNewUser.getText(),expectedOutputForNewAccount,"giris yapilan hesap farkli");

        MainPage mainPage = new MainPage();
        mainPage.roomsLink.click();

        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN).click(us_0010_qaConcortPage.rastgeleBirBookRoomsButtonu).perform();
        Thread.sleep(1000);
        actions.click(us_0010_qaConcortPage.rastgeleBirBookRoomsButtonu).perform();

        us_0010_qaConcortPage.kayitKismiCheckDateler();
        us_0010_qaConcortPage.kayitIcinKullanilanActions();
        extentTest.pass("rezervasyon icin bilgiler dolduruldu");

        Assert.assertTrue(us_0010_qaConcortPage.rezervationMadeSucessfulyYazisi.isDisplayed(),"rezervasyonda bir sorun var");
        extentTest.pass("rezervasyon yapildi");

        Thread.sleep(2000);
        actions.click(us_0010_qaConcortPage.okButtoninRezervationPage).perform();
        Thread.sleep(2000);

        Assert.assertTrue(us_0010_qaConcortPage.rezervasyonDetaylariButonuWithOk.getText().contains(us_0010_qaConcortPage.ReservationDetailsJustClickOk),
                "rezervasyonunuz olusturulamadi");
        extentTest.pass("rezervasyon yapildi ve ok butonuna basildi");

        Driver.closeDriver();
    }
}
