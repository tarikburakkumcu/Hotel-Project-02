//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;

public class ReusableMethods {
    public ReusableMethods() {
    }

    public static void login() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        goToUrl();
        mainPage.loginLink.click();
        if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
            goToUrl();
            mainPage.loginLink.click();
        }

        loginPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("validUserName")});
        loginPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("validPassword")});
        loginPage.loginButton.click();
    }

    public static void goToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));
    }

    public static void hotelRooms() {
        DefaultPage defaultPage = new DefaultPage();
        defaultPage.hotelManagementLinki.click();
        defaultPage.hotelRoomsLinki.click();
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep((long)(sec * 1000));
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }

    public static void scrollTo(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
        waitFor(2);
    }

    public static String getScreenshot(String name) throws IOException {
        String date = (new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss")).format(new Date());
        TakesScreenshot takesScreenshot = (TakesScreenshot)Driver.getDriver();
        File source = (File)takesScreenshot.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
}

