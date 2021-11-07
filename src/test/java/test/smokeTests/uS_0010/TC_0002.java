package test.smokeTests.uS_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

public class TC_0002 extends TestBaseFinal {
    /*
    Anasayfadaki "Rooms" butonu gorunebilir ve kullanabilir olmali
     */

    @Test
    public void test1(){
        extentTest = extentReports.createTest("TC_0002 from uS_0010 ","Rooms butonu gorunur ve kullanabilir olmali");

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.roomsLink.isDisplayed(),"rooms linki gozukmuyor");
        extentTest.pass("rooms butonu gozukuyor");
        mainPage.roomsLink.click();
        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();

        Assert.assertTrue(US_0010_QAConcortPage.advancedText.isDisplayed(),"rooms linki calismiyor");
        extentTest.pass("rooms butonu calisiyor");
        extentTest.pass("tum testler sorunsuz calisiyor");
        Driver.closeDriver();


    }
}
