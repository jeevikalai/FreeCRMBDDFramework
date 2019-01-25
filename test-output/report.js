$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jeevi/seleniumproject/CucumberFramework/src/test/java/Feature/login1.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Application Testing",
  "description": "",
  "id": "freecrm-application-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User log into the application",
  "description": "",
  "id": "freecrm-application-testing;user-log-into-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" click on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Contacts Tab and delete the contacts",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "freecrm-application-testing;user-log-into-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "freecrm-application-testing;user-log-into-the-application;;1"
    },
    {
      "cells": [
        "jeevikalai",
        "Anuska123"
      ],
      "line": 14,
      "id": "freecrm-application-testing;user-log-into-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "User log into the application",
  "description": "",
  "id": "freecrm-application-testing;user-log-into-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"jeevikalai\" and \"Anuska123\" click on login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Contacts Tab and delete the contacts",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdefinition.user_launches_the_browser()"
});
formatter.result({
  "duration": 66396020311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jeevikalai",
      "offset": 12
    },
    {
      "val": "Anuska123",
      "offset": 29
    }
  ],
  "location": "loginstepdefinition.user_enter_username_and_password_click_on_login(String,String)"
});
formatter.result({
  "duration": 12638037488,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 351859050,
  "status": "passed"
});
formatter.match({
  "location": "contactsstepdef.click_on_Contacts_Tab_and_delete_the_contacts()"
});
formatter.result({
  "duration": 16676737845,
  "status": "passed"
});
});