package test.smokeTests.uS_0009;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefaultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0002 extends TestBaseFinal {

//1-https://qa-environment.concorthotel.com/ sayfasına gidin
//2-Sağ üstteki "Login"butonuna tıklayın
//3-"Username" butonuna geçerli bir username girin
//4-"Password" butonuna geçerli bir password girin
//5-"Login" Butonuna tıklayın
//6-"Hotel Management" menüsüne tıklayın
//7-"Room reservatioon" butonuna tıklayın
//8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın
// 9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın
//10-Cıkan sonucu "Details" butonuna tıklayarak secin
// 11-"Edit Hotelroomreservatıon" başlığının goruldugunu dogrulayın



    DefaultPage defaultPage=new DefaultPage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public  void  test() throws InterruptedException {

        extentTest=extentReports.createTest("TC_0002 Hotel Management sayfasından reservation secme testi", "reservation secildigini test eder");

        extentTest.info("istenen adrese gidilir");

        ReusableMethods.login();
        extentTest.pass("istenen adrese gidildi");

        //6-"Hotel Management" menüsüne tıklayın
        extentTest.info("hotel management linki tıklanır");
        defaultPage.hotelManagementLinki.click();
        extentTest.pass("hotel management linki acıldı");

        //7-"Room reservatioon" butonuna tıklayın
        extentTest.info("room reservation linki tıklanır");
        defaultPage.roomReservationLinki.click();
        extentTest.pass("room reservation linki acıldı");

        //8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın

        extentTest.info("contactNameSurname butonuna istenen data girilir");
        defaultPage.contactNameSurnameKutusu.sendKeys(ConfigReader.getProperty("contactNameSurname"));

        actions.click(defaultPage.contactNameSurnameKutusuGecis).perform();

        extentTest.pass("contactNameSurname butonuna istenen data girildi");

        // 9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın
        extentTest.info("search butonu tıklanır");
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", defaultPage.searchButonu);

        actions.click(defaultPage.searchButonu).perform();
        extentTest.pass("search butonu tıklandı");
        Thread.sleep(1000);

        //10-Cıkan sonucu "Details" butonuna tıklayarak secin
        extentTest.info("cıkan sonucun Details butonu tıklanır");
        actions.click(defaultPage.detailsButonu).perform();
        extentTest.pass("cıkan sonucun Details butonu tıklandı");

        // 11-"Edit Hotelroomreservatıon" başlığının goruldugunu dogrulayın
        extentTest.info("Edit Hotelroomreservatıon başlıgının goruldugunu dogrulayın");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(defaultPage.editHotelRoomReservationButonu.isDisplayed());
        extentTest.pass("Edit Hotelroomreservatıon başlıgı goruldu");
        softAssert.assertAll();
    }


}
