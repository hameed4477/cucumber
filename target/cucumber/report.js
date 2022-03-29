$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:TechFiosLogin.feature");
formatter.feature({
  "name": "TechFios Login functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User shoul click on the cash and bank",
  "keyword": "And "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_shoul_click_on_the_cash_and_bank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on the New Account",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_should_click_on_the_New_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should insert the title as \"Savings\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_should_insert_the_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should insert the description as \"need to save mor money\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_should_insert_the_description_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should insert the intial balance as \"10000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TechFiosStepDefinition.user_should_insert_the_intial_balance_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});