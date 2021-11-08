package test.smokeTests.uS_0005;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

import java.util.List;

public class TC_0001 extends TestBaseFinal{
        ReusableMethods reusableMethods = new ReusableMethods();
        DefaultPage defaultPage = new DefaultPage();






   // 1)Menüden "Hotel Management'' ardından "Hotel List" menüsüne tıklanılabilmeli ve Çıkan sayfada "List of Hotel" yazısı görülmeli

        @Test
        public void tc_0001() {
                extentTest= extentReports.createTest("tc_0001 Default Page içerisinden Hotellist menüsüne geçiş ","List of Hotel Yazısı görülmeli");
                reusableMethods.login();
                extentTest.info("Siteye giriş yapıldı");
                defaultPage.hotelManagementLinki.click();
                extentTest.info("HotelManagement'e tıklanıldı");

                defaultPage.hotelListLink.click();
                extentTest.info("HotelListesi açıldı");

                String ListOfHotelYazisi = Driver.getDriver().findElement(By.linkText("List Of Hotels")).getText();
                String expectedResult = "List Of Hotels";
                Assert.assertEquals(ListOfHotelYazisi,expectedResult,"List Of Hotel yazısı birbiriyle uyuşmadı");
                extentTest.info("List of Hotel yazisi görüldü");









        }




        }
