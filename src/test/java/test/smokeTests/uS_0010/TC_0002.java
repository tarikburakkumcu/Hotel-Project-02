package test.smokeTests.uS_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0002 {
    /*
    Anasayfadaki "Rooms" butonu gorunebilir ve kullanabilir olmali
     */

    @Test
    public void test1(){


        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.roomsLink.isDisplayed(),"rooms linki gozukmuyor");

        mainPage.roomsLink.click();
        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();

        Assert.assertTrue(US_0010_QAConcortPage.advancedText.isDisplayed(),"rooms linki calismiyor");

        Driver.closeDriver();


    }
}
