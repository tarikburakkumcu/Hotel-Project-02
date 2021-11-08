package test.smokeTests.uS_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

public class TC_0006 extends TestBaseFinal {
    /*
    TC_0006-Us_0010 6)Create a new Account buttonuna tiklandiktan
    sonra cikan sayfada registration form oldugu dogrulanmali, form doldurulup "Save" edilebilmeli.
     */

    @Test
    public void test() throws InterruptedException {
        extentTest = extentReports.createTest("TC_0006 from uS_0010 ","Registration formu gorunuyor ve doldurulup save edilebiliyor");


        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        US_0010_QAConcortPage us_0010_qaConcortPage = new US_0010_QAConcortPage();

        mainPage.loginLink.click();

        us_0010_qaConcortPage.createANewAccountButton.click();

        String expectedRegistrationFormYazisi = "Registration Form";
        String actualRegistrationFormYazisi = Driver.getDriver().findElement(By.xpath("//h2[@class='mb-4']")).getText();
        Assert.assertEquals(actualRegistrationFormYazisi,expectedRegistrationFormYazisi,"registration form yazisinda bir sorun var");
        extentTest.pass("registration formu gozukuyor");
        actions.click(us_0010_qaConcortPage.userNameButonu).
                sendKeys(us_0010_qaConcortPage.userNameForCreation).
                sendKeys(Keys.TAB).sendKeys(us_0010_qaConcortPage.passwordForCreation).
                sendKeys(Keys.TAB).sendKeys(us_0010_qaConcortPage.emailForCreation).sendKeys(Keys.TAB).
                sendKeys(us_0010_qaConcortPage.fullNameForCreation).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys("B").sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.job().field()).sendKeys(Keys.TAB).
                sendKeys("11.10.1982").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();

        String expectedAlertYazisi = "this email address is already taken";
        String expectedAlertYazisi2 = "User Data was inserted successfully";

        if (us_0010_qaConcortPage.alertYazisiFromRegisterPage.getText().contains(expectedAlertYazisi)){
            softAssert.assertEquals(us_0010_qaConcortPage.alertYazisiFromRegisterPage.getText(),expectedAlertYazisi,
                    "hesaba daha onceden kayit yapildi.Bu bilgierle giris yapabilirsiniz" );
        }else if (us_0010_qaConcortPage.alertYazisiFromRegisterPage.getText().contains(expectedAlertYazisi2)){
            softAssert.assertEquals(us_0010_qaConcortPage.alertYazisiFromRegisterPage.getText(),expectedAlertYazisi2,
                    "yeni kayit olusturulamadi" );
        }
        extentTest.pass("registration formu dolduruluyor ve save ediliyor");

        Thread.sleep(3000);
        us_0010_qaConcortPage.okButtoninRegisterPage.click();

        Driver.closeDriver();
    }
}
