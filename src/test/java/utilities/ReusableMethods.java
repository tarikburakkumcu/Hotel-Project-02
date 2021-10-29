package utilities;

import pages.LoginPage;
import pages.MainPage;

public class ReusableMethods {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    public void login() {

        goToUrl();

        /*
    (Oguz)
    Mehmet Hoca'nin bahsettigi: "Tum testleri birlikte calistirmak, calisan bazi test case'lerin calismamasina sebep olabilir"
    sorununa onlem olarak asagidaki adimlari ekledim.
    Orn: Log In -> Log Out problemi.
    */
        mainPage.loginLink.click();
            if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
                goToUrl();
                mainPage.loginLink.click();
            }

        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.loginButton.click();

    }

    public void goToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
    }
}
