import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class contactStepDef {
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

    @Given("contact link clicked")
    public void contactLinkClicked() {
        homePage.clickContactLink();
    }

    @And("contact email filled with {string}")
    public void contactEmailFilledWithEmailTestingCom(String email) {
        homePage.fillField(HomePage.CONTACT_EMAIL, email);
    }

    @And("contact name filled with {string}")
    public void contactNameFilledWithBelal( String name) {
        homePage.fillField(HomePage.CONTACT_NAME, name);
    }

    @And("message written {string}")
    public void messageWrittenHelloWorld(String message) {
        homePage.fillField(HomePage.CONTACT_MESSAGE, message);
    }


    @Then("send message is clicked")
    public void sendMessageIsClicked() {
        homePage.clickSendMessage();
    }


}
