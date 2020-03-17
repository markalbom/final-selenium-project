package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.DarkskyAPIPage;
import framework.webPages.DarkskyHomePage;
import framework.webPages.DarkskyRegisterPage;
import org.testng.Assert;

public class DarkskyInvalidApiLoginSD {
    BasePage basePage = new BasePage();
    DarkskyHomePage darkskyHomePage = new DarkskyHomePage();
    DarkskyAPIPage darkskyApi = new DarkskyAPIPage();
    DarkskyRegisterPage darkskyRegister = new DarkskyRegisterPage();

    @Given("^I am on DarkSky Register Page$")
    public void iamOnDarkskyRegisterPage () {
        darkskyHomePage.clickDarkskyApiLink();
        darkskyApi.clickDarkskyApiSignUpLink();
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky API: Register", "Not the Register Page");
    }

    @When("^I click on register button$")
    public void clickRegisterButton () throws InterruptedException {
        Thread.sleep(4000);
        darkskyRegister.clickOnRegisterButton();

    }

    @Then("^I verify I am on the DarkSky Register Page by asserting the Register Header$")
    public void verifyDarkskyRegisterPage () {
        Assert.assertEquals(darkskyRegister.getRegisterBannerText(), "Register");
    }

}
