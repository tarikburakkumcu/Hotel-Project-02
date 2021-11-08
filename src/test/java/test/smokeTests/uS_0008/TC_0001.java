package test.smokeTests.uS_0008;

import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

// 1) "https://qa-environment.concorthotel.com/" sitesinde bulunan 'LOG IN' butonu gorunur ve tiklanabilir olmali.

public class TC_0001 extends TestBaseFinal {
    @Test
    public void tc_0001() {
        extentTest= extentReports.createTest("TC_0001 Anasayfa'dan Login sayfasina gecis testi.","Login butonunun calistigini test eder.");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
        extentTest.pass("Login butonu calisir durumda.");
    }
}