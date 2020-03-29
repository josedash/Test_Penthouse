package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.test.cucumberReport.CucumberUtils;

import java.lang.management.ManagementFactory;

public class GlobalHooks {


    @Before
    public void setUp(Scenario scenario) {
        System.out.println("set UP");
        System.out.println(scenario.getId() + scenario.getName());
        CucumberUtils.scenario = scenario;

        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
    }

}
