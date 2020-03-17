$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky_current_temp.feature");
formatter.feature({
  "line": 3,
  "name": "Current temperature feature",
  "description": "",
  "id": "current-temperature-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@temperature"
    }
  ]
});
formatter.before({
  "duration": 4036530407,
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
  "name": "I am on DarkSky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskyCurrentTempSD.iamOnDarkskyHomePage()"
});
formatter.result({
  "duration": 435939087,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify current temperature falls between projected \"high\" and \"low\" temperature",
  "description": "",
  "id": "current-temperature-feature;verify-current-temperature-falls-between-projected-\"high\"-and-\"low\"-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@current-temperature-high-low"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I verify the current temperature is between the expected \u0027low\u0027 and \u0027high\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskyCurrentTempSD.CurrentTemperatureIsInBetween()"
});
formatter.result({
  "duration": 383964444,
  "status": "passed"
});
formatter.after({
  "duration": 113094300,
  "status": "passed"
});
});