package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class DefaultPage {
   public DefaultPage() {

      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//span[text()='Hotel Management']")
   public WebElement hotelManagementLinki;

   @FindBy(partialLinkText = "Hotel Rooms")
   public WebElement hotelRoomsLinki;

   @FindBy(xpath = "//span[text()='List Of Hotelrooms']")
   public WebElement listOfHotelRooms;

    @FindBy(partialLinkText = "Room reservation")
    public WebElement roomReservationLinki;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfRoomReservation;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
   public WebElement listOfHotelRoomsDetailsButon;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;

    @FindBy(xpath = "//input[@name='ContactNameSurname']")
    public WebElement contactNameSurnameKutusu;

    @FindBy(linkText = "ListOfUsers")
    public WebElement listOfUsersText;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButonu;

    @FindBy (xpath = "//span[text()='Add Hotelroom ']")
    public WebElement addHotelRoomBtn;

    @FindBy(xpath = "//th[@class='sorting_asc']")
    public WebElement contactNameSurnameKutusuGecis;

    @FindBy(xpath ="//div[@class='caption']")
    public WebElement createHotelRoomText;

    @FindBy(xpath = "//a[@class='btn btn-xs default']")
    public WebElement detailsButonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement editHotelRoomReservationButonu;

    @FindBy(id = "btnDelete")
    public WebElement deleteButonu;

    @FindBy(xpath = "//input[@id='Approved']")
    public WebElement generalDataApprovedButonu;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public WebElement tipListesi;

    @FindBy(id = "txtBarcodeCode")
    public WebElement codeButonu;

    @FindBy(xpath = "//input[@id='IsPaid']")
    public WebElement generalDataIsPaid;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement generalDataSaveButonu;

    @FindBy(xpath = "//a[text()='Properties']")
    public WebElement propertiesLinki;

    @FindBy(xpath = "(//*[@class='btn btn-xs default'])[1]")
    public WebElement detailsHotelLinki;

}
