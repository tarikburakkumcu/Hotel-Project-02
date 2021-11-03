package test.smokeTests.uS_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0005 {
    /*
    TC_0005-Us_0010 5)Anasayfadaki Login butonu, acilan sayfadaki Create a new Account butonu gorunur ve calisir olmali
     */

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.loginLink.isDisplayed(),"login butonu gorunmuyor");
        mainPage.loginLink.click();

        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();


        Assert.assertTrue(us_0010_qaConcortPage.createANewAccountButton.isDisplayed(),"Create a new account butonu gorunmuyor");

        us_0010_qaConcortPage.createANewAccountButton.click();

        String registerLinki = "https://qa-environment.concorthotel.com/Account/Register";

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(registerLinki),"Create a new account butonu calismiyor");


        Driver.closeDriver();


    }

}
