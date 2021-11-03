package test.smokeTests.uS_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0003 {
    /*
    TC_0003-Us_0010 3)"Advanced Search" kismi gorunur ve altindaki fonsiyonlar kullanilabilir  olmali
     */
    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.roomsLink.click();

        Actions actions = new Actions(Driver.getDriver());

        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();
        Assert.assertTrue(US_0010_QAConcortPage.advancedText.isDisplayed(),"Advanced search yazisi gorunmuyor ");

        US_0010_QAConcortPage.checkinDate.click();
        US_0010_QAConcortPage.checkinDate.clear();
        US_0010_QAConcortPage.checkinDate.sendKeys("12/12/2021");
        actions.sendKeys(Keys.TAB).sendKeys("12/18/2021")
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        String roomsLinki = "https://qa-environment.concorthotel.com/";

        Assert.assertFalse(Driver.getDriver().getCurrentUrl().equals(roomsLinki),"search butonunda bir problem var");







    }


}
