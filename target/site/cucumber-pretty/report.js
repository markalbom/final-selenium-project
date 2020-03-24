$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels_deal_price.feature");
formatter.feature({
  "line": 2,
  "name": "Today\u0027s Deal Price Feature",
  "description": "",
  "id": "today\u0027s-deal-price-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 4238619493,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on hotels default locations search result screen",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsDealPriceSD.onLocationsResultsScreen()"
});
formatter.result({
  "duration": 8974449956,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "List all of the hotels within a 10 mile radius of airport or downtown",
  "description": "",
  "id": "today\u0027s-deal-price-feature;list-all-of-the-hotels-within-a-10-mile-radius-of-airport-or-downtown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@verify-hotel-radius"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I verify the system displays all hotels within a 10 mile radius of the airport",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I verify that Hilton Hotel is within the radius",
  "keyword": "And "
});
formatter.match({
  "location": "HotelsDealPriceSD.verifyDistance()"
});
formatter.result({
  "duration": 3291501313,
  "error_message": "java.lang.NumberFormatException: For input string: \"0.\"\n\tat java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\n\tat java.lang.Integer.parseInt(Integer.java:580)\n\tat java.lang.Integer.parseInt(Integer.java:615)\n\tat framework.webPages.HotelsResultsPage.isWithinTenMiles(HotelsResultsPage.java:86)\n\tat stepdefinition.HotelsDealPriceSD.verifyDistance(HotelsDealPriceSD.java:48)\n\tat ✽.When I verify the system displays all hotels within a 10 mile radius of the airport(hotels_deal_price.feature:29)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 270259424,
  "status": "passed"
});
});