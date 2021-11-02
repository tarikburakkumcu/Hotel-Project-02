package test.smokeTests.uS_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0004 {
    /*
    TC_0004-Us_0010 4)"Rooms" kismina tiklandiktan sonra "Categories" kismi gorunur ve onun altinda bulunan kategoriler kullanilabilir olmali
     */
    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.roomsLink.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(2000);

        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();

        Assert.assertTrue(US_0010_QAConcortPage.categoriesText.isDisplayed(),"categories yazisi gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.singleButton.isDisplayed(),"single butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.doubleButton.isDisplayed(),"double butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.tripleButton.isDisplayed(),"triple butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.quadButton.isDisplayed(),"quad butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.queenButton.isDisplayed(),"queen butonu gozukmuyor");

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(2000);

        Assert.assertTrue(US_0010_QAConcortPage.kingButton.isDisplayed(),"king butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.twinButton.isDisplayed(),"twin butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.doubleDoubleButton.isDisplayed(),"double-double butonu gozukmuyor");
        Assert.assertTrue(US_0010_QAConcortPage.studioButton.isDisplayed(),"studio butonu gozukmuyor");

        Driver.closeDriver();
    }

    @Test
    public void test2() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.roomsLink.click();

        Actions actions = new Actions(Driver.getDriver());
        US_0010_QAConcortPage US_0010_QAConcortPage = new US_0010_QAConcortPage();


        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(1000);
        US_0010_QAConcortPage.singleButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Single buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.doubleButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Double buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.tripleButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Triple buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.quadButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Quad buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.queenButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Queen buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.kingButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"King buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.twinButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Twin buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.doubleDoubleButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Double-double buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();
        Thread.sleep(1200);
        US_0010_QAConcortPage.studioButton.click();
        Thread.sleep(1200);
        Assert.assertFalse(mainPage.roomsLink.equals(Driver.getDriver().getCurrentUrl()),"Studio buttonu calismiyor");
        US_0010_QAConcortPage.geriGitmeTusu();

        Driver.closeDriver();
    }
}
