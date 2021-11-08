package test.smokeTests.uS_0008;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateRoomReservationPage;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

// 7) "RoomReservation was inserted successfully" mesaji alinmali ve ardindan 'OK' butonu basilabilmeli.

public class TC_0007 extends TestBaseFinal {

    ReusableMethods reusableMethods=new ReusableMethods();

    @Test
    public void tc_0007() throws InterruptedException {

        extentTest = extentReports.createTest("TC_0007 Rezervasyon Basarili mesaji testi.", "'RoomReservation was inserted successfully' mesajinin gorunulebilirligi ve ardindan 'OK' butonunun calisabilirligi.");
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        MainPage mainPage = new MainPage();
        mainPage.loginLink.click();

        if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
            reusableMethods.goToUrl();
            mainPage.loginLink.click();
        }
        extentTest.pass("Login butonu calisir durumda.");

        //-------------------------

        LoginPage loginPage = new LoginPage();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.pass("username textbox'i calisir durumda.");
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.pass("password textbox'i calisir durumda.");
        loginPage.loginButton.click();
        extentTest.pass("Log in butonu calisir durumda.");

        //-------------------------

        DefaultPage defaultPage = new DefaultPage();
        defaultPage.hotelManagementLinki.click();
        extentTest.pass("'Hotel Management' butonu calisir durumda.");

        //-------------------------

        defaultPage.roomReservationLinki.click();
        extentTest.pass("'Room Reservations' butonu calisir durumda.");

        //-------------------------

        defaultPage.addRoomReservationButonu.click();
        extentTest.pass("'+ADD ROOM RESERVATION' butonu calisir durumda.");

        //-------------------------

        CreateRoomReservationPage createRoomReservationPage = new CreateRoomReservationPage();
        Select select = new Select(createRoomReservationPage.selectUserDropDown);
        extentTest.pass("Select User dropdown'i calisir durumda.");
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        select.selectByVisibleText(ConfigReader.getProperty("idUserAddRoomReserevation"));
        select = new Select(createRoomReservationPage.selectHotelDropDown);
        extentTest.pass("Select HotelRoom dropdown'i calisir durumda.");
        select.selectByVisibleText(ConfigReader.getProperty("idHotelRoomAddRoomReserevation"));

        actions.sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(150, 1000)))
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("Price textbox'i calisir durumda.");
        actions.sendKeys(ConfigReader.getProperty("dateStartAddRoomReservation"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("DateStart textbox'i calisir durumda.");
        actions.sendKeys(ConfigReader.getProperty("dateEndAddRoomReservation"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("DateEnd textbox'i calisir durumda.");
        actions.sendKeys(String.valueOf(faker.number().numberBetween(2, 3)))
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("AdultAmount textbox'i calisir durumda.");
        actions.sendKeys(String.valueOf(faker.number().numberBetween(0, 5)))
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("ChildrenAmount textbox'i calisir durumda.");
        actions.sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("ContactNameSurname textbox'i calisir durumda.");
        actions.sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("ContactPhone textbox'i calisir durumda.");
        actions.sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("ContactEmail textbox'i calisir durumda.");
        actions.sendKeys(ConfigReader.getProperty("noteDescriptionAddRoomReservation"))
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("Notes textbox'i calisir durumda.");
        actions.sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("Approved checkbox'i calisir durumda.");
        actions.sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).perform();
        extentTest.pass("Is Paid checkbox'i calisir durumda.");
        actions.sendKeys(Keys.ENTER).perform();
        extentTest.pass("SAVE butonu calisir durumda.");

        //----------------------

        Thread.sleep(1000);
        Assert.assertTrue(createRoomReservationPage.successAllert.isDisplayed(),"Rezervasyon Onay mesaji alinamadi.");
        extentTest.pass("'RoomReservation was inserted successfully' mesaji gozukur durumda.");
        Assert.assertTrue(createRoomReservationPage.successAllertOkButonu.isDisplayed(),"Rezervasyon Onay mesajinda OK tusuna basilamadi.");
        extentTest.pass("'OK' butonu gozukur durumda.");
        createRoomReservationPage.successAllertOkButonu.click();
        extentTest.pass("'OK' butonu calisir durumda.");
    }
}
