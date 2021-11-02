package test.smokeTests.uS_0003;

import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.uS_0003_TestBaseRapor;

public class TC_0001 extends uS_0003_TestBaseRapor {
    @Test
    public void tc_0001(){
        extentTest= extentReports.createTest("tc_0001 Anasayfadan Login sayfasına geçiş testi","login linkinin çalıdığını test eder");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("istenen adrese gidildi");
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
        extentTest.info("login linkine tiklandi");
    }

}
