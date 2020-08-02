package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.test.cucumberReport.CucumberReport;
import utils.test.selenium.Selenium;

import java.lang.management.ManagementFactory;

public class GlobalHooks {


    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Scenario Set UP");
        System.out.println(scenario.getId() + scenario.getName());
        CucumberReport.scenario = scenario;

        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
    }

    @After
    public void tearDown(){
        Selenium.closeSelenium();
    }

}
