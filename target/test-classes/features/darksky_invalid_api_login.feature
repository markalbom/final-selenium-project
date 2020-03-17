@web
Feature:

Background:
  Given I am on DarkSky Register Page

  @darksky-invalid-login-1
  Scenario: Verify invalid signup error message
    When I click on register button
    Then I verify I am on the DarkSky Register Page by asserting the Register Header

