package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"},
        dryRun = true // Default value is false -> It runs everything regularly
                      // true -> Only checks if all steps are defined in step definition classes
)

public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {
}
