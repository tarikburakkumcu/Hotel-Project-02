package test.smokeTests.uS_0008;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

// 2) 'LOG IN' sayfasinda 'username' ve 'password' textbox'lari ile 'log in' butonu gorunur ve kullanilabilir olmali.

public class TC_0002 extends TestBaseFinal {

    @Test
    public void tc_0002() {
        extentTest = extentReports.createTest("TC_0002 username, password, Log in elementleri testi.", "Login sayfasindaki 'username', 'password' textbox'lari ile 'Log in' butonunun calisabilirligi.");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.loginLink.click();
        extentTest.pass("Login butonu calisir durumda.");

        //-------------------------

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.pass("username textbox'i calisir durumda.");
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.pass("password textbox'i calisir durumda.");
        loginPage.loginButton.click();
        extentTest.pass("Log in butonu calisir durumda.");
    }
}
