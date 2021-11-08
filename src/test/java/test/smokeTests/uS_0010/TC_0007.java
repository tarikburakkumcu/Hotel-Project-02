package test.smokeTests.uS_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Driver;
import utilities.TestBaseFinal;


public class TC_0007 extends TestBaseFinal {

    /*
    7)Otel odasi secildikten sonra acilan Rezervasyon
    bolumundeki tarih, kalacak kisi sayisi gibi kriterler gorunur ve kullanilabilir olmali
     */

    @Test
    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0007 from uS_0010 ","Rezervasyon kismi gorunuyor ve kullanilabiliyor");


        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();
        Faker faker = new Faker();
        MainPage mainPage = new MainPage();

        us_0010_qaConcortPage.loginAsNewUser();

        Thread.sleep(2000);
        String expectedOutputForNewAccount = "UserName : bilalkaya1";
        Assert.assertEquals(us_0010_qaConcortPage.checkForTrueLoginNewUser.getText(),expectedOutputForNewAccount,"giris yapilan hesap farkli");
        extentTest.pass("hesaba giris yapilabiliyor");
        mainPage.roomsLink.click();

        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(1400);
        actions.sendKeys(Keys.ARROW_DOWN).click(us_0010_qaConcortPage.rastgeleBirBookRoomsButtonu).perform();

        us_0010_qaConcortPage.kayitKismiCheckDateler();
        us_0010_qaConcortPage.kayitIcinKullanilanActions();
        extentTest.pass("rezervasyon butonlari calisiyor");

        Driver.closeDriver();
    }
}
