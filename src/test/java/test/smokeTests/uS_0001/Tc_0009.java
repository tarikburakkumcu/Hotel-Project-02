package test.smokeTests.uS_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0009 extends TestBaseFinal {

    /*
    Instagram kismi gorunur ve icerisindeki elementler tiklanabilir olmali.
     */

    MainPage mainPage;

    @Test
    public void tC_0009() {

        mainPage = new MainPage();
        extendTest = extentReports.createTest("TC_0009 Test For Instagram Part", "Instagram part should be visible and elements inside it should be clickable");
        ReusableMethods.goToUrl();
        extendTest.info("Go to URL");
        ReusableMethods.scrollTo(mainPage.instagramPart);
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < mainPage.instagramPartPictures.size(); i++) {
            String nameOfPictures= mainPage.instagramPartPictures.get(i).getAttribute("style");
            nameOfPictures = nameOfPictures.substring(nameOfPictures.indexOf("/"),nameOfPictures.indexOf(")")-1);
            System.out.println(nameOfPictures);
            mainPage.instagramPartPictures.get(i).click();
            extendTest.info("Click " + (i+1) +". picture");
            ReusableMethods.waitFor(1);
            WebElement selectedPicture = Driver.getDriver().findElement(By.xpath("//img[@src='"+nameOfPictures+"']"));
            softAssert.assertTrue(selectedPicture.isDisplayed(),"Test for 'Clicking The Element in Instagram Part' is failed!'");
            mainPage.instagramPartEscButton.click();
            softAssert.assertAll();
            extendTest.pass((i+1) +". picture in the instagram part is clickable");
        }
    }
}
