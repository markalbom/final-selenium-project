@web
Feature: Today's Deal Price Feature


  Background:
    Given I am on hotels default locations search result screen

  @verify-today's-deal-price
    Scenario: Verify today's deal price value
    Then I verify today's deal is less than 200 dollars


  @verify-star-display-accordingly
  Scenario Outline: Verify user can only view the result by selected property class
    When I select property class <star> star from star selector
    Then I verify the system displays only <star> star hotels on search results page

    Examples:
    | star |
    | 5    |
    | 4    |
    | 3    |
    | 2    |
    | 1    |


  @verify-hotel-radius
  Scenario: List all of the hotels within a 10 mile radius of airport or downtown
    When I verify the system displays all hotels within a 10 mile radius of the airport
    And I verify that Hilton Hotel is within the radius







