package test.smokeTests.uS_0007;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.HotelRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class TC_0005 extends TestBaseFinal {

//"properties" bölümünde "Code" ve "Value" bölümlerinde
//manuel deger girerek update edilen degerlerin silinmesi
//1) https://qa-environment.concorthotel.com URL'ine gidilir.
//2) Navbar'da bulunan Login butonuna tiklanir.
//3) "Username" butonuna geçerli bir username girilir
//4) "Password" butonuna geçerli bir password girilir
//5) "Login" Butonuna tıklanır
    // MainPage mainPage=new MainPage();
    ReusableMethods reusableMethods = new ReusableMethods();


    @Test
    public void test1() throws InterruptedException {
        reusableMethods.login();
        extentTest= extentReports.createTest("TC_0005 Hotelrooms sayfasının properties bölümlerının güncellemelerin silinmesi testi ","Hotelrooms sayfasının properties bölümü güncellenmesinin silinmesini test eder");
//6) "Hotel Management" menüsüne tıklanır
//7) "Hotel Rooms''butonuna tıklanır
//8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
        reusableMethods.hotelRooms();
//9) "LIST OF HOTELROOMS" listesinin ilk satırındakı "DETAILS" butonuna tıklanır (çıkan sayfada "Edit Hotelroom" yazısı görülmeli)
//10) "Edit Hotelroom" bölümünde "General Data", "Hotelroom Data bölümünde "Hotel"
        // dropdown butonundan random bir hotel seçilir
        DefaultPage defaultPage=new DefaultPage();
        defaultPage.listOfHotelRoomsDetailsButon.click();
        extentTest.info("LIST OF HOTELROOMS sayfası açıldı");
//11) "Edit Hotelroom" bölümünde "Properties" bölümünde "Add property" bölümünde "Tip" dropdown sekmesinde  3. sıradaki sekmeyi seçilir
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        hotelRoomPage.editHotelRoomPropertiesButton.click();
        extentTest.info("Properties butonu tıklandı");
        Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement dropdown2 = Driver.getDriver().findElement(By.id("lkpBarcodeTypes"));
        Select select = new Select(dropdown2);
        select.selectByVisibleText("room prop1");
        extentTest.info("Add property bölümünde  oda tipi olarak room prop1 seçildi");
//12) "Code" bölümünde TestCode_01 yazılır
        hotelRoomPage.editHotelRoomAddPropertyCode.sendKeys(ConfigReader.getProperty("editHotelRoomAddPropertyCode"));
        extentTest.info("Code bölümünde TestCode_01 yazıldı");
//13) "Value" dölümüne TestValue_01 yazılır
        hotelRoomPage.editHotelRoomAddPropertyValue.sendKeys(ConfigReader.getProperty("editHotelRoomAddPropertyValue"));
        extentTest.info("Value bölümünde TestValue_01 yazıldı");
//14) "save" butonu tıklanır
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomAddPropertySaveButton.click();
        Thread.sleep(5000);
        extentTest.info("save butonu tıklandı");
//15) "value added" yazisinin altindaki ok butonutu tiklayiniz
        hotelRoomPage.editHotelRoomAddPropertyValueAddedOkButton.click();
        extentTest.info("ValueAddedOk butonu tıklandı");
//16) "Delete Hotelroom" bolumunde "DELETE" butonunu tiklayiniz
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomPropertiesDeleteButton.click();
        Thread.sleep(2000);
        extentTest.info("Properties bölümü Delete butonu tıklandı");
//17) "Would you like to continue?" yazisinin altindaki "OK" butonunu tiklayiniz
        hotelRoomPage.editHotelRoomPropertiesDeleteOkButton.click();
        extentTest.info("Properties bölümü Delete Ok  butonu tıklandı");
//18) "Error: Couldn't delete room : please delete reservations for this room first"
//        //yazisinin altindaki "OK" butonunu tiklayiniz
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomPropertiesErrorOkButton.click();
        extentTest.info("Properties bölümü Error Ok  butonu tıklandı");
//        //not bahse konu room'a ait rezervasyonlari silmeye calissakta rezervasyonlar silinmiyor
        //Driver.closeDriver();
    }
    }
