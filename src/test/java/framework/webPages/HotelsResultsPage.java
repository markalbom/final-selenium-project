package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HotelsResultsPage extends HotelsHomePage {
    private By todaysBestDealPrice = By.xpath("//a[@class = 'price-link']/ins");


    public String firstPart = "//input[@id='f-star-rating-";
    public String secondPart = "']";


    private By hotelsIndividualStarRating4and5 = By.xpath("//span[@class = 'star-rating-text star-rating-text-strong']"); //"5-star"
    private By hotelsIndividualStarRating12and3 = By.xpath(("//span[@class='star-rating-text']"));

    private By landmarksFilterButton = By.xpath("//h3[contains(text(),'Landmarks')]");
    private By cityCenterFilter = By.xpath("//label[@id='f-label-lid-1504033']");
    private By distanceSelector = By.xpath("//select[@id='f-distance']");
    private By hotelsFiltered = By.xpath("//div[@class = 'description resp-module']");
    private By individualHotelDistancetoCityCenter = By.xpath("//ul[@class = 'property-landmarks']/li");



   public boolean isPriceBelow200(){
       String todaysBestDealPriceString = getTextFromElement(todaysBestDealPrice);
       Integer todaysBestDealPriceInt = Integer.valueOf(todaysBestDealPriceString.substring(1, todaysBestDealPriceString.length()-1));
       if (todaysBestDealPriceInt > 200) {
           return false;
       }
       return true;
   }

   public void selectStarCheckbox(By checkbox) {
       clickOn(checkbox);
   }

   public boolean gatherFilteredHotels(String checkbox){
       boolean isRating = false;
       System.out.println("Rating in test: " + checkbox);
       System.out.println(checkbox == "4");
       System.out.println(checkbox.equals("4"));
       if (checkbox.equals("4") || checkbox.equals("5")) {
           List <WebElement> filteredHotels = (SharedSD.getDriver().findElements(hotelsIndividualStarRating4and5));
           System.out.println("Size of hotels list: " + filteredHotels);
           for (WebElement hotel : filteredHotels) {
               String hotelRatingText = hotel.getText().substring(0,1); //"3"
               System.out.println("individual rating" + " " + hotelRatingText);
               if (hotelRatingText.equals(checkbox)){
                   isRating = true;
               }
           }
       } else {
           List <WebElement> filteredHotels = (SharedSD.getDriver().findElements(hotelsIndividualStarRating12and3));
           for (WebElement hotel : filteredHotels) {
               String hotelRatingText = hotel.getText().substring(0,1); //"3"
               System.out.println("individual rating" + " " + hotelRatingText);
               if (hotelRatingText.equals(checkbox)){
                   isRating = true;
               }
           }
       }
       return isRating;
    }

    public void clickLandmarksFilter() {
       clickOn(landmarksFilterButton);
    }

    public void clickDowntownFilter() {
       clickOn(cityCenterFilter);
    }

    public void selectTenMile() {
        selectFromDropdown(distanceSelector, 4);
    }

    public boolean isWithinTenMiles(){
       boolean isWithinTen = false;
       List <WebElement> hotelsWithin10ofCityCenter = SharedSD.getDriver().findElements(hotelsFiltered);
       for (WebElement hotel: hotelsWithin10ofCityCenter){
            float hotelDistanceToCenter = Integer.parseInt(getTextFromElement(individualHotelDistancetoCityCenter).substring(0, 2)); //10.0
            if (hotelDistanceToCenter <= 10.0){
                isWithinTen = true;
            }
       }
       return isWithinTen;
    }
}
