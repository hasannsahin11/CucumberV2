package Runners;

import Utilities.DriverClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


//@CucumberOptions(
//        tags = "@SmokeTest or @Regression",
//        features = {"src/test/java/FeatureFiles"},
//        glue = {"StepDefinitions"},
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//)
//
//public class _09_RunnerForParallelTest extends AbstractTestNGCucumberTests {
//    @BeforeClass
//    @Parameters(value = "browser")
//    public void beforeClass(String browserName) {
//        DriverClass.setThreadDriverName(browserName);
//    }
//}

@CucumberOptions(
        tags = "@SmokeTest or @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _09_RunnerForParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(@Optional("chrome") String browserName) {
        DriverClass.setThreadDriverName(browserName);
    }
}

