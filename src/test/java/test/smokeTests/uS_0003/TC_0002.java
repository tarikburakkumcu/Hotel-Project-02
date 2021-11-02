package test.smokeTests.uS_0003;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.uS_0003_TestBaseRapor;

public class TC_0002 extends uS_0003_TestBaseRapor {
    @Test
    public void tc_0002(){
        extentTest= extentReports.createTest("tc_0002 Login sayfasındaki creat a new account butonu testi","creat a new account butonunun çalıdığını test eder");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("istenen adrese gidildi");
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
        extentTest.info("login linkine tiklandi");
        LoginPage loginPage=new LoginPage();
        loginPage.creatButton.click();
        extentTest.info("Login sayfasındaki creat a new account butonuna tiklandi");
    }
}
