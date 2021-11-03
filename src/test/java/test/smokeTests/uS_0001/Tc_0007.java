package test.smokeTests.uS_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.util.ResourceBundle;

public class Tc_0007 extends TestBaseFinal {

    /*
    Misafirlerin yorumlarinin bulundugu slider bolumu gorunur ve altindaki yonlendirme butonlari tiklanabilir olmali.
     */

    MainPage mainPage;

    @Test
    public void tC_0007 ()  {

        mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0007 Test For Customer Comments Part","Customer Comments part should be visible and slider buttons should be working");
        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");
        ReusableMethods.scrollTo(mainPage.customerCommentPart);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.customerCommentPart.isDisplayed(),"Test for 'Customer Comment Part' is failed!");
        extendTest.pass("Customer comment part is visible");
        String previousComment = "";

        for (int i = 0; i < mainPage.customerCommentSliderButtons.size(); i++) {
            mainPage.customerCommentSliderButtons.get(i).click();
            extendTest.info("Click " + (i+1) +". slider button");
            softAssert.assertNotEquals(mainPage.activeCustomerComment.getText(),previousComment,"Test for 'Customer Comments Part Slider Buttons' is failed!");
            previousComment = mainPage.activeCustomerComment.getText();
            ReusableMethods.waitFor(1);
            softAssert.assertAll();
            extendTest.pass((i+1) +". slider button is working");
        }


    }

}
