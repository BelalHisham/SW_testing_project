import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class bookFlightStepDef extends StepDefs {
    @And("Flight link is clicked")
    public void flightLinkIsClicked() {
        homePage.clickFlightLink();
    }

    @And("Air Philippines link is clicked")
    public void airPhilippinesLinkIsClicked() {
        homePage.clickPhilippinesLink();
    }

    @And("Book F Now button is clicked")
    public void bookFNowButtonIsClicked() {
        homePage.clickBookFlightNow();
    }

//    @Then("{string} should be shown F")
//    public void flightsBookingShouldBeShownF() {
//    }
}
