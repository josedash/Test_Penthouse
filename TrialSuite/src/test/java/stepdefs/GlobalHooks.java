package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.test.cucumberReport.CucumberUtils;

import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;

public class GlobalHooks {


    @Before
    public void setUp(Scenario scenario) {
        System.out.println("set UP");
        CucumberUtils.scenario = scenario;
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
    }

}
