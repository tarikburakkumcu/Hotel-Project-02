package test.smokeTests.uS_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_0010_QAConcortPage {

    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    Faker faker;
    Actions actions;
    US_0010_QAConcortPage us_0010_qaConcortPage;

    public US_0010_QAConcortPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void ConcortHotelLogin() {
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

    public void geriGitmeTusu() {
        Driver.getDriver().navigate().back();

    }

    @FindBy(className = "btn-custom")
    public WebElement createANewAccountButton;

    @FindBy(id = "UserName")
    public WebElement userNameButonu;

    @FindBy(className ="modal-content")
    public WebElement alertYazisiFromRegisterPage;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okButtoninRegisterPage;


    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement okButtoninRezervationPage;


    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButtonForNewUser;

    @FindBy(id = "btnSubmit")
    public WebElement loginSubmitButtonForNewUser;

    @FindBy(xpath = "//div[@class='form-group']")
    public WebElement checkForTrueLoginNewUser;

    @FindBy(xpath = "(//a[@class='btn-custom'])[1]")
    public WebElement rastgeleBirBookRoomsButtonu;

    @FindBy(className = "modal-body")
    public WebElement rezervationMadeSucessfulyYazisi;

    @FindBy(xpath = "(//a[text()=' here '])[2]")
    public WebElement hereTextiRezervationPage;

    @FindBy(xpath = "//h2[@class='mb-4']")
    public WebElement rezervasyonDetaylariButonu;

    @FindBy(id = "divReservationResult")
    public WebElement rezervasyonDetaylariButonuWithOk;

    @FindBy(xpath = "//input[@name='CheckoutDate']")
    public WebElement checkOutDateButton;



    public void loginAsNewUser() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("mainUrl"));

        actions.click(loginButtonForNewUser).perform();
        Thread.sleep(1000);
        actions.sendKeys( userNameButonu,"bilalkaya1").
                sendKeys(Keys.TAB).sendKeys("Bilalkaya1!").sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

    public void kayitKismiCheckDateler() throws InterruptedException {
        us_0010_qaConcortPage = new US_0010_QAConcortPage();
        Thread.sleep(2000);

        us_0010_qaConcortPage.checkinDate.click();
        us_0010_qaConcortPage.checkinDate.clear();
        us_0010_qaConcortPage.checkinDate.sendKeys("12/12/2021");

        us_0010_qaConcortPage.checkOutDateButton.click();
        us_0010_qaConcortPage.checkOutDateButton.clear();
        us_0010_qaConcortPage.checkOutDateButton.sendKeys("12/18/2021" +Keys.TAB);

        Thread.sleep(2000);
    }
    public void kayitIcinKullanilanActions() throws InterruptedException {
        faker = new Faker();
        actions = new Actions(Driver.getDriver());
        actions .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.name().name()).sendKeys(Keys.TAB).sendKeys(faker.finance().creditCard())
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).sendKeys("123").sendKeys(Keys.TAB)
                .sendKeys("Thanks!").sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(2000);
    }
    String userNameForCreation = "bilalkaya1";
    String passwordForCreation = "Bilalkaya1!";
    String emailForCreation = "bilalkaya_1998@hotmail.com";
    String ReservationDetails = "Reservation Details";
    String fullNameForCreation = "ibrahim bilal kaya";
    String ReservationDetailsJustClickOk = "Reservation was made successfully";
}


