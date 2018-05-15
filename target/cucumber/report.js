$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/newTest.feature");
formatter.feature({
  "line": 1,
  "name": "this is for new testng",
  "description": "",
  "id": "this-is-for-new-testng",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should be able to test with testng",
  "description": "",
  "id": "this-is-for-new-testng;user-should-be-able-to-test-with-testng",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i am entering firstname \"\u003cfname\u003e\" \"\u003cfvalue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "i am entering firstname \"\u003clname\u003e\" \"\u003clvalue\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "this-is-for-new-testng;user-should-be-able-to-test-with-testng;",
  "rows": [
    {
      "cells": [
        "fname",
        "fvalue",
        "lname",
        "lvalue"
      ],
      "line": 9,
      "id": "this-is-for-new-testng;user-should-be-able-to-test-with-testng;;1"
    },
    {
      "cells": [
        "firstName",
        "Mohsin",
        "lastName",
        "New"
      ],
      "line": 10,
      "id": "this-is-for-new-testng;user-should-be-able-to-test-with-testng;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4497553268,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should be able to test with testng",
  "description": "",
  "id": "this-is-for-new-testng;user-should-be-able-to-test-with-testng;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i am entering firstname \"firstName\" \"Mohsin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "i am entering firstname \"lastName\" \"New\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 25
    },
    {
      "val": "Mohsin",
      "offset": 37
    }
  ],
  "location": "GUIStepDefinition.enterFname(String,String)"
});
formatter.result({
  "duration": 117802925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastName",
      "offset": 25
    },
    {
      "val": "New",
      "offset": 36
    }
  ],
  "location": "GUIStepDefinition.enterFname(String,String)"
});
formatter.result({
  "duration": 69911528,
  "status": "passed"
});
formatter.after({
  "duration": 741553562,
  "status": "passed"
});
});