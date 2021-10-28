package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Map;

public class MainPage {

    public MainPage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Log in")
    public WebElement loginLink;

}
