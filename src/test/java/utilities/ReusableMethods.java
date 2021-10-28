package utilities;

import org.testng.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;

public class ReusableMethods {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    public void login () {

        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
        mainPage.loginLink.click();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.loginButton.click();
    }
    public void hotelRooms(){
        DefaultPage defaultPage=new DefaultPage();
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelRoomsLinki.click();
        Assert.assertTrue(defaultPage.listOfHotelRooms.isDisplayed());
    }


}
