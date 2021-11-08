package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateRoomReservationPage {

    public CreateRoomReservationPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "IDUser")
    public WebElement selectUserDropDown;

    @FindBy(id = "IDHotelRoom")
    public WebElement selectHotelDropDown;

    @FindBy(xpath = "//div[text()='RoomReservation was inserted successfully']")
    public WebElement successAllert;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement successAllertOkButonu;

}