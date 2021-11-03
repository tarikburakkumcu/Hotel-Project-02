package test.smokeTests.uS_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tc_0003 extends TestBaseFinal {

    /*
    CHECK-IN DATE, CHECK-OUT DATE, ROOM, CUSTOMER elementleri gorunur olmali.
     */

    MainPage mainPage;

    @Test
    public void tC_0003 (){

        mainPage = new MainPage();
        extentTest = extentReports.createTest("TC_0003 Test For Available Room Part","Elements At The Available Room Part Should Be Visible");
        ReusableMethods.goToUrl();
        extentTest.info("Go to URL");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.checkInDateText.isDisplayed(),"Test for visibility of 'Check-in Date Text' is failed!");
        extentTest.pass("Check-in Date Text is visible");
        softAssert.assertTrue(mainPage.checkOutDateText.isDisplayed(),"Test for visibility of 'Check-out Date Text' is failed!");
        extentTest.pass("Check-out Date Text is visible");
        softAssert.assertTrue(mainPage.roomText.isDisplayed(),"Test for visibility of 'Room Text' is failed!");
        extentTest.pass("Room Text is visible");
        softAssert.assertTrue(mainPage.customerText.isDisplayed(),"Test for visibility of 'Customer Text' is failed!");
        extentTest.pass("Customer Text is visible");
        softAssert.assertAll();
    }
}
