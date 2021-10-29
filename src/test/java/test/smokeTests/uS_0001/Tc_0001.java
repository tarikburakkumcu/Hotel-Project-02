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

public class Tc_0001 {

    /*
    Home, Rooms, Restaurant, About, Blog, Contact, ve Log in butonlari gorunur olmali.
     */

    MainPage mainPage = new MainPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void tC_0001 (){

        reusableMethods.login();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(mainPage.homeLink.isDisplayed(),"Test for visibility of 'Home Button' is failed!");
//        softAssert.assertTrue(mainPage.roomsLink.isDisplayed(),"Test for visibility of 'Rooms Button' is failed!");
//        softAssert.assertTrue(mainPage.restaurantLink.isDisplayed(),"Test for visibility of 'Restaurant Button' is failed!");
//        softAssert.assertTrue(mainPage.aboutLink.isDisplayed(),"Test for visibility of 'About Button' is failed!");
//        softAssert.assertTrue(mainPage.blogLink.isDisplayed(),"Test for visibility of 'Blog Button' is failed!");
//        softAssert.assertTrue(mainPage.contactLink.isDisplayed(),"Test for visibility of 'Contact Button' is failed!");
//        softAssert.assertTrue(mainPage.loginLink.isDisplayed(),"Test for visibility of 'Log in Button' is failed!");
//        softAssert.assertAll();
    }
}
