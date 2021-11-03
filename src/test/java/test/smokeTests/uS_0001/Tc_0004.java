package test.smokeTests.uS_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0004 extends TestBaseFinal {

    /*
    Check Availability butonu kullaniciyi sectigi kriterlere gore uygun sayfaya yonlendirmeli.
     */

    MainPage mainPage;

    @Test
    public void tC_0004 (){

        mainPage  = new MainPage();
        extendTest = extentReports.createTest("TC_0004 Test For Available Room Part","User should be navigated to the room which is relevant to his/her choices");

        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");

        // Otele giris tarihini secme (Available seceneklerden)

        mainPage.checkInDateUpdate.click();
        extendTest.info("Click Check In Date element");
        int randomDayForIn = (int) (Math.random()*((mainPage.availableDays.size()-1)+1)) +1 ;
        String selectedDayForIn = mainPage.availableDays.get(randomDayForIn-1).getText();
        Driver.getDriver().findElement(By.xpath(mainPage.randomSelectedDayForIn(randomDayForIn))).click();
        extendTest.info("Select a day which is available");

        // Otelden cikis tarihini secme (Gunu birlik yahut daha fazla. Giris tarihinden onceki gunler elendi.)

        mainPage.checkOutDateUpdate.click();
        extendTest.info("Click Check Out Date element");
        int randomDayForOut = (int) (Math.random()*((mainPage.availableDays.size()-randomDayForIn)+1)) + randomDayForIn;
        String selectedDayForOut = mainPage.availableDays.get(randomDayForOut-1).getText();
        Driver.getDriver().findElement(By.xpath(mainPage.randomSelectedDayForOut(randomDayForOut))).click();
        extendTest.info("Select a day which is available");

        //Oda tipi secme

        Select select = new Select(mainPage.roomTypeDropdown);
        int randomSelectionForRoomType= (int) (Math.random()* (((select.getOptions().size()-1)-1)+1))+ 1;
        select.selectByIndex(randomSelectionForRoomType);
        extendTest.info("Select a room type");
        String selectedRoomType = select.getAllSelectedOptions().get(0).getText();

        // Kalacak yetiskin sayisini secme

        select = new Select(mainPage.adultCountDropdown);
        int randomSelectionForAdultCount= (int) (Math.random()*(((select.getOptions().size()-1)-1)+1))+ 1;
        select.selectByIndex(randomSelectionForAdultCount);
        extendTest.info("Select a room type");
        String selectedAdultCount = select.getAllSelectedOptions().get(0).getText();


        mainPage.checkAvailabilityButton.click();
        extendTest.info("Click the Check Availability button");

        // Secilen tercihleri dogrulama

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath(mainPage.selectedInDateControl(selectedDayForIn))).isEnabled(),"Test for 'Checking Selected In Date' is failed!");
        extendTest.pass("User is navigated to the room which has the relevant In Date");
        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath(mainPage.selectedOutDateControl(selectedDayForOut))).isEnabled(),"Test for 'Checking Selected Out Date' is failed!");
        extendTest.pass("User is navigated to the room which has the relevant Out Date");
        select = new Select(mainPage.roomTypeDropdown);
        softAssert.assertEquals(wait.until(ExpectedConditions.visibilityOf(select.getFirstSelectedOption())).getText(),selectedRoomType,"Test for 'Checking Selected Room Type' is failed!");
        extendTest.pass("User is navigated to the room which has the relevant type");
        select = new Select(mainPage.adultCountDropdown);
        softAssert.assertEquals(wait.until(ExpectedConditions.visibilityOf(select.getFirstSelectedOption())).getText(),selectedAdultCount,"Test for 'Checking Selected Adult Count' is failed!");
        extendTest.pass("User is navigated to the room which has the adult count");
        softAssert.assertAll();
    }

}
