package test.smokeTests.uS_0010;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_0010_QAConcortPage {

    WebDriver driver;
    public US_0010_QAConcortPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void ConcortHotelLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("CHQAUrl"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("validUserName"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.creatButton.click();
    }

    @FindBy(xpath = "(//a[@class='btn-custom'])[1]")
    public WebElement viewRoomDetails1;

    @FindBy(xpath = "(//a[@class='btn-custom'])[2]")
    public WebElement viewRoomDetails2;

    @FindBy(xpath = "(//a[@class='btn-custom'])[3]")
    public WebElement viewRoomDetails3;

    @FindBy(xpath = "(//a[@class='btn-custom'])[4]")
    public WebElement viewRoomDetails4;

    @FindBy(xpath = "(//a[@class='btn-custom'])[5]")
    public WebElement viewRoomDetails5;

    @FindBy(xpath = "(//a[@class='btn-custom'])[6]")
    public WebElement viewRoomDetails6;

    @FindBy(xpath = "//h2[text()='Our Rooms']")
    public WebElement ourRoomsText;


    @FindBy(xpath = "//h3[text()='Advanced Search']")
    public WebElement advancedText;


    @FindBy(xpath = "//h4[text()='Available Room']")
    public WebElement availableRoom;

    @FindBy(id = "checkin_date")
    public WebElement checkinDate;


    @FindBy(xpath = "//h3[text()='Categories']")
    public WebElement categoriesText;

    @FindBy(xpath = "//a[text()='Single ']")
    public WebElement singleButton;

    @FindBy(xpath = "//a[text()='Double ']")
    public WebElement doubleButton;

    @FindBy(xpath = "//a[text()='Triple ']")
    public WebElement tripleButton;

    @FindBy(xpath = "//a[text()='Quad ']")
    public WebElement quadButton;

    @FindBy(xpath = "//a[text()='Queen ']")
    public WebElement queenButton;

    @FindBy(xpath = "//a[text()='King ']")
    public WebElement kingButton;

    @FindBy(xpath = "//a[text()='Twin ']")
    public WebElement twinButton;

    @FindBy(xpath = "//a[text()='Double-double ']")
    public WebElement doubleDoubleButton;

    @FindBy(xpath = "//a[text()='Studio ']")
    public WebElement studioButton;

    public void geriGitmeTusu(){
        Driver.getDriver().navigate().back();

    }

    @FindBy(className = "btn-custom")
    public WebElement createANewAccountButton;


}

