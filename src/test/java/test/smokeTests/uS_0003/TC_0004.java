package test.smokeTests.uS_0003;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.uS_0003_TestBaseRapor;

public class TC_0004 extends uS_0003_TestBaseRapor {
    @Test
    public void tc_0004() throws InterruptedException {
        extentTest= extentReports.createTest("tc_0004 Register sayfası Save buttonu testi","Register sayfasına Save Buttonun çalıştığını test eder");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        extentTest.info("istenen adrese gidildi");
        MainPage mainPage=new MainPage();
        mainPage.loginLink.click();
        extentTest.info("login linkine tiklandi");
        LoginPage loginPage=new LoginPage();
        loginPage.creatButton.click();
        extentTest.info("Login sayfasındaki creat a new account butonuna tiklandi");
        RegisterPage registerPage=new RegisterPage();
        extentTest.info("RegisterPage sayfasına ulaşıldı");
        registerPage.regUserNameText.sendKeys(ConfigReader.getProperty("regUserName"));
        extentTest.info("Kullanıcı adı gönderildi");
        registerPage.regPasswordText.sendKeys(ConfigReader.getProperty("regPassword"));
        extentTest.info("Password gönderildi");
        registerPage.regEmailText.sendKeys(ConfigReader.getProperty("regEmail"));
        extentTest.info("Email gönderildi");
        registerPage.regFullNameText.sendKeys(ConfigReader.getProperty("regFullName"));
        extentTest.info("İsim-soyisim gönderildi");
        Thread.sleep(1000);
        registerPage.regPhoneNoText.sendKeys(ConfigReader.getProperty("regPhoneNo"));
        extentTest.info("Telefon gönderildi");
        Thread.sleep(1000);
        registerPage.regSSNText.sendKeys(ConfigReader.getProperty("regSSN"));
        extentTest.info("SSN gönderildi");
        registerPage.regDrivingLicenseText.sendKeys(ConfigReader.getProperty("regDrivingLicense"));
        extentTest.info("Ehliyet gönderildi");
        Select select=new Select(registerPage.regCountryText);
        select.selectByVisibleText(ConfigReader.getProperty("regCountry"));
        extentTest.info("Ülke seçildi");
        Select select1=new Select(registerPage.regStateText);
        select1.selectByVisibleText(ConfigReader.getProperty("regState"));
        extentTest.info("Eyalet seçildi ");
        registerPage.regAddressText.sendKeys(ConfigReader.getProperty("regAddress"));
        extentTest.info("Adres gönderildi");
        registerPage.regWorkingSectorText.sendKeys(ConfigReader.getProperty("regWorkingSector"));
        extentTest.info("Meslek gönderildi");
        registerPage.regBirthDateText.sendKeys(ConfigReader.getProperty("regBirthDate"));
        extentTest.info("Doğum tarihi gönderildi");
        registerPage.regSaveButton.click();
        extentTest.info("Save Buttonuna tiklandi");


    }
}
