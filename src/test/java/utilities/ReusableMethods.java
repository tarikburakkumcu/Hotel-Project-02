package utilities;

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



}
