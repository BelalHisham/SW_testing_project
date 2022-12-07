import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyStepdefs extends StepDefs {





    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        homePage.openPage();
    }

    @Given("the Email is filled with {string}")
    public void theEmailIsFilledWithAgentPhptravelsCom(String email) {
        homePage.fillField(HomePage.EMAIL, email);
    }

    @And("the Password is filled with {string}")
    public void thePasswordIsFilledWithDemoagent(String password) {
        homePage.fillField(HomePage.PASSWORD, password);
    }

    @And("the Login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickLoginButton();
    }

    @Then("{string} should be shown")
    public void welcomeBackShouldBeShown(String welcome_msg) {
        Assert.assertEquals(welcome_msg, homePage.getWelcomeMsg());
    }

    @Then("<msg> should appear")
    public void msgShouldAppear() {

    }
}
