package test.smokeTests.uS_0008;

import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

// 4) 'Hotel Management' menusunun altinda 'Room Reservations' butonu gorunur ve kullanilabilir olmali.

public class TC_0004 extends TestBaseFinal {

    ReusableMethods reusableMethods=new ReusableMethods();

    @Test
    public void tc_0004() {

        extentTest = extentReports.createTest("TC_0004 Room Reservations butonu testi.", "ListOfUsers sayfasinda soldaki listede 'Room Reservations' butonunun calisabilirligi.");
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

        //-------------------------

        defaultPage.roomReservationLinki.click();
        extentTest.pass("'Room Reservations' butonu calisir durumda.");
    }
}
