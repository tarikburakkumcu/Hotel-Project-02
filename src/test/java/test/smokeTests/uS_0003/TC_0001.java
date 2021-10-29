package test.smokeTests.uS_0003;

import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0001 {
    @Test
    public void tc_0001(){
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
    }

}
