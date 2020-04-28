$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("components/google/Google.feature");
formatter.feature({
  "line": 2,
  "name": "Search Sample",
  "description": "\r\nAs a user I want to search my self in google.",
  "id": "search-sample",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Simple search",
  "description": "",
  "id": "search-sample;simple-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@TestListener"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I navigate to \"\u003curl\u003e\" with \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Search for \"\u003csearchFor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I navigate to \"https://www.bing.com/\"",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "search-sample;simple-search;",
  "rows": [
    {
      "cells": [
        "url",
        "searchFor",
        "Browser"
      ],
      "line": 13,
      "id": "search-sample;simple-search;;1"
    },
    {
      "cells": [
        "https://www.google.com",
        "Jose J",
        "chrome"
      ],
      "line": 14,
      "id": "search-sample;simple-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 47158100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Simple search",
  "description": "",
  "id": "search-sample;simple-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    },
    {
      "line": 6,
      "name": "@TestListener"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I navigate to \"https://www.google.com\" with \"chrome\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Search for \"Jose J\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I navigate to \"https://www.bing.com/\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 15
    },
    {
      "val": "chrome",
      "offset": 45
    }
  ],
  "location": "SeleniumStepDef.iNavigateToWith(String,String)"
});
formatter.write("Launch Chrome Browser");
formatter.write("Driver already started.");
formatter.write("Navigated to : https://www.google.com");
formatter.result({
  "duration": 7110678300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jose J",
      "offset": 12
    }
  ],
  "location": "Search.searchFor(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 3545691700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.bing.com/",
      "offset": 15
    }
  ],
  "location": "SeleniumStepDef.iNavigateTo(String)"
});
formatter.result({
  "duration": 3155473800,
  "status": "passed"
});
formatter.after({
  "duration": 4850928700,
  "status": "passed"
});
});