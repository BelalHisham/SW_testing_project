import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class MyStepdef {

    static WebDriver driver;
    private static final int WAIT_TIME = 10;
    private static HomePage homePage;




    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        //options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        homePage = new HomePage(driver);

    }


    @Given("the homepage is open")
    public void the_homepage_is_open() {
        homePage.openPage();
    }

    @And("the Login word is clicked")
    public void the_login_word_is_clicked() {
        homePage.clickLoginWord();
    }

    @And("the Username is filled with {string}")
    public void the_username_is_filled_with(String userName) {
        homePage.fillField(HomePage.USERNAME, userName);
    }

    @And("the Password is filled with {string}")
    public void the_password_is_filled_with(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @And("the Login button is clicked")
    public void the_login_button_is_clicked() {
        homePage.clickLoginButton();
    }

    @Given("the Samsung galaxy s6 is opened")
    public void the_samsung_galaxy_s6_is_opened() {
        homePage.clickSamsung();
    }

    @And("the cart button is clicked")
    public void the_cart_button_is_clicked() {
        homePage.clickCartButton();
    }

    @When("the cart word is clicked")
    public void the_cart_word_is_clicked() {
        homePage.clickCartWord();
    }

    @Then("{string} should be shown")
    public void should_be_shown(String total) {
        Assert.assertEquals(total, homePage.getTotal());

    }

}
