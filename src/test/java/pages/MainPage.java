package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainPage {

    public MainPage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//li[contains( @id, 'Log')]")
    public WebElement loginLink;

    @FindBy (linkText = "Home")
    public WebElement homeLink;

    @FindBy (linkText = "Rooms")
    public WebElement roomsLink;

    @FindBy (linkText = "Restaurant")
    public WebElement restaurantLink;

    @FindBy (linkText = "About")
    public WebElement aboutLink;

    @FindBy (linkText = "Blog")
    public WebElement blogLink;

    @FindBy (linkText = "Contact")
    public WebElement contactLink;

    @FindBy (xpath = "//label[.='Check-in Date']")
    public WebElement checkInDateText;

    @FindBy (xpath = "//label[.='Check-out Date']")
    public WebElement checkOutDateText;

    @FindBy (xpath = "//label[.='Check-out Date']")
    public WebElement roomText;

    @FindBy (xpath = "//label[.='Check-out Date']")
    public WebElement customerText;

    @FindBy (css = ".checkout_date")
    public WebElement checkOutDateUpdate;

    @FindBy (css = ".checkin_date")
    public WebElement checkInDateUpdate;

    @FindBy (xpath = "//td [contains (@class, 'active')  or starts-with (@class, 'day') or contains (@class, 'new')]")
    public List<WebElement> availableDays;

    @FindBy (css = "#IDRoomType")
    public WebElement roomTypeDropdown;

    @FindBy (css = "#AdultCount")
    public WebElement adultCountDropdown;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement checkAvailabilityButton;

    @FindBy (xpath = "//h2[text()='Welcome To Our Hotel']")
    public WebElement welcomeToOurHotelPart;

    @FindBy (xpath = "//span[@class='icon-search2']")
    public WebElement ourRoomsPart;

    @FindBy (xpath = "//a[@href='rooms.html']")
    public List <WebElement> ourRoomsPartRoomNames;

    @FindBy (xpath = "//h2[@class='mb-4']")
    public WebElement getOurRoomsPartSelectedRoomName;

    @FindBy (xpath = "//section[@class='ftco-section testimony-section bg-light']")
    public WebElement customerCommentPart;

    @FindBy (xpath = "//button[contains (@class, 'owl-dot')]")
    public List <WebElement> customerCommentSliderButtons;

    @FindBy (xpath = "//section[@class= 'ftco-section testimony-section bg-light']//div[@class= 'owl-item active']")
    public WebElement activeCustomerComment;

    @FindBy (xpath = "//h2[.='Recent Blog']")
    public WebElement recentBlogPart;

    @FindBy (xpath = "//div[@class='blog-entry align-self-stretch']")
    public List <WebElement> recentBlogPartBlogs;

    @FindBy (xpath = "//span[.='Instagram']")
    public WebElement instagramPart;

    @FindBy (xpath = "//a[@class='insta-img image-popup']")
    public List <WebElement> instagramPartPictures;

    @FindBy (xpath = "//button[@title='Close (Esc)']")
    public WebElement instagramPartEscButton;

    @FindBy (xpath = "//h2[.='Concort Hotel']")
    public WebElement footerPart;

    @FindBy (xpath = "//h2[.='Concort Hotel']")
    public WebElement footerPartConcortHotel;

    @FindBy (xpath = "//h2[.='Concort Hotel']")
    public WebElement footerPartUsefulLinks;

    @FindBy (xpath = "//h2[.='Concort Hotel']")
    public WebElement footerPartPrivacy;

    @FindBy (xpath = "//h2[.='Concort Hotel']")
    public WebElement footerPartHaveAQuestions;




    public String selectedInDateControl (String day) {
        String xpath = "//input[contains(@value, '/"+day+"/2021' ) and @id='checkin_date']";
        return xpath;
    }

    public String selectedOutDateControl (String day) {
        String xpath = "//input[contains(@value, '/"+day+"/2021' ) and @id='checkout_date']";
        return xpath;
    }


    public String randomSelectedDayForIn (int randomDayForIn) {
        String xpath = "(//td [contains (@class, 'active')  or starts-with (@class, 'day') or contains (@class, 'new')])["+randomDayForIn+"]";
        return xpath;
    }

    public String randomSelectedDayForOut (int randomDayForOut) {
        String xpath = "(//td [contains (@class, 'active')  or starts-with (@class, 'day') or contains (@class, 'new')])["+randomDayForOut+"]";
        return xpath;
    }


}
