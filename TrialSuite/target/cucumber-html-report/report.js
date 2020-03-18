$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google/Google.feature");
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
  "duration": 45723600,
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
formatter.result({
  "duration": 4148570800,
  "error_message": "org.openqa.selenium.WebDriverException: permission denied\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-GUC0JEB\u0027, ip: \u0027192.168.1.156\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.6\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$1(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:75)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:216)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:136)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:168)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:156)\r\n\tat utils.test.selenium.DriverFactory.lambda$static$1(DriverFactory.java:22)\r\n\tat utils.test.selenium.DriverFactory.getFireFox(DriverFactory.java:40)\r\n\tat stepdefs.Search.iNavigateToWith(Search.java:35)\r\n\tat ✽.Given I navigate to \"https://www.google.com\" with \"firefox\"(google/Google.feature:7)\r\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 204300,
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
formatter.result({
  "duration": 5770198500,
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
  "duration": 5468130400,
  "status": "passed"
});
formatter.uri("google/Google2.feature");
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
  "duration": 567800,
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
formatter.result({
  "duration": 5505980600,
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
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 5392934900,
  "status": "passed"
});
});