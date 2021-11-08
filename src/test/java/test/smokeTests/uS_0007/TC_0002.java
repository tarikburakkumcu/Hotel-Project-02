package test.smokeTests.uS_0007;

import org.apache.commons.io.input.TeeReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.HotelRoomPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.lang.ref.Cleaner;

public class TC_0002 extends TestBaseFinal {
//Edit hotelroom bölümünde "General Data",
// "Hotelroom Data bölümünde "Hotel","Code","Name","Locatıon",
// "Description","Price","Room Type","Max Adult Count","Max Children Count"
// seçenekleri güncellenip "IsAvailable" ikonu tıklanıp "Save" Butonuna Tıklanılabilmeli
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
        extentTest= extentReports.createTest("TC_0002 Hotelrooms sayfasının bölümlerının güncelleme testi ","Hotelrooms sayfasının güncellenmesini test eder");
//6) "Hotel Management" menüsüne tıklanır
//7) "Hotel Rooms''butonuna tıklanır
//8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
        reusableMethods.hotelRooms();
//9) "LIST OF HOTELROOMS" listesinin ilk satırındakı "DETAILS" butonuna tıklanır (çıkan sayfada "Edit Hotelroom" yazısı görülmeli)
//10) "Edit Hotelroom" bölümünde "General Data", "Hotelroom Data bölümünde "Hotel"
        // dropdown butonundan 1.siradaki hotel seçilir
        DefaultPage defaultPage=new DefaultPage();
        defaultPage.listOfHotelRoomsDetailsButon.click();
        extentTest.info("LIST OF HOTELROOMS sayfası açıldı");
//11) "code" butonundan "TestCode_01" girilir
        Thread.sleep(3000);
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        hotelRoomPage.editHotelRoomCode.clear();
        hotelRoomPage.editHotelRoomCode.sendKeys(ConfigReader.getProperty("editHotelRoomCode"));
        extentTest.info("code butonundan TestCode_01 girildi");
        //Actions actions=new Actions(Driver.getDriver());actions.
                //sendKeys(Keys.TAB).
                //sendKeys(ConfigReader.getProperty("editHotelRoomCode")).
//12) "Name" butonundan "TestName_01" girilir
        hotelRoomPage.editHotelRoomName.clear();
        hotelRoomPage.editHotelRoomName.sendKeys(ConfigReader.getProperty("editHotelRoomName"));
        extentTest.info("Name butonundan TestName_01 girildi");
                //sendKeys(Keys.TAB).
                //sendKeys(ConfigReader.getProperty("editHotelRoomName")).
//13) "Location" butonundan "TestCountry_01" girilir
        hotelRoomPage.editHotelRoomLocation.clear();
        hotelRoomPage.editHotelRoomLocation.sendKeys(ConfigReader.getProperty("editHotelRoomLocation"));
        extentTest.info("Location butonundan TestCountry_01 girildi");
                //sendKeys(Keys.TAB).
                //sendKeys(ConfigReader.getProperty("editHotelRoomLocation")).
//14) "Destription" bölümüne "TestText_01" yazılır
        hotelRoomPage.editHotelRoomDescription.clear();
        hotelRoomPage.editHotelRoomDescription.sendKeys(ConfigReader.getProperty("editHotelRoomDescription"));
        extentTest.info("Destription bölümüne TestText_01 girildi");
//15) "Price" 500 girilir
        hotelRoomPage.editHotelRoomPrice.clear();
        hotelRoomPage.editHotelRoomPrice.sendKeys(ConfigReader.getProperty("editHotelRoomPrice"));
        extentTest.info("Price 500 girildi");
//16) Room type dropdown butonundan "King" oda type seçilir
WebElement dropdown=Driver.getDriver().findElement(By.id("IDGroupRoomType"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("King");
        extentTest.info("Room type dropdown butonundan King oda type seçildi");
//17) "Max Adult Count" bölümü "TestMAC_01" yazılır
        hotelRoomPage.editHotelRoomMaxAdultCount.clear();
        hotelRoomPage.editHotelRoomMaxAdultCount.sendKeys(ConfigReader.getProperty("editHotelRoomMaxAdultCount"));
        extentTest.info("Max Adult Count bölümüne TestMAC_01 girildi");
//18) "Max Children count" bölümü "TestMCC_01" yazılır
        hotelRoomPage.editHotelRoomMaxChildrenCount.clear();
        hotelRoomPage.editHotelRoomMaxChildrenCount.sendKeys(ConfigReader.getProperty("editHotelRoomMaxChildrenCount"));
        extentTest.info("Max Children count bölmümü TestMCC_01 girildi");
//19) save butonunu tıklayınır
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomIsAvailableButton.click();
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomSaveButton.click();
        Thread.sleep(2000);
        extentTest.info("save butonuna tıklandi");

//20) "HotelRoom was updated successfully" yazısını altındakı "OK" butonuna basılır
        hotelRoomPage.editHotelRoomUpdatedButton.click();
        Thread.sleep(2000);
       //Driver.closeDriver();
//not=save etsede ekranda yeni girilen degerler kayit edilmiyor


    }
}