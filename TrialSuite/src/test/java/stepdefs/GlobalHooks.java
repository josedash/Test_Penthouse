package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import utils.test.cucumberReport.CucumberUtils;

import java.lang.management.ManagementFactory;

public class GlobalHooks {


    @Before
    public void before(Scenario scenario) {
        CucumberUtils.scenario = scenario;
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
    }

}
