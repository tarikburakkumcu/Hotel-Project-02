package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {

    public DefaultPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement hotelListLink;


    @FindBy(xpath = "//span[text()='List Of Hotelrooms']")
    public WebElement listOfHotelRooms;

    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelLink;

    @FindBy(id="Code")
    public WebElement addHotelCodeKutusu;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroupHotelEkle;

    @FindBy(id="btnSubmit")
    public WebElement addHotelSaveButonu;

    @FindBy (xpath ="//div[@class='bootbox-body']")

    public WebElement hotelWasInsertedSuccessfullyYazısı;

    @FindBy (xpath ="//button[@class='btn btn-primary']")
    public WebElement okButonu;


    @FindBy(xpath ="//input[@name='IDHotel']")
    public WebElement otelListidCheck;

    @FindBy(xpath="//*[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelSearchButton;

    @FindBy(xpath = "//select[@class='form-control form-filter input-sm']")
    public WebElement idGroupSearch;

}
