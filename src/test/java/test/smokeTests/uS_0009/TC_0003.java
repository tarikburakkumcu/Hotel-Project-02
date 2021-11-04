package test.smokeTests.uS_0009;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_0003 {

    //1-https://qa-environment.concorthotel.com/ sayfasına gidin
    //2-Sağ üstteki "Login"butonuna tıklayın
    //3-"Username" butonuna geçerli bir username girin
    //4-"Password" butonuna geçerli bir password girin
    //5-"Login" Butonuna tıklayın
    //6-"Hotel Management" menüsüne tıklayın
    //7-"Room reservatioon" butonuna tıklayın
    //8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın
    //9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın
    //10-Cıkan sonucu "Details" butonuna tıklayarak secin
    //11-"Date Start",  tarihini update edin
    //12-"Save" butonuna tıklayıp, kaydedildiğinden emin olun


    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage=new DefaultPage();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test public void test() throws InterruptedException {
        reusableMethods.login();

        //6-"Hotel Management" menüsüne tıklayın

        defaultPage.hotelManagementLinki.click();

        //7-"Room reservatioon" butonuna tıklayın

        defaultPage.roomReservationLinki.click();

        //8-"List of reservation" listesinde "contactNameSurname" butonuna "hasan sade" yazın


        defaultPage.contactNameSurnameKutusu.sendKeys(ConfigReader.getProperty("contactNameSurname"));

        actions.click(defaultPage.contactNameSurnameKutusuGecis).perform();
        // 9-Sayfayı sağa kaydırarak "search" butonunu bulun ve tıklayın

        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView();", defaultPage.searchButonu);




        defaultPage.searchButonu.click();

        Thread.sleep(2000);
        //10-Cıkan sonucu "Details" butonuna tıklayarak secin

      defaultPage.detailsButonu.click();

        js.executeScript("window.scrollBy(0,600)");
        
        //11-"Date Start",  tarihini update edin

        defaultPage.dateStart.clear();
        defaultPage.dateStart.sendKeys(ConfigReader.getProperty("dateStart"));

        js.executeScript("window.scrollBy(0,600)");


        //12-"Save" butonuna tıklayıp, kaydedildiğinden emin olun

        defaultPage.generalDataSaveButonu.click();

        // Assert.assertTrue(defaultPage.???????????????.isDisplay);

    }

}
