package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class _07_EntranceExamsSteps {
    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @Given("Navigate to Entrance Exam Page")
    public void navigateToEntranceExamPage() {
        nv.waitUntilClickable(nv.getEntranceExamsBtn());
        nv.clickMethod(nv.getEntranceExamsBtn());
        nv.clickMethod(nv.getEntranceExamsSetupBtn());
        nv.clickMethod(nv.getEntranceExamsInnerBtn());
    }

    @And("Click on Add Entrance Exams Button")
    public void clickOnAddEntranceExamsButton() {
        dc.clickMethod(dc.getAddEntranceExamsBtn());
    }

    @And("Fill Out the form")
    public void fillOutTheForm(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.waitUntilVisible(dc.getNexExamHeader());
        dc.sendKeysMethod(dc.getEntExamsNameInput(), dataList.get(0));
        dc.clickMethod(dc.getAcademicPeriodSelect());
        dc.clickMethod(dc.getAcademicPeriodOption());
        dc.clickMethod(dc.getGradeLevelSelect());
        dc.waitUntilClickable(dc.getGradeLevelOption());
        dc.clickMethod(dc.getGradeLevelOption());
    }

    @And("Create a Description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.getDescriptionBtn());
        dc.waitUntilClickable(dc.getDescriptionAndNotesIFrame());
        DriverClass.getDriver().switchTo().frame(dc.getDescriptionAndNotesIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNotesInput(), dataList.get(0));
        DriverClass.getDriver().switchTo().defaultContent();
    }

    @And("Create a Note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.getNotesBtn());
        dc.waitUntilClickable(dc.getDescriptionAndNotesIFrame());
        DriverClass.getDriver().switchTo().frame(dc.getDescriptionAndNotesIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNotesInput(), dataList.get(0));
        DriverClass.getDriver().switchTo().defaultContent();
    }

    @And("Enter Entrance Exam name into the Name input")
    public void enterEntranceExamNameIntoTheNameInput(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getNameSearchInput(), dataList.get(0));
    }

    @And("Click on the Search button")
    public void clickOnTheSearchButton() {
        dc.clickMethod(dc.getSearchBtn());
    }

//    @When("Click the delete exam button")
//    public void clickTheDeleteExamButton() {
//        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
//        dc.waitUntilClickable(dc.getDeleteBtn());
//        dc.clickMethod(dc.getDeleteBtn());
//        dc.waitUntilClickable(dc.getDeleteConfirmButton());
//        dc.clickMethod(dc.getDeleteConfirmButton());
//    }
}
