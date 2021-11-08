package test.smokeTests.uS_0002;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_0001 {

    // 1)Giriş yapmak için "Log in" butonu  gorunur olmali ve kullanılabilmeli

    ReusableMethods reusableMethods = new ReusableMethods();
    MainPage mainPage = new MainPage();


    @Test
    public void test1 () {

        SoftAssert softAssert = new SoftAssert();

        reusableMethods.goToUrl();
        softAssert.assertTrue(mainPage.loginLink.getText().equals("Log in"),"Test for visibility of 'Log in Link' is failed!");
        mainPage.loginLink.click();









    }
}
