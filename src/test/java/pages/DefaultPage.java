package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {
 public DefaultPage(){

     PageFactory.initElements(Driver.getDriver(),this);
 }

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//span[text()='List Of Hotelrooms']")
    public WebElement listOfHotelRooms;










}
