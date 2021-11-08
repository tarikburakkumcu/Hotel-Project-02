package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    public WebElement regUserNameText;

    @FindBy(id = "Password")
    public WebElement regPasswordText;

    @FindBy(id = "Email")
    public WebElement regEmailText;

    @FindBy(id = "NameSurname")
    public WebElement regFullNameText;

     @FindBy (id = "PhoneNo")
    public WebElement regPhoneNoText;

     @FindBy(id = "SSN")
    public WebElement regSSNText;

     @FindBy(id = "DrivingLicense")
    public WebElement regDrivingLicenseText;

     @FindBy(id = "IDCountry")
    public WebElement regCountryText;

     @FindBy(id="IDState")
    public WebElement regStateText;

     @FindBy(id = "Address")
    public WebElement regAddressText;

     @FindBy(id = "WorkingSector")
    public WebElement regWorkingSectorText;

     @FindBy(id = "BirthDate")
    public WebElement regBirthDateText;

     @FindBy(id = "btnSubmit")
    public WebElement regSaveButton;

     @FindBy(xpath = "(//div[text()='User Data was inserted successfully'])[2]")
     public WebElement regAlertMessage;

     @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement regOkButton;


}