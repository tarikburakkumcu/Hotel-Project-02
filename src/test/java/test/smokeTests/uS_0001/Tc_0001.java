package test.smokeTests.uS_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0001 extends TestBaseFinal {

    /*
    Home, Rooms, Restaurant, About, Blog, Contact, ve Log in butonlari gorunur olmali.
     */

    MainPage mainPage;


    @Test
    public void tC_0001 (){

        mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0001 Test For Elements At Navigation Part","Elements At The Navigation Part Should Be Visible");
        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.homeLink.isDisplayed(),"Test for visibility of 'Home Button' is failed!");
        extendTest.pass("Home link is visible");
        softAssert.assertTrue(mainPage.roomsLink.isDisplayed(),"Test for visibility of 'Rooms Button' is failed!");
        extendTest.pass("Rooms link is visible");
        softAssert.assertTrue(mainPage.restaurantLink.isDisplayed(),"Test for visibility of 'Restaurant Button' is failed!");
        extendTest.pass("Restaurant link is visible");
        softAssert.assertTrue(mainPage.aboutLink.isDisplayed(),"Test for visibility of 'About Button' is failed!");
        extendTest.pass("About link is visible");
        softAssert.assertTrue(mainPage.blogLink.isDisplayed(),"Test for visibility of 'Blog Button' is failed!");
        extendTest.pass("Blog link is visible");
        softAssert.assertTrue(mainPage.contactLink.isDisplayed(),"Test for visibility of 'Contact Button' is failed!");
        extendTest.pass("Contact link is visible");
        softAssert.assertTrue(mainPage.loginLink.isDisplayed(),"Test for visibility of 'Log in Button' is failed!");
        extendTest.pass("Login link is visible");
        softAssert.assertAll();
    }
}
