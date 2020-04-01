$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/components/google/Google.feature");
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
formatter.step({
  "name": "I navigate to \"https://www.bing.com/\"",
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
  "location": "stepdefs.generic.SeleniumStepDef.iNavigateToWith(java.lang.String,java.lang.String)"
});
formatter.write("Launch Chrome Browser");
formatter.write("Driver already started.");
formatter.write("Navigated to : https://www.google.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"Jose J\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.components.google.Search.searchFor(java.lang.String)"
});
formatter.embedding("image/png", "embedded0.png", "");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"https://www.bing.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.generic.SeleniumStepDef.iNavigateTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/components/google/Google2.feature");
formatter.feature({
  "name": "Search Parallel Test",
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
  "keyword": "Scenario Outline"
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
        "Sofia",
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
  "location": "stepdefs.generic.SeleniumStepDef.iNavigateToWith(java.lang.String,java.lang.String)"
});
formatter.write("Launch Chrome Browser");
formatter.write("Driver already started.");
formatter.write("Navigated to : https://www.google.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"Sofia\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.components.google.Search.searchFor(java.lang.String)"
});
formatter.embedding("image/png", "embedded1.png", "");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});