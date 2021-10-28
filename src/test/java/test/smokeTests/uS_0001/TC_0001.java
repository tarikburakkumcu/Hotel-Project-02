package test.smokeTests.uS_0001;

import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0001 {

    MainPage mainPage = new MainPage();

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        mainPage.loginLink.click();

    }

}
