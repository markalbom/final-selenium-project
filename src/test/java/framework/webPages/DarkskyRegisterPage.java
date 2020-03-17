package framework.webPages;

import org.openqa.selenium.By;

public class DarkskyRegisterPage extends DarkskyHomePage {
    private By darkskyRegisterBanner = By.xpath("//h1[@class='stand-alone title']");
    private By registerButton = By.xpath("//button[@type= 'submit']");


    public String getRegisterBannerText(){
        return getTextFromElement(darkskyRegisterBanner);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
}
