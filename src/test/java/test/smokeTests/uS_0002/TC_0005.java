package test.smokeTests.uS_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_0005 {

    // 5)Giriş yapıldığı " ListOfUsers  " yazısının görünürlüğü ile kontrol edilmeli

    ReusableMethods reusableMethods = new ReusableMethods();
    MainPage mainPage = new MainPage();
    LoginPage loginPage=new LoginPage();
    DefaultPage defaultPage=new DefaultPage();

    @Test
    public void test5 () {

        SoftAssert softAssert = new SoftAssert();
        reusableMethods.goToUrl();
        try {
            if (Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))){
                softAssert.assertTrue(mainPage.loginLink.getText().equals("Log in"),"Test for visibility of 'Log in Link' is failed!");
            }
        } catch (Exception e ) {
        }
        mainPage.loginLink.click();
        try {
            if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
                ReusableMethods.goToUrl();
                softAssert.assertTrue(mainPage.loginLink.getText().equals("Log in"),"Test for visibility of 'Log in Link' is failed!");
                mainPage.loginLink.click();
            }
        } catch (Exception e) {
        }

        softAssert.assertTrue(loginPage.usernameBox.isDisplayed(),"Test for visibility of 'Username Textbox' is failed!");
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        softAssert.assertTrue(loginPage.passwordBox.isDisplayed(),"Test for visibility of 'Password Textbox' is failed!");
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        softAssert.assertTrue(loginPage.loginButton.isDisplayed(),"Test for visibility of 'Log in Button' is failed!");
        loginPage.loginButton.click();
        softAssert.assertTrue(defaultPage.listOfUsersText.isDisplayed(),"Test for visibility of 'List Of Users' text is failed!");
        softAssert.assertAll();


    }


}
