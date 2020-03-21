$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/google/Google.feature");
formatter.feature({
  "name": "Search Sample",
  "description": "  As a user I want to search my self in google.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Simple search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TestListener"
    }
  ]
});
formatter.step({
  "name": "I navigate to \"\u003curl\u003e\" with \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Search for \"\u003csearchFor\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "searchFor",
        "Browser"
      ]
    },
    {
      "cells": [
        "https://www.google.com",
        "Jose J",
        "chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Simple search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@TestListener"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"https://www.google.com\" with \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.Search.iNavigateToWith(java.lang.String,java.lang.String)"
});
formatter.write("Launch Chrome Browser");
formatter.write("Navigated to : https://www.google.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"Jose J\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.Search.searchFor(java.lang.String)"
});
formatter.embedding("image/png", "embedded0.png", "testimage");
formatter.result({
  "status": "passed"
});
});