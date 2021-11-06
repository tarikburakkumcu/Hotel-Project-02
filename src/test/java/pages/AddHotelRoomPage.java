package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class AddHotelRoomPage {

    public AddHotelRoomPage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "IDHotel")
    public WebElement addHotelRoomSelectHotel;

    @FindBy(id = "Code")
    public WebElement addHotelRoomCode;

    @FindBy(id ="Name")
    public WebElement addHotelRoomName;

    @FindBy(id = "Location")
    public WebElement addHotelRoomLocation;

    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/textarea")
    public WebElement addHotelRoomDescription;

    @FindBy(id = "Price")
    public WebElement priceBox;

    @FindBy(linkText = "300")
    public WebElement price300;

    @FindBy(id = "IDGroupRoomType")
    public WebElement addHotelRoomType;

    @FindBy(id = "MaxAdultCount")
    public WebElement addHotelRoomMaxAdult;

    @FindBy(id = "MaxChildCount")
    public WebElement addHotelRoomMaxChild;

    @FindBy(id = "IsAvailable")
    public WebElement addHotelRoomApproved;

    @FindBy(id = "btnSubmit")
    public WebElement addHotelRoomSaveBtn;

    @FindBy(xpath="//div[@class='bootbox-body']")
    public WebElement addHotelRoomSuccessfully;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addHotelRoomOkBtn;

    @FindBy(className = "icon-arrow-up")
    public WebElement addHotelRoomArrowUp;
















}
