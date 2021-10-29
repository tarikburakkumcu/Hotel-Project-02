package test.smokeTests.uS_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Tc_0002 {

    /*
    Navbar'da bulunan butonlar kullaniciyi ilgili sayfaya yonlendirmeli.
     */

    MainPage mainPage = new MainPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void tC_0002 (){

        reusableMethods.login();
//        SoftAssert softAssert = new SoftAssert();
//        mainPage.homeLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Home"),"Test for navigation of 'Home Button' is failed!");
//        mainPage.roomsLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Rooms"),"Test for navigation of 'Rooms Button' is failed!");
//        mainPage.restaurantLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Restaurant"),"Test for navigation of 'Restaurant Button' is failed!");
//        mainPage.aboutLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("About"),"Test for navigation of 'About Button' is failed!");
//        mainPage.blogLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Blog"),"Test for navigation of 'Blog Button' is failed!");
//        mainPage.contactLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Contact"),"Test for navigation of 'Contact Button' is failed!");
//        mainPage.loginLink.click();
//        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Log in"),"Test for navigation of 'Log in Button' is failed!");
//        softAssert.assertAll();
    }
}
