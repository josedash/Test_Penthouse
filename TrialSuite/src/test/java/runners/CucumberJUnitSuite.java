package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefs"},
        tags = {"@Search"},
        monochrome = true,
        strict = true,
        plugin = {"pretty:output",
                "html:target/cucumber-html-report", "json:target/cucumber.json"}
)
public class CucumberJUnitSuite {

}
