package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.List;

public class HotelsHomePage extends BasePage {

    private By hotelsDestinationSearchBox = By.xpath("//input[@name = 'q-destination']");
    private By hotelsCloseAutoFillBox = By.xpath("//button[@class = 'cta cta-link']");
    private By hotelsSubmitButton = By.xpath("//button[@class = 'cta cta-strong']");

    private By hotelNumberOfRoomsSelector = By.xpath("//select[@id = 'qf-0q-rooms']");
    private By hotelNumberOfRoomsDropdownOptions = By.xpath("//select[@id=\"qf-0q-rooms\"]");
    private By hotelMultipleRoomsDisplayed = By.xpath("//div[@class='widget-query-group widget-query-rooms widget-query-rooms-multiple']");
    private By hotelRoomsDisplayed = By.xpath("//div[@class = 'widget-query-group widget-query-room-options']");


    public void setHotelsLocationDestination () {
        setValue(hotelsDestinationSearchBox, "Las Vegas, Nevada, United States of America");
    }

    public void closeAutofillBox(){
        clickOn(hotelsCloseAutoFillBox);
    }

    public void submitLocationDestination() {
        clickOn(hotelsSubmitButton);
    }

    public void clickRoomNumberSelector(){
        clickOn(hotelNumberOfRoomsSelector);
    }
    public void chooseNumberOfRooms(String roomNum){
            selectFromDropdown(hotelNumberOfRoomsDropdownOptions, roomNum);

    }

    public boolean isRoomDisplayed(String rooms){ //"1"
        boolean isDisplayed = false;
        int roomInt = Integer.parseInt(rooms); //1
        if (roomInt == 0) {                             //if roomInt is 0
            try {
                SharedSD.getDriver().findElements(hotelRoomsDisplayed);     //try to find the room divs
            } catch (NoSuchElementException e) {                            //if no such element is found
                isDisplayed = true;                                         //switch isDisplayed to true (means it passed; 9+ rooms yield 0 divs)
            }
        } else {
            List <WebElement> roomsDisplayed = SharedSD.getDriver().findElements(hotelRoomsDisplayed); // 3 divs
            int numberOfRoomsDisplayed = roomsDisplayed.size(); //3

            if (numberOfRoomsDisplayed == roomInt){
                isDisplayed = true;
            }
        }
        return isDisplayed;
    }

}
