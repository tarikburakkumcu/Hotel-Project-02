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

public class TC_0003 {
    //Menüden "Hotel Management'' ardından "Hotel Rooms''butonuna tıklanılabilmeli ve Çıkan sayfada "LIST OF HOTELROOMS" yazısı görülmeli
//1) https://qa-environment.concorthotel.com URL'ine gidilir.
//2) Navbar'da bulunan Login butonuna tiklanir.
//3) "Username" butonuna geçerli bir username girilir
//4) "Password" butonuna geçerli bir password girilir
//5) "Login" Butonuna tıklanır
    // MainPage mainPage=new MainPage();
    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void test1() throws InterruptedException {
        reusableMethods.login();
//6) "Hotel Management" menüsüne tıklanır
//7) "Hotel Rooms''butonuna tıklanır
//8) Çıkan sayfada "LIST OF HOTELROOMS" yazısı görüldüğünü kontrol edilir
        reusableMethods.hotelRooms();
//9) "LIST OF HOTELROOMS" listesinin ilk satırındakı "DETAILS" butonuna tıklanır (çıkan sayfada "Edit Hotelroom" yazısı görülmeli)
//10) "Edit Hotelroom" bölümünde "General Data", "Hotelroom Data bölümünde "Hotel"
        // dropdown butonundan random bir hotel seçilir
        defaultPage.listOfHotelRoomsDetailsButon.click();
//11) "code" butonundan randon deger girilir
        HotelRoomPage hotelRoomPage=new HotelRoomPage();
        hotelRoomPage.editHotelRoomCode.clear();
        hotelRoomPage.editHotelRoomCode.sendKeys(ConfigReader.getProperty("editHotelRoomCode"));
        //Actions actions=new Actions(Driver.getDriver());actions.
        //sendKeys(Keys.TAB).
        //sendKeys(ConfigReader.getProperty("editHotelRoomCode")).
//12) "Name" butonundan randon deger girilir
        hotelRoomPage.editHotelRoomName.clear();
        hotelRoomPage.editHotelRoomName.sendKeys(ConfigReader.getProperty("editHotelRoomName"));
        //sendKeys(Keys.TAB).
        //sendKeys(ConfigReader.getProperty("editHotelRoomName")).
//13) "Location" butonundan randon deger girilir
        hotelRoomPage.editHotelRoomLocation.clear();
        hotelRoomPage.editHotelRoomLocation.sendKeys(ConfigReader.getProperty("editHotelRoomLocation"));
        //sendKeys(Keys.TAB).
        //sendKeys(ConfigReader.getProperty("editHotelRoomLocation")).
//14) "Destription" bölümüne "very nice hotel" yazılır
        hotelRoomPage.editHotelRoomDescription.clear();
        hotelRoomPage.editHotelRoomDescription.sendKeys(ConfigReader.getProperty("editHotelRoomDescription"));
//15) "Price" 400 girilir
        hotelRoomPage.editHotelRoomPrice.clear();
        hotelRoomPage.editHotelRoomPrice.sendKeys(ConfigReader.getProperty("editHotelRoomPrice"));
//16) Room type dropdown butonundan random bir oda type seçilir
        WebElement dropdown = Driver.getDriver().findElement(By.id("IDGroupRoomType"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("King");
//17) "Max Adult Count" bölümü random değiştirerek doldurulur
        hotelRoomPage.editHotelRoomMaxAdultCount.clear();
        hotelRoomPage.editHotelRoomMaxAdultCount.sendKeys(ConfigReader.getProperty("editHotelRoomMaxAdultCount"));
//18) "Max Children count" bölmümü random değiştirerek doldurulur
        hotelRoomPage.editHotelRoomMaxChildrenCount.clear();
        hotelRoomPage.editHotelRoomMaxChildrenCount.sendKeys(ConfigReader.getProperty("editHotelRoomMaxChildrenCount"));
//19) save butonunu tıklayınır
        hotelRoomPage.editHotelRoomSaveButton.click();
        Thread.sleep(2000);
//iptal 20) "HotelRoom was updated successfully" yazısının ekranda çıktığını görülür
//20) "HotelRoom was updated successfully" yazısını altındakı "OK" butonuna basılır
        hotelRoomPage.editHotelRoomUpdatedButton.click();
        Thread.sleep(2000);
//21) "Delete Hotelroom" bolumunde "DELETE" butonunu tiklayiniz
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomDeleteButton.click();
        Thread.sleep(2000);
//22) "Would you like to continue?" yazisinin altindaki "OK" butonunu tiklayiniz
        hotelRoomPage.editHotelRoomDeleteOkButton.click();
//22) "Error: Couldn't delete room : please delete reservations for this room first"
        //yazisinin altindaki "OK" butonunu tiklayiniz
        Thread.sleep(2000);
        hotelRoomPage.editHotelRoomErrorOkButton.click();
        //not bahse konu room'a ait rezervasyonlari silmeye calissakta rezervasyonlar silinmiyor
        Driver.closeDriver();
    }
}