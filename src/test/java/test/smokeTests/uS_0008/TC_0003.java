package test.smokeTests.uS_0008;

import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

// 3) Log in olduktan sonra acilan pencerede 'Hotel Management' butonu gorunur ve tiklanabilir olmali.



public class TC_0003 extends TestBaseFinal {

    ReusableMethods reusableMethods=new ReusableMethods();

    @Test
    public void tc_0003() {
        extentTest = extentReports.createTest("TC_0003 Hotel Management butonu testi.", "ListOfUsers sayfasinda soldaki listede 'Hotel Management' butonunun calisabilirligi.");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.loginLink.click();

        if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
            reusableMethods.goToUrl();
            mainPage.loginLink.click();
        }
        extentTest.pass("Login butonu calisir durumda.");

        //-------------------------

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.pass("username textbox'i calisir durumda.");
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.pass("password textbox'i calisir durumda.");
        loginPage.loginButton.click();
        extentTest.pass("Log in butonu calisir durumda.");

        //-------------------------

        DefaultPage defaultPage = new DefaultPage();
        defaultPage.hotelManagementLinki.click();
        extentTest.pass("'Hotel Management' butonu calisir durumda.");
    }
}
