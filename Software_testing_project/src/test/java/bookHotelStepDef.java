import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class bookHotelStepDef extends StepDefs  {
    @And("Hotel link is clicked")
    public void hotelLinkIsClicked() {
        homePage.clickHotelLink();

    }

    @And("Rendezvous Hotels link is clicked")
    public void rendezvousHotelsLinkIsClicked() {
        homePage.clickRendezvousHotelsLink();
    }

    @And("Book H Now button is clicked")
    public void bookNowButtonIsClicked() {
        homePage.clickBookNowButton();
    }

    @Then("{string} should be shown H")
    public void hotelBooking(String hotelMsg) {
        Assert.assertEquals(hotelMsg, homePage.getHotelBookingMsg());
    }
}
