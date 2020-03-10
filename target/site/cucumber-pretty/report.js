$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
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
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 4730078014,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 481901834,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify Invalid Login two",
  "description": "",
  "id": "login-feature;verify-invalid-login-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@login-2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I enter chris@technosoftacademy.io into username text fields on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter abc1234 into password text fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I see number 12 in text field",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chris@technosoftacademy.io",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 40
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 394150357,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 113034950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "LoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 5200650863,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifyInvalidLoginPage()"
});
formatter.result({
  "duration": 45346921,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 257015376,
  "status": "passed"
});
});