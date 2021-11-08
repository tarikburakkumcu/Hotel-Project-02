package test.smokeTests.uS_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Driver;
import utilities.TestBaseFinal;

public class TC_0008 extends TestBaseFinal {


    /*
    9)"Reservation was made successfully
Your Reservation Link is : here" mesajini kullanici gormeli ve "here" butonu ile rezervasyon detaylarini inceleyebilmeli
     */
    @Test
    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0008 from uS_0010 ","Rezervasyon yapildiktan sonra kullanici gerekli bilgi yazilarini goruyor");

        Actions actions = new Actions(Driver.getDriver());
        MainPage mainPage = new MainPage();
        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();
        us_0010_qaConcortPage.loginAsNewUser();

        Thread.sleep(2000);
        String expectedOutputForNewAccount = "UserName : bilalkaya1";
        Assert.assertEquals(us_0010_qaConcortPage.checkForTrueLoginNewUser.getText(),expectedOutputForNewAccount,"giris yapilan hesap farkli");

        mainPage.roomsLink.click();

        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        actions.click(us_0010_qaConcortPage.rastgeleBirBookRoomsButtonu).perform();

        us_0010_qaConcortPage.kayitKismiCheckDateler();
        us_0010_qaConcortPage.kayitIcinKullanilanActions();
        extentTest.pass("rezervasyon kismi dolduruldu ve kayit alindi");

        Assert.assertTrue(us_0010_qaConcortPage.rezervationMadeSucessfulyYazisi.isDisplayed(),"rezervasyonda bir sorun var");

        Thread.sleep(2000);
        actions.click(us_0010_qaConcortPage.hereTextiRezervationPage).perform();

        Assert.assertTrue(us_0010_qaConcortPage.rezervasyonDetaylariButonu.getText().contains(us_0010_qaConcortPage.ReservationDetails),"rezervasyonunuz olusturulamadi");
        extentTest.pass("kullanici rezervasyon detaylarini gorebildi");
        Driver.closeDriver();
    }
}
