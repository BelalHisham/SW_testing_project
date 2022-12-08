import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class HomePage {


    private static final String PAGE_URL = "https://phptravels.net/login";


    public static final By EMAIL = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input");
    public static final By PASSWORD = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input");

    public static final By FIRST_NAME = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/input[1]");
    public static final By LAST_NAME = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td[3]/div/input");
    public static final By PHONE = By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input");

    @FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input")
    private WebElement email;

    @FindBy (xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
    private WebElement password;

    @FindBy (xpath = "//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")
    private WebElement login_button;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/span")
    private WebElement welcome_msg;

    // Hotel booking

    @FindBy (xpath = "//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[1]/a")
    private WebElement hotel_link;

    @FindBy (xpath = "//*[@id=\"fadein\"]/section[2]/div/div/div[2]/div/div/div/div[1]/div/div[6]/div/div[1]/a/img")
    private WebElement rendezvous_hotels_link;

    @FindBy (xpath = "/html/body/section[1]/div[3]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/form/div/div[5]/div/button")
    private WebElement book_now_button;

    @FindBy (xpath = "//*[@id=\"fadein\"]/section[1]/div/div/div/div/div/div/h2")
    private WebElement hotel_booking_msg;



    // Book a flight

    @FindBy(xpath = "//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[1]/nav/ul/li[2]/a")
    private WebElement flight_link;

    @FindBy(xpath = "/html/body/div[4]/section/div[2]/div/div/div[1]/div/div/div[2]/a/div")
    private WebElement philippines_link;

    @FindBy(xpath = "//*[@id=\"data\"]/ul/li[1]/div/form/div/div[2]/div/button/span")
    private WebElement book_f_now_button;



    // Edit profile


    @FindBy(xpath = "//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a")
    private WebElement profile_link;

    @FindBy (xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/input[1]")
    private WebElement first_name;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[2]/td[3]/div/input")
    private WebElement last_name;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[3]/td[3]/div/input")
    private WebElement phone;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
    private WebElement update_button;

    @FindBy(xpath = "//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div")
    private WebElement profile_msg;




    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        login_button.click();
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public String getWelcomeMsg() {
        return welcome_msg.getText();
    }


    public void clickHotelLink(){
        hotel_link.click();
    }

    public void clickRendezvousHotelsLink(){
        rendezvous_hotels_link.click();
    }

    public void clickBookNowButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(book_now_button).click();
//        book_now_button.click();
    }


    public String getHotelBookingMsg() {
        return hotel_booking_msg.getText();
    }


    public void clickFlightLink(){
        flight_link.click();
    }

    public void clickPhilippinesLink(){
        philippines_link.click();
    }
    public void clickBookFlightNow(){
        book_f_now_button.click();
    }


    public void clickProfileLink(){
        profile_link.click();

    }


    public void clickUpdateProfile(){
        update_button.click();

    }

        public String getProfileMsg() {
        return profile_msg.getText();
    }









}
