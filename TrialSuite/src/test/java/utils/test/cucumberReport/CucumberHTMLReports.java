package utils.test.cucumberReport;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberHTMLReports {

    public static File reportOutputDirectory = new File(System.getProperty("user.dir") + "/target/");
    public static List<String> jsonFiles = new ArrayList<String>();


    public static void main(String[] args) {
        listFilesForFolder(reportOutputDirectory);
        File reportOutputDirectory = new File("target/demo");
        String buildNumber = "101";
        String projectName = "Jose Martinez Test Suite";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber(buildNumber);
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else if (fileEntry.getName().endsWith(".json")) {
                System.out.println("*******" + fileEntry.getName());
                jsonFiles.add(reportOutputDirectory + "/" + fileEntry.getName());

            }
        }
    }
}
