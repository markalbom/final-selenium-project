package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomePage;
import framework.webPages.HotelsResultsPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HotelsDealPriceSD {
    HotelsHomePage hotelsPage = new HotelsHomePage();
    HotelsResultsPage hotelsResultsPage = new HotelsResultsPage();

    @Given("^I am on hotels default locations search result screen$")
    public void onLocationsResultsScreen() throws InterruptedException {
        hotelsPage.setHotelsLocationDestination();
        Thread.sleep(2000);
        hotelsPage.closeAutofillBox();
        Thread.sleep(3000);
        hotelsPage.submitLocationDestination();
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - hotels in Las Vegas, Nevada, United States of America", "not the results page");
    }

    @Then("^I verify today's deal is less than 200 dollars$")
    public void verifyTodaysDealLessThan200(){
        hotelsResultsPage.isPriceBelow200();
    }


    @When("^I select property class (.*) star from star selector$")
    public void selectHotelStar(String checkbox) {
        hotelsResultsPage.selectStarCheckbox(By.xpath(hotelsResultsPage.firstPart + checkbox + hotelsResultsPage.secondPart));

    }

    @Then("^I verify the system displays only (.*) star hotels on search results page$")
    public void verifyHotelRating (String star) {
        Assert.assertTrue(hotelsResultsPage.gatherFilteredHotels(star));
    }

    @When("^I verify the system displays all hotels within a 10 mile radius of the airport$")
    public void verifyDistance () throws InterruptedException {
        hotelsResultsPage.clickLandmarksFilter();
        hotelsResultsPage.clickDowntownFilter();
        Thread.sleep(2000);
        hotelsResultsPage.selectTenMile();
        hotelsResultsPage.isWithinTenMiles();


    }



}
