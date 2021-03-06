package test.smokeTests.uS_0005;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import javax.swing.*;
import java.security.Key;
import java.util.Set;

public class TC_0003 extends TestBaseFinal {

    //3)"Code,Name,Adress,Phone,Email,Group" seçenekleri güncellenip "Save" Butonuna Tıklanılabilmeli

    DefaultPage defaultPage = new DefaultPage();
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();


    @Test
    public void tc_0003(){
        extentTest= extentReports.createTest("tc_0003 Gereken bilgiler girilip Save edilebilmeli ","Save Butonuna tıklanıldı.");
        reusableMethods.login();
        extentTest.info("Siteye giriş yapıldı");
        defaultPage.hotelManagementLinki.click();
        extentTest.info("HotelManagement'e tıklanıldı");
        defaultPage.hotelListLink.click();
        extentTest.info("Hotel Listte tıklanıldı");
        defaultPage.detailsHotelLinki.click();
        extentTest.info("Details sayfasına tıklanıldı.");


        System.out.println("ilk sayfanin handle değeri :" + Driver.getDriver().getWindowHandle());
        String ilkSayfaninHandleDegeri = Driver.getDriver().getWindowHandle();
        Set<String> tumWindowHandlelari = Driver.getDriver().getWindowHandles();
        System.out.println("Tum Handlelar : " + tumWindowHandlelari);

        String ikinciWindowHandleDegeri ="";
        for (String each : tumWindowHandlelari){
            if (!each.equals(ilkSayfaninHandleDegeri)){
                ikinciWindowHandleDegeri=each;
            }
        }

        System.out.println("ikinci sayfa handle değeri :" + ikinciWindowHandleDegeri);
        Driver.getDriver().switchTo().window(ikinciWindowHandleDegeri);

        Actions action = new Actions(Driver.getDriver());
        WebElement codeKutusu = Driver.getDriver().findElement(By.xpath("/html//input[@id='Code']"));

        codeKutusu.clear();
        action.click(codeKutusu)
                .sendKeys(String.valueOf(faker.number().numberBetween(1001,1999)))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.name()))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.address()))
                .sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.phoneNumber().cellPhone()))
                .sendKeys(Keys.TAB)
                .sendKeys("myb6767@gmail.com").perform();

        extentTest.info("Code Gönderildi");
        extentTest.info("Name Gönderildi");
        extentTest.info("Adress Gönderildi");
        extentTest.info("PhoneNumber Gönderildi");
        extentTest.info("MailAdress Gönderildi");



        WebElement dropDown = Driver.getDriver().findElement(By.xpath("//select[@class='form-control input-lg required'][1]"));
        Select options = new Select(dropDown);
        options.selectByVisibleText("Hotel Type1");
        extentTest.info("Group seçildi");

        WebElement saveButonu = Driver.getDriver().findElement(By.xpath("//button[@class='btn green'][1]"));
        extentTest.info("Save Butonuna tıklanıldı");





    }
}
