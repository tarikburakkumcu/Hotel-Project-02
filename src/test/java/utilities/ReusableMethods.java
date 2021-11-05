package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
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


    public static void login() {

        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();

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

    public static void goToUrl () {
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
    }



    public static void hotelRooms () {
        DefaultPage defaultPage = new DefaultPage();
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelRoomsLinki.click();
    }


    public static void waitFor ( int sec) {

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollTo (WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        waitFor(2);
    }

    public static String getScreenshot (String name) throws IOException {

        String date = new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);

        return target;
    }

}
