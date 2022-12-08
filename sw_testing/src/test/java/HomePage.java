import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static final String PAGE_URL = "https://www.demoblaze.com/index.html";
    private static final String PAGE_URL_samsung = "https://www.demoblaze.com/prod.html?idp_=1";


    public static final By USERNAME = By.id("loginusername");
    public static final By PASSWORD = By.id("loginpassword");


    public static final By CONTACT_EMAIL = By.id("recipient-email");
    public static final By CONTACT_NAME = By.id("recipient-name");
    public static final By CONTACT_MESSAGE = By.id("message-text");

    // click
    @FindBy(id = "login2")
    private WebElement login_word;

    @FindBy(id = "loginusername")
    private WebElement user_name;

    @FindBy(id = "loginpassword")
    private WebElement password;

    // click
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement login_button;

    // click
//    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/a/img")
//    private WebElement Samsung_galaxy_s6;

    // click
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[2]/a")
    private WebElement cart_button;


    // click
    @FindBy(id = "cartur")
    private WebElement cart_word;

    @FindBy(id = "totalp")
    private WebElement total;



    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[2]/a")
    private WebElement contact_link;

    @FindBy(id = "recipient-email")
    private WebElement contact_email;


    @FindBy(id = "recipient-name")
    private WebElement contact_name;

    @FindBy(id = "message-text")
    private WebElement contact_message;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[2]")
    private WebElement send_button;


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void clickLoginWord() {
        login_word.click();
    }

    public void clickLoginButton() {
        login_button.click();
    }

    public void clickSamsung() {

//        Samsung_galaxy_s6.click();
        driver.get(PAGE_URL_samsung);
        PageFactory.initElements(driver, this);
    }

    public void clickContactLink() {
        contact_link.click();
    }
    public void clickCartButton() {
        cart_button.click();
    }

    public void clickCartWord() {
        cart_word.click();
    }

    public String getTotal() {
        return total.getText();
    }


    public void clickSendMessage() {
        send_button.click();
    }







}
