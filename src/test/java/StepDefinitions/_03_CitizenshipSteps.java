package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenshipSteps {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @Given("Navigate to Citizenships page")
    public void navigateToCitizenshipsPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParametersBtn());
        nv.clickMethod(nv.getCitizenshipsBtn());
    }

    @And("Click on Add Button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddCitizenshipButton());
    }

    @And("Enter citizenship name as {string} and citizenship short name as {string}")
    public void enterCitizenshipNameAsAndCitizenshipShortNameAs(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.getCitizenshipNameInput(), citizenshipName);
        dc.sendKeysMethod(dc.getCitizenshipShortNameInput(), citizenshipShortName);
    }

    @Then("Citizenship successfully added message should be displayed")
    public void citizenshipSuccessfullyAddedMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getCitizenshipAddedSuccessMessage(), "Citizenship successfully created");
    }

    @And("Search for Citizenship with name as {string} and citizenship short name as {string}")
    public void searchForCitizenshipWithNameAsAndCitizenshipShortNameAs(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.getCitizenshipNameSearchInput(), citizenshipName);
        dc.sendKeysMethod(dc.getCitizenshipShortNameSearchInput(), citizenshipShortName);
    }

    @And("Delete Citizenship")
    public void deleteCitizenship() {
        dc.clickMethod(dc.getSearchBtn());
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteBtn());
        dc.clickMethod(dc.getDeleteConfirmButton());
    }
}
