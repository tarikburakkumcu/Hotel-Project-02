package test.smokeTests.uS_0006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddHotelRoomPage;
import pages.DefaultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class Tc_0005 extends TestBaseFinal {
    //Çıkan ekranda "HotelRoom was inserted successfully" yazısının görünürlüğü test edilip "OK" buttonuna tıklanmalı

    AddHotelRoomPage addHotelRoomPage=new AddHotelRoomPage();

    @Test
    public void tC_0005() throws InterruptedException {

        Actions actions=new Actions(Driver.getDriver());
        DefaultPage defaultPage=new DefaultPage();

        extentTest= extentReports.createTest("tC_0005 Hotel Save edilip sayfanın üstüne dönme testi","OK butonu tıklanır olmalı");


        ReusableMethods.login();
        extentTest.info("Sayfaya gidip Login yapıldı");

        ReusableMethods.hotelRooms();
        extentTest.info("HotelRooms sayfasına gidildi");

        defaultPage.addHotelRoomBtn.click();
        extentTest.info("add Hotel Room butonuna tıklandı");

        Thread.sleep(3000);
        Select select=new Select(addHotelRoomPage.addHotelRoomSelectHotel);
        select.selectByVisibleText(ConfigReader.getProperty("addHotelRoomSelectHotel"));
        extentTest.info("Dropdown menuden Hotel secildi.");


        addHotelRoomPage.addHotelRoomCode.sendKeys(ConfigReader.getProperty("addHotelRoomCode"));
        extentTest.info("Code box a code girildi");


        addHotelRoomPage.addHotelRoomName.sendKeys(ConfigReader.getProperty("addHotelRoomName"));
        extentTest.info("Room Name girildi.");


        addHotelRoomPage.addHotelRoomLocation.sendKeys(ConfigReader.getProperty("addHotelRoomLocation"));
        extentTest.info("Location girildi");


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        addHotelRoomPage.addHotelRoomDescription.sendKeys(ConfigReader.getProperty("addHotelRoomDescription"));
        extentTest.info("Description girildi");


        Thread.sleep(3000);
        actions.dragAndDrop(addHotelRoomPage.price300, addHotelRoomPage.priceBox).perform();
        extentTest.info("Price girildi");


        select=new Select(addHotelRoomPage.addHotelRoomType);
        select.selectByVisibleText(ConfigReader.getProperty("addHotelRoomType"));
        extentTest.info("Dropdown menuden Room Type girildi");


        addHotelRoomPage.addHotelRoomMaxAdult.sendKeys(ConfigReader.getProperty("addHotelRoomMaxAdult"));
        extentTest.info("MaxAdult sayısı girildi");


        addHotelRoomPage.addHotelRoomMaxChild.sendKeys(ConfigReader.getProperty("addHotelRoomMaxChild"));
        extentTest.info("MaxChild sayısı girildi");


        addHotelRoomPage.addHotelRoomApproved.click();
        extentTest.info("Approved cliklendi");


        addHotelRoomPage.addHotelRoomSaveBtn.click();
        extentTest.info("Save butonuna basıldı");


        Thread.sleep(2000);
        Assert.assertTrue(addHotelRoomPage.addHotelRoomSuccessfully.isDisplayed());
        extentTest.info("'HotelRoom was inserted successfully' görüldü");

        addHotelRoomPage.addHotelRoomOkBtn.click();
        extentTest.info("OK butonuna basıldı");

        addHotelRoomPage.addHotelRoomArrowUp.click();
        extentTest.info("Arrow Up Butonuna basıldı ve sayfanın başıan gidildi");

        Assert.assertTrue(defaultPage.createHotelRoomText.isDisplayed());
        extentTest.pass("Create Room yazısı görüldü");















    }

}
