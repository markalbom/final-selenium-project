package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.DarkskyHomePage;
import framework.webPages.HomePage;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.*;

public class DarkskyCurrentTempSD {

    private DarkskyHomePage darkskyHomePage = new DarkskyHomePage();

    @Given("^I am on DarkSky home page$")
    public void iamOnDarkskyHomePage(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - Broadway, New York, NY", "Invalid Home Page");

    }
        //grabs locators from main synopsis, not the timeline
//    @Then("^I verify the current temperature is between the expected 'low' and 'high'$")
//    public void temperatureIsInBetween() {
//        Integer currentTemperatureNumber = Integer.parseInt(darkskyHomePage.getCurrentTemperatureText().substring(0,2));
//        Integer highTemperatureNumber = Integer.parseInt(darkskyHomePage.getHighTemperatureText().substring(0,2));
//        Integer lowTemperatureNumber = Integer.parseInt(darkskyHomePage.getLowTemperatureText().substring(0,2));
//        Assert.assertTrue ((currentTemperatureNumber <= highTemperatureNumber) && (currentTemperatureNumber >= lowTemperatureNumber), "current temp above / below range");
//    }

    @Then("^I verify the current temperature is between the expected 'low' and 'high'$")
    public void CurrentTemperatureIsInBetween() {
        List <Integer> tempList = darkskyHomePage.getSortedTimelineTemperaturesInt();

        Integer currentTemperatureNumber = Integer.parseInt(darkskyHomePage.getCurrentTemperatureText().substring(0,2));
        Assert.assertTrue((currentTemperatureNumber >= tempList.get(0)) && (currentTemperatureNumber <= tempList.get(tempList.size()-1)));


    }

    @Then("^I verify the timeline is displayed in 2 hour increments$")
    public void temperatureTimeline(){


        //create calender obj,
        Calendar cal = Calendar.getInstance();

        //create date obj, get right format ("h")
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        Date date = cal.getTime();

        //call getTimelineHours from DarkskyHomePage - gives int array list of hours


        //compare to see if difference is by 2 or not


    }

}
