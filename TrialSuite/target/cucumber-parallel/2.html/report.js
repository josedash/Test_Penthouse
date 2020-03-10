$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/google/Google2.feature");
formatter.feature({
  "line": 2,
  "name": "Search Parallel Test",
  "description": "\r\nAs a user I want to search my self in google.",
  "id": "search-parallel-test",
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
  "id": "search-parallel-test;simple-search",
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
  "id": "search-parallel-test;simple-search;",
  "rows": [
    {
      "cells": [
        "url",
        "searchFor",
        "Browser"
      ],
      "line": 10,
      "id": "search-parallel-test;simple-search;;1"
    },
    {
      "cells": [
        "https://www.google.com",
        "Sofia",
        "chrome"
      ],
      "line": 11,
      "id": "search-parallel-test;simple-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 30026500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Simple search",
  "description": "",
  "id": "search-parallel-test;simple-search;;2",
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
  "name": "Search for \"Sofia\"",
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
  "duration": 7223103700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sofia",
      "offset": 12
    }
  ],
  "location": "Search.searchFor(String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 8589639000,
  "status": "passed"
});
});