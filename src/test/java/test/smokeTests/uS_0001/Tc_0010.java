package test.smokeTests.uS_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0010 extends TestBaseFinal {

    /*
    Sayfanin en altinda bulunan footer bolumundeki Concort Hotel, Useful Links, Privacy ve Have a Questions? kisimlari gorunur olmali.
     */


    MainPage mainPage;

    @Test
    public void tC_0010 () {

        mainPage = new MainPage();
        extentTest = extentReports.createTest("TC_0009 Test For Instagram Part", "Instagram part should be visible and elements inside it should be clickable");
        ReusableMethods.goToUrl();
        extentTest.info("Go to URL");
        ReusableMethods.scrollTo(mainPage.footerPart);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.footerPartConcortHotel.isDisplayed(),"Test for visibility of 'Concort Hotel Part' is failed!");
        softAssert.assertTrue(mainPage.footerPartUsefulLinks.isDisplayed(),"Test for visibility of 'Useful Link Part' is failed!");
        softAssert.assertTrue(mainPage.footerPartPrivacy.isDisplayed(),"Test for visibility of 'Privacy Part' is failed!");
        softAssert.assertTrue(mainPage.footerPartHaveAQuestions.isDisplayed(),"Test for visibility of 'Have a Questions? Part' is failed!");
        softAssert.assertAll();
        extentTest.pass("Concort Hotel, Useful Links, Privacy and Have a Questions? elements in the footer part are visible");
        //Oguzhan
    }
}
