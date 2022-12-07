import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class profileStepDef extends StepDefs {
    @And("my profile link clicked")
    public void myProfileLinkClicked() {
        homePage.clickProfileLink();
    }

    @And("First name is filled with {string}")
    public void firstNameIsFilledWithFname(String FirstName) {
        homePage.fillField(HomePage.FIRST_NAME, FirstName);
    }

    @And("Last name is filled with {string}")
    public void lastNameIsFilledWithLname(String LastName) {
        homePage.fillField(HomePage.LAST_NAME, LastName);
    }

    @And("Phone is filled with {string}")
    public void phoneIsFilledWith(String Phone) {
        homePage.fillField(HomePage.PHONE, Phone);
    }

    @And("update profile button is clicked")
    public void updateProfileButtonIsClicked() {
        homePage.clickUpdateProfile();
    }

    @Then("{string} is shown")
    public void profileUpdatedSuccessfullyIsShown(String msg) {
        Assert.assertEquals(msg, homePage.getProfileMsg());
    }
}
