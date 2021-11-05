package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;


public class gitHotelRoomPage {
    public HotelRoomPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="Code")
    public WebElement editHotelRoomCode;

    @FindBy(id ="Name")
    public WebElement editHotelRoomName;

    @FindBy(id = "Location")
    public WebElement editHotelRoomLocation;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement editHotelRoomDescription;

    @FindBy(id = "Price")
    public WebElement editHotelRoomPrice;

    @FindBy (id = "MaxAdultCount")
    public WebElement editHotelRoomMaxAdultCount;

    @FindBy (id = "MaxChildCount")
    public WebElement editHotelRoomMaxChildrenCount;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement editHotelRoomSaveButton;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement editHotelRoomUpdatedButton;

    @FindBy (xpath = "//button[@id='btnDelete']")
    public WebElement editHotelRoomDeleteButton;

    @FindBy   (xpath = "//button[@class='btn btn-primary']")
    public WebElement editHotelRoomDeleteOkButton;

    @FindBy   (xpath = "//button[@class='btn btn-primary']")
    public WebElement editHotelRoomErrorOkButton;

    @FindBy (linkText = "Properties")
    public WebElement editHotelRoomPropertiesButton;

    @FindBy (id = "txtBarcodeCode")
    public WebElement editHotelRoomAddPropertyCode;

    @FindBy (id = "txtBarcode")
    public WebElement editHotelRoomAddPropertyValue;

    @FindBy (xpath = "(//button[@class='btn green'])[2]")
    public WebElement editHotelRoomAddPropertySaveButton;

    @FindBy (xpath = "//button[@id='btnDelete']")
    public WebElement editHotelRoomPropertiesDeleteButton;

    @FindBy (xpath = "(//button[@type='button'])[7]")
    public WebElement editHotelRoomPropertiesDeleteOkButton;

    @FindBy   (xpath = "//button[@class='btn btn-primary']")
    public WebElement editHotelRoomPropertiesErrorOkButton;


    @FindBy (id = "IsAvailable")
    public WebElement editHotelRoomIsAvailableButton;













}
