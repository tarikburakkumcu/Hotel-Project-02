package test.smokeTests.uS_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Tc_0001 {

    ReusableMethods reusableMethods=new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();
    @Test
    public void tC_0001(){

        //1)Login başarıyla gerçekleştirilmeli,  "LISTOFUSERS" görünürlüğü test edilmeli

        reusableMethods.login();
        Assert.assertTrue(defaultPage.listOfUsersText.isDisplayed());
        Driver.closeDriver();


    }
}
