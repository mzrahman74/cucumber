$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in Application",
  "description": "",
  "id": "log-in-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "User in home page login",
  "description": "",
  "id": "log-in-application;user-in-home-page-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@NuhaaTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Nissan OEM landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User sign up with following details",
  "rows": [
    {
      "cells": [
        "Mohammad",
        "Naushin",
        "mzrahman74@gmail.com",
        "Plano",
        "2149730438"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Home page should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_nissan_oem_landing_page()"
});
formatter.result({
  "duration": 491228920,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_sign_up_with_following_details(DataTable)"
});
formatter.result({
  "duration": 2255633,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_should_displayed()"
});
formatter.result({
  "duration": 737813,
  "status": "passed"
});
});