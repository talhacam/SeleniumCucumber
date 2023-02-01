package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {

    public HMCPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Log in']")
    public static WebElement login;

    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
    public static WebElement loginButonu;

    @FindBy (xpath = "//input[@class='form-control required']")
    public WebElement userNameKutusu;

    @FindBy (xpath = "//input[@class='form-control required password']")
    public WebElement passwordKutusu;

    @FindBy (id="btnSubmit")
    public WebElement loginButonu2;

    @FindBy (id="menuHotels")
    public WebElement hotelManagement;

    @FindBy(xpath = "//*[@id='UserName']")
    public static WebElement userName;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public static WebElement girisYapilamadi;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy (xpath="//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy (xpath = "//input[@name='Code']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy(xpath = "//*[text()='Add Room Reservation']")
    public WebElement addRoom;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;

}