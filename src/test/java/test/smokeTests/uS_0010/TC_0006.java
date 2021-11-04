package test.smokeTests.uS_0010;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_0006 {
    /*
    TC_0006-Us_0010 6)Create a new Account buttonuna tiklandiktan
    sonra cikan sayfada registration form oldugu dogrulanmali, form doldurulup "Save" edilebilmeli.
     */


    @Test
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();

        mainPage.loginLink.click();
        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();

        us_0010_qaConcortPage.createANewAccountButton.click();

        String expectedRegistrationFormYazisi = "Registration Form";
        String actualRegistrationFormYazisi = Driver.getDriver().findElement(By.xpath("//h2[@class='mb-4']")).getText();
        Assert.assertEquals(actualRegistrationFormYazisi,expectedRegistrationFormYazisi,"registration form yazisinda bir sorun var");





    }
}
