$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/google/Google.feature");
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
  "line": 6,
  "name": "Simple search",
  "description": "",
  "id": "search-sample;simple-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"\u003curl\u003e\" with \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Search for \"\u003csearchFor\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
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
      "line": 10,
      "id": "search-sample;simple-search;;1"
    },
    {
      "cells": [
        "https://www.google.com",
        "Jose J Martinez",
        "firefox"
      ],
      "line": 11,
      "id": "search-sample;simple-search;;2"
    },
    {
      "cells": [
        "https://www.google.com",
        "Jose J",
        "chrome"
      ],
      "line": 12,
      "id": "search-sample;simple-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31878200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Simple search",
  "description": "",
  "id": "search-sample;simple-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"https://www.google.com\" with \"firefox\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Search for \"Jose J Martinez\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 15
    },
    {
      "val": "firefox",
      "offset": 45
    }
  ],
  "location": "Search.iNavigateToWith(String,String)"
});
formatter.write("Launch firefox Browser");
formatter.result({
  "duration": 5880810900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jose J Martinez",
      "offset": 12
    }
  ],
  "location": "Search.searchFor(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 4069233400,
  "status": "passed"
});
formatter.before({
  "duration": 545200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Simple search",
  "description": "",
  "id": "search-sample;simple-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to \"https://www.google.com\" with \"chrome\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Search for \"Jose J\"",
  "matchedColumns": [
    1
  ],
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
  "location": "Search.iNavigateToWith(String,String)"
});
formatter.write("Launch Chrome Browser");
formatter.result({
  "duration": 5498368000,
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
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 8411591500,
  "status": "passed"
});
});