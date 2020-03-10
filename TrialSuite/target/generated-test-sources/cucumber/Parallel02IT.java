import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/google/Google2.feature"},
    format = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html", "pretty"},
    monochrome = false,
    tags = {"@Search"},
    glue = { "stepdefs" })
public class Parallel02IT {
}