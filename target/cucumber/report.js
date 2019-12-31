$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in Application",
  "description": "",
  "id": "log-in-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Home page default login",
  "description": "",
  "id": "log-in-application;home-page-default-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User log in to application with \u003cUsername\u003e and  \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Home page will display",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "log-in-application;home-page-default-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 23,
      "id": "log-in-application;home-page-default-login;;1"
    },
    {
      "cells": [
        "mrahman1",
        "Bbyk1945?"
      ],
      "line": 24,
      "id": "log-in-application;home-page-default-login;;2"
    },
    {
      "cells": [
        "mrhaman2",
        "Bbyk1965?"
      ],
      "line": 25,
      "id": "log-in-application;home-page-default-login;;3"
    },
    {
      "cells": [
        "mrahman3",
        "Bbyk1989?"
      ],
      "line": 26,
      "id": "log-in-application;home-page-default-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Home page default login",
  "description": "",
  "id": "log-in-application;home-page-default-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User log in to application with mrahman1 and  Bbyk1945?",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Home page will display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 400647839,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mrahman1",
      "offset": 32
    },
    {
      "val": " Bbyk1945?",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_log_in_to_application_with_and(String,String)"
});
formatter.result({
  "duration": 7535500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_will_display()"
});
formatter.result({
  "duration": 588996,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Home page default login",
  "description": "",
  "id": "log-in-application;home-page-default-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User log in to application with mrhaman2 and  Bbyk1965?",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Home page will display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 835884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mrhaman2",
      "offset": 32
    },
    {
      "val": " Bbyk1965?",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_log_in_to_application_with_and(String,String)"
});
formatter.result({
  "duration": 4916093,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_will_display()"
});
formatter.result({
  "duration": 530267,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Home page default login",
  "description": "",
  "id": "log-in-application;home-page-default-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User log in to application with mrahman3 and  Bbyk1989?",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Home page will display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "duration": 310748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mrahman3",
      "offset": 32
    },
    {
      "val": " Bbyk1989?",
      "offset": 45
    }
  ],
  "location": "stepDefination.user_log_in_to_application_with_and(String,String)"
});
formatter.result({
  "duration": 1719663,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.home_page_will_display()"
});
formatter.result({
  "duration": 390003,
  "status": "passed"
});
});