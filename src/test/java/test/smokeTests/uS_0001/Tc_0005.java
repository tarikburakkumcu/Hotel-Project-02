package test.smokeTests.uS_0001;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0005 extends TestBaseFinal {

    /*
    Welcome to our hotel bolumu gorunur olmali.
     */

    MainPage mainPage;


    @Test
    public void tC_0005 ()  {

        mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0005 Test For Welcome to Our Hotel Part","Welcome to Our Hotel part should be visible");

        ReusableMethods.goToUrl();
        ReusableMethods.scrollTo(mainPage.welcomeToOurHotelPart);
        Assert.assertTrue(mainPage.welcomeToOurHotelPart.isDisplayed());
        extendTest.pass("Welcome to Our Hotel part is visible");
    }
}
