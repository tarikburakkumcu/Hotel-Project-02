package test.smokeTests.uS_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_0005 {

    ReusableMethods reusableMethods = new ReusableMethods();
    DefaultPage defaultPage = new DefaultPage();

    @Test
    public void TC0005() throws InterruptedException {
 /*
        https://qa-environment.concorthotel.com/ sayfasına gidiniz
        Sağ üstteki "Login"butonuna tıklayın
        "Username" butonuna geçerli bir username girin
        "Password" butonuna geçerli bir password girin
        "Login" Butonuna tıklayın
        */
        reusableMethods.login();

        //  "Hotel Management" menüsüne tıklayın
        defaultPage.hotelManagementLinki.click();
        // "Hotel List" menüsüne tıklayın
        defaultPage.hotelListLink.click();
        //"Add Hotel" Buttonuna tıklayın
        defaultPage.addHotelLink.click();
        //"Code" kutucuğuna tıklayıp bir Kod giriniz
        defaultPage.addHotelCodeKutusu.sendKeys("1453");

        /*
        "Name" kutucuğuna tıklayıp bir İsim giriniz
        "Adress" kutucuğuna tıklayıp Adres giriniz
         "Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
        "Mail" kutucuğuna tıklayıp Email Adresi giriniz

        */

        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).
                sendKeys("Fatih Otel").
                sendKeys(Keys.TAB).
                sendKeys("Fatih Caddesi Fetih Sok No:145/3 Fatih/İstanbul").
                sendKeys(Keys.TAB).
                sendKeys("05514531453").
                sendKeys(Keys.TAB).
                sendKeys("fatih1453@gmail.com").perform();

        // "idGroup" dropdown butonuna tıklayıp Grup seçiniz
        Select select = new Select(defaultPage.idGroupHotelEkle);
        select.selectByVisibleText("Hotel Type2");
        Thread.sleep(3000);

        defaultPage.addHotelSaveButonu.click();

        Thread.sleep(3000);


        String addHotelExpectedAlertYazisi="Hotel was inserted successfully";
        String addHotelActualAlertYazisi= Driver.getDriver().findElement(By.xpath("//div[@class='bootbox-body']")).getText();

        Assert.assertEquals(addHotelActualAlertYazisi,addHotelExpectedAlertYazisi,"unique bir add Hotel kaydi yapilamamistir");



        defaultPage.okButonu.click();

        Thread.sleep(5000);
        Actions actions1=new Actions(Driver.getDriver());
        actions1.
                sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);

        //otel list linkini tıklayın
        defaultPage.hotelListLink.click();

        Thread.sleep(3000);
        //"İd" kutusuna otel kayıt yaptığınız otel "id" giriniz
        defaultPage.otelListidCheck.sendKeys("2434");
        Select select1 = new Select(defaultPage.idGroupSearch);
        select1.selectByVisibleText("Hotel Type2");

       // "Search" butonuna tıklayın
        defaultPage.hotelSearchButton.click();

        //unique bir kaydın yapılıp yapılmadıgını dogrulayın

    String addHotelExpectedResult="|Found total 1 records";
   String addHotelActualResult= Driver.getDriver().findElement(By.xpath("//*[text()='Found total 1 records']")).getText();

   Assert.assertEquals(addHotelActualResult,addHotelExpectedResult,"unique bir add Hotel kaydi yapilamamistir");
    }
}
