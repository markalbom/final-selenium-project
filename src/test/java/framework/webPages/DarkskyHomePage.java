package framework.webPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;
import util.ConfigReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkskyHomePage extends BasePage {

    private By currentTemperature = By.xpath("//span[@class='summary swap']");
    private By highTemperature = By.xpath("//span[@class='high-temp-text']");
    private By lowTemperature = By.xpath("//span[@class='low-temp-text']");

    private By timelineTemperatures = By.xpath("//div[@id='timeline']//div[@class='temps']/child::span/child::span");


    private By darkskyApiLink = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");

    private By timelineHours = By.xpath("//span[@class = 'hour']//span");


    public void clickDarkskyApiLink (){
        clickOn(darkskyApiLink);
    }

    public String getCurrentTemperatureText(){
        return getTextFromElement(currentTemperature);
    }

    public String getHighTemperatureText(){
        return getTextFromElement(highTemperature);
    }

    public String getLowTemperatureText(){
        return getTextFromElement(lowTemperature);
    }

    public String getTimelineTemperatureText(){
        return getTextFromElement(timelineTemperatures);
    }

    private List <String> getTimelineTemperatures (){
        List <String> temperaturesText = new ArrayList<>();
        List <WebElement> timeTemps = (SharedSD.getDriver().findElements(timelineTemperatures));
        for (WebElement temp: timeTemps){
            String tempText = temp.getText();
            temperaturesText.add(tempText);
            }
        return temperaturesText;
    }

    public List<Integer> getSortedTimelineTemperaturesInt() {
        List<Integer> tempInts = new ArrayList<>();     //empty Int list 'tempInts'
        for (String temp : getTimelineTemperatures()) {  //explicitly (hardcoded) looping through the temperaturesText () - which returns temperaturesText
            tempInts.add(Integer.valueOf(temp.substring(0, temp.length()-1)));
            //alternative way of iterating through list --> splits string into array, broken on the degree symbol.  0 index gives full number
//        for (String temp : tempString) {
//            tempInts.add(Integer.valueOf(temp.split("˚")[0])); //45: ["45", ]
//        }
        }
        Collections.sort(tempInts);
        return tempInts;
    }

    public List <Integer> getTimelineHours (){
        List <Integer> timelineHoursInt = new ArrayList<>();
        List <WebElement> tHours = (SharedSD.getDriver().findElements(timelineHours));
        for (WebElement hour: tHours){
            String hourText = hour.getText();
            timelineHoursInt.add(Integer.parseInt(hourText));

        }
        return timelineHoursInt;
    }






}

