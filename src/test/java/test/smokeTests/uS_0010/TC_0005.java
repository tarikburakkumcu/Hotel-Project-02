package test.smokeTests.uS_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

public class TC_0005 extends TestBaseFinal {
    /*
    TC_0005-Us_0010 5)Anasayfadaki Login butonu, acilan sayfadaki Create a new Account butonu gorunur ve calisir olmali
     */

    @Test
    public void test(){
        extentTest = extentReports.createTest("TC_0005 from uS_0010 ","Login ve create a new Account butonu calisiyor");

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();

        Assert.assertTrue(mainPage.loginLink.isDisplayed(),"login butonu gorunmuyor");
        mainPage.loginLink.click();

        extentTest.pass("login butonu gorunuyor");

        Assert.assertTrue(us_0010_qaConcortPage.createANewAccountButton.isDisplayed(),"Create a new account butonu gorunmuyor");

        us_0010_qaConcortPage.createANewAccountButton.click();
        extentTest.pass("create a new Account butonu gorunuyor");

        String registerLinki = "https://qa-environment.concorthotel.com/Account/Register";

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(registerLinki),"Create a new account butonu calismiyor");
        extentTest.pass("create a new Account butonu calisiyor");

        Driver.closeDriver();
    }
}
