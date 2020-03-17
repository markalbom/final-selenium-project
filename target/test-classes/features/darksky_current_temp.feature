@web @regression @temperature

Feature: Current temperature feature

  Background:
    Given I am on DarkSky home page

    @current-temperature-high-low
    Scenario: Verify current temperature falls between projected "high" and "low" temperature
      Then I verify the current temperature is between the expected 'low' and 'high'



    @timeline-temperature-span
    Scenario: Verify timeline is displayed in the correct format
      Then I verify the timeline is displayed in 2 hour increments

