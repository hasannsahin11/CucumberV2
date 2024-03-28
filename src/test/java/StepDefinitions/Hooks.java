package StepDefinitions;

import Utilities.DriverClass;
import Utilities.ExcelUtilities;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    LocalDateTime startDateTime;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss");

    @Before // This method runs before every scenario
    public void beforeScenario() {
        System.out.println("Scenario has started!");
        startDateTime = LocalDateTime.now();
    }

    @After // This one runs after all the scenarios
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario has ended!");
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startDateTime, endTime);


        if (scenario.isFailed()) {

            final byte[] byteImage = ((TakesScreenshot) DriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());


            // Save the screenshot on our computer
//            TakesScreenshot takesScreenshot = (TakesScreenshot) BasicDriver.getDriver();
//            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            LocalDateTime timeOfError = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss");
//
//            try {
//                FileUtils.copyFile(file,new File("src/test/java/Screenshots/screenshot"+timeOfError.format(formatter)+".png"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
        ExcelUtilities.writeInExcel("C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\CampusReport.xlsx", scenario, startDateTime.format(formatter), endTime.format(formatter), duration);

        DriverClass.quitDriver();
    }

//    @BeforeStep
//    public void beforeSTep() {
//        System.out.println("Step has started!");
//    }
//
//    @AfterStep
//    public void afterStep() {
//        System.out.println("Step has ended!");
//    }
}
