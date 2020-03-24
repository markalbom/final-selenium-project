package stepdefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.HotelsHomePage;
import org.testng.Assert;

public class HotelsRoomCountSD {
    HotelsHomePage hotelsPage = new HotelsHomePage();

    @Given("^I am on hotels.com home page$")
    public void verifyOnHotelsHomepage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations", "not the results page");
    }

    @Then("^I select (.+) from room dropdown$")
    public void selectNumberOfRooms(String numberOfRooms){
        hotelsPage.chooseNumberOfRooms(numberOfRooms);


    }
    @And("^I verify (\\d) is displayed$")
    public void verifyRoomsDisplayedAccordingly(String rooms){
        hotelsPage.isRoomDisplayed(rooms);

    }

}
