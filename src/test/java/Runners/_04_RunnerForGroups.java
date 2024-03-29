package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // Runs the scenarios that has this tag
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)

public class _04_RunnerForGroups extends AbstractTestNGCucumberTests {
}
