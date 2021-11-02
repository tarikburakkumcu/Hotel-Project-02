package test.smokeTests.uS_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import javax.swing.*;

public class Tc_0006 extends TestBaseFinal {

    /*
    Our Rooms bolumu ve icerisindeki elementler gorunur ve tiklanabilir olmali.
     */

    MainPage mainPage;

    @Test
    public void tC_0006 () {

        mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0006 Test For Our Rooms Part","Our Rooms Part Should Be Visible and Clickable");
        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");
        ReusableMethods.scrollTo(mainPage.ourRoomsPart);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        SoftAssert softAssert = new SoftAssert();

        extendTest.info("Click the 6 different room options and navigate the user to the to relevant page");
        for (int i = 0; i < mainPage.ourRoomsPartRoomNames.size(); i++) {

            String roomName = wait.until(ExpectedConditions.visibilityOf(mainPage.ourRoomsPartRoomNames.get(i))).getText();
            Driver.getDriver().findElement(By.xpath("(//a[.='View Room Details '])["+(i+1)+"]")).click();
            softAssert.assertEquals(mainPage.getOurRoomsPartSelectedRoomName.getText(),roomName,"Test for 'Selected Room Details' is failed!");
            Driver.getDriver().navigate().back();
            softAssert.assertAll();
        }
        extendTest.pass("Rooms options are visible, clickable and navigate the user to the right page");

    }
}
