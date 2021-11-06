package test.smokeTests.uS_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0001 extends TestBaseFinal {
    //1)Login başarıyla gerçekleştirilmeli,  "LISTOFUSERS" görünürlüğü test edilmeli


    @Test
    public void tC_0001() {
        DefaultPage defaultPage = new DefaultPage();

        extentTest = extentReports.createTest("tC_0001 Anasayfadan Login sayfasına geçiş testi", "login linkinin çalıdığını test eder");

        ReusableMethods.login();
        extentTest.info("Sayfaya gidip Login yapıldı");
        Assert.assertTrue(defaultPage.listOfUsersText.isDisplayed());
        extentTest.pass("ListOfUsers yazısı görüldü.");


    }
}
