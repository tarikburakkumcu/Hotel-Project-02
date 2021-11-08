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

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;

    @FindBy(partialLinkText = "Room reservation")
    public WebElement roomReservationLinki;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfRoomReservation;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement listOfHotelRoomsDetailsButon;

    @FindBy(xpath = "//input[@name='ContactNameSurname']")
    public WebElement contactNameSurnameKutusu;

    @FindBy(linkText = "ListOfUsers")
    public WebElement listOfUsersText;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButonu;

    @FindBy(xpath = "//span[text()='Add Hotelroom ']")
    public WebElement addHotelRoomBtn;

    @FindBy(xpath = "//th[@class='sorting_asc']")
    public WebElement contactNameSurnameKutusuGecis;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomText;

    @FindBy(xpath = "//a[@class='btn btn-xs default']")
    public WebElement detailsButonu;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelLink;

    @FindBy(id = "Code")
    public WebElement addHotelCodeKutusu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement editHotelRoomReservationButonu;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroupHotelEkle;

    @FindBy(id = "btnDelete")
    public WebElement deleteButonu;

    @FindBy(id = "btnSubmit")
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public WebElement tipListesi;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement hotelWasInsertedSuccessfullyYazısı;

    @FindBy(id = "txtBarcodeCode")
    public WebElement codeButonu;

    @FindBy(xpath = "//input[@id='IsPaid']")
    public WebElement generalDataIsPaid;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButonu;

    @FindBy(id = "txtBarcode")
    public WebElement valueButonu;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement generalDataSaveButonu;

    @FindBy(xpath = "//input[@name='IDHotel']")
    public WebElement otelListidCheck;

    @FindBy(xpath = "//a[text()='Properties']")
    public WebElement propertiesLinki;

    @FindBy(xpath = "//*[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelSearchButton;

    @FindBy(xpath = "//select[@class='form-control form-filter input-sm']")
    public WebElement idGroupSearch;

    @FindBy(xpath = "(//*[@class='btn btn-xs default'])[1]")
    public WebElement detailsHotelLinki;

    @FindBy(xpath = "(//button[@class='btn green'])[2]")
    public WebElement propertiesSaveButonu;

    @FindBy(xpath = "//input[@id='DateStart']")
    public WebElement dateStart;

    @FindBy(xpath = "//span[text()='Add Room Reservation ']")
    public WebElement addRoomReservationButonu;
}
