package test.smokeTests.uS_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0002 extends TestBaseFinal {

    /*
    Navbar'da bulunan butonlar kullaniciyi ilgili sayfaya yonlendirmeli.
     */

    MainPage mainPage;


    @Test
    public void tC_0002 () throws InterruptedException {

        MainPage mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0002 Test For Elements At Navigation Part","Elements At The Navigation Part Should Navigate User To The Relevant Page");
        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");
        Thread.sleep(1000);
        SoftAssert softAssert = new SoftAssert();
        mainPage.homeLink.click();
        extendTest.info("Click home link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Home"),"Test for navigation of 'Home Button' is failed!");
        extendTest.pass("User is navigated to the home page");
        mainPage.roomsLink.click();
        extendTest.info("Click rooms link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Rooms"),"Test for navigation of 'Rooms Button' is failed!");
        extendTest.pass("User is navigated to the rooms page");
        mainPage.restaurantLink.click();
        extendTest.info("Click restaurant link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Restaurant"),"Test for navigation of 'Restaurant Button' is failed!");
        extendTest.pass("User is navigated to the restaurant page");
        mainPage.aboutLink.click();
        extendTest.info("Click about link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("About"),"Test for navigation of 'About Button' is failed!");
        extendTest.pass("User is navigated to the about page");
        mainPage.blogLink.click();
        extendTest.info("Click blog link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Blog"),"Test for navigation of 'Blog Button' is failed!");
        extendTest.pass("User is navigated to the blog page");
        mainPage.contactLink.click();
        extendTest.info("Click contact link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Contact"),"Test for navigation of 'Contact Button' is failed!");
        extendTest.pass("User is navigated to the contact page");
        mainPage.loginLink.click();
        extendTest.info("Click log in link");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Log in"),"Test for navigation of 'Log in Button' is failed!");
        extendTest.pass("User is navigated to the log in page");
        softAssert.assertAll();

    }
}
