package test.smokeTests.uS_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_0002 {


    // 2)Login sayfasında username textbox görünürlüğü kontrol edilmeli ve username girilmeli

    ReusableMethods reusableMethods = new ReusableMethods();
    MainPage mainPage = new MainPage();
    LoginPage loginPage=new LoginPage();


    @Test
    public void test2 () {

        SoftAssert softAssert = new SoftAssert();

        reusableMethods.goToUrl();
        softAssert.assertTrue(mainPage.loginLink.getText().equals("Log in"),"Test for visibility of 'Log in Link' is failed!");
        mainPage.loginLink.click();
        softAssert.assertTrue(loginPage.usernameBox.isDisplayed(),"Test for visibility of 'Username Textbox' is failed!");
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        softAssert.assertAll();


    }


}
