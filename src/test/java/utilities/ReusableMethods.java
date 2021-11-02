package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    RegisterPage registerPage=new RegisterPage();
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

    public void hotelRooms() {
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelRoomsLinki.click();
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/raporlar/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

}
