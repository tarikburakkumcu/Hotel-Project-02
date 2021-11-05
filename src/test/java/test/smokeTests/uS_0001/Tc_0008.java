package test.smokeTests.uS_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.util.ResourceBundle;

public class Tc_0008 extends TestBaseFinal {

    /*
    Recent Blog bolumu gorunur ve icerisindeki elementler tiklanabilir olmali.
     */

    MainPage mainPage;

    @Test
    public void tC_0008 () {

        mainPage = new MainPage();
        extentTest = extentReports.createTest("TC_0008 Test For Recent Blog Part", "Recent Blog part and elements inside it should be visible");
        ReusableMethods.goToUrl();
        extentTest.info("Go to URL");
        ReusableMethods.scrollTo(mainPage.recentBlogPart);
        Assert.assertTrue(mainPage.recentBlogPart.isDisplayed(),"Test for 'Recent Blog Part' is failed!");
        extentTest.pass("Recent Blog Part is visible");
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < mainPage.recentBlogPartBlogs.size(); i++) {
            softAssert.assertTrue(mainPage.recentBlogPartBlogs.get(i).isDisplayed(),"Test for 'Elements in The Recent Blog Part' is failed!");
            softAssert.assertAll();
            extentTest.pass((i+1) +". element in the recent blog part is visible");
        }
    }
}
