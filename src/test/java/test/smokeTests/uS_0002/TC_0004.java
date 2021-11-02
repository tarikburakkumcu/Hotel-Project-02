package test.smokeTests.uS_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_0004 {

    // 4)Login butonunun görünürlüğü kontrol edilmeli ve butona basılmalı

    ReusableMethods reusableMethods = new ReusableMethods();
    MainPage mainPage = new MainPage();
    LoginPage loginPage=new LoginPage();


    @Test
    public void test4 () {

        SoftAssert softAssert = new SoftAssert();

        reusableMethods.goToUrl();
        softAssert.assertTrue(mainPage.loginLink.equals("Log in"),"Test for visibility of 'Log in Link' is failed!");
        mainPage.loginLink.click();
        softAssert.assertTrue(loginPage.usernameBox.isDisplayed(),"Test for visibility of 'Username Textbox' is failed!");
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        softAssert.assertTrue(loginPage.passwordBox.isDisplayed(),"Test for visibility of 'Password Textbox' is failed!");
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        softAssert.assertTrue(loginPage.loginButton.isDisplayed(),"Test for visibility of 'Log in Button' is failed!");
        loginPage.loginButton.click();
        softAssert.assertAll();


    }

}
