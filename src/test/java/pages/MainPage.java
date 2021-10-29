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


    @FindBy (xpath = "//li[contains( @id, 'Log')]")
    public WebElement loginLink;

    @FindBy (linkText = "Home")
    public WebElement homeLink;

    @FindBy (linkText = "Rooms")
    public WebElement roomsLink;

    @FindBy (linkText = "Restaurant")
    public WebElement restaurantLink;

    @FindBy (linkText = "About")
    public WebElement aboutLink;

    @FindBy (linkText = "Blog")
    public WebElement blogLink;

    @FindBy (linkText = "Contact")
    public WebElement contactLink;

}
