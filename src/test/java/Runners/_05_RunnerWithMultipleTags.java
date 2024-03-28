package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
//        dryRun = true
)

public class _05_RunnerWithMultipleTags extends AbstractTestNGCucumberTests {
}
