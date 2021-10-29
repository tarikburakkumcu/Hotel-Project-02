package test.smokeTests.uS_0003;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0002 {

    @Test
    public void tc_002(){
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
        LoginPage loginPage=new LoginPage();
        loginPage.creatButton.click();
    }
}
