package framework.webPages;

import org.openqa.selenium.By;

public class DarkskyAPIPage extends DarkskyHomePage {
    private By darkskyApiSignUpLink = By.xpath("//a[@href = '/dev/register']");

    public void clickDarkskyApiSignUpLink (){
        clickOn(darkskyApiSignUpLink);
    }
}
