package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_CountrySteps extends MyMethods {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();

    @And("Navigate to Country Page")
    public void navigateToCountryPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParametersBtn());
        nv.clickMethod(nv.getCountriesBtn());
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.getAddCountryBtn());
        dc.sendKeysMethod(dc.getCountryNameInput(), "Argentina");
        dc.sendKeysMethod(dc.getCountryCodeInput(), "ICARDI9");
        dc.clickMethod(dc.getCountrySaveButton());

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getCountrySuccessMessage(),"successfully");

    }

    @When("Search the country name")
    public void searchTheCountryName() {
        dc.waitUntilVisible(dc.getNameSearchInput());
        dc.sendKeysMethod(dc.getNameSearchInput(), "Argentina");
        dc.sendKeysMethod(dc.getCodeSearchInput(),"ICARDI9");
        dc.clickMethod(dc.getSearchBtn());
    }

    @And("Click the delete button")
    public void clickTheDeleteButton() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.waitUntilClickable(dc.getDeleteBtn());
        dc.clickMethod(dc.getDeleteBtn());
        dc.waitUntilClickable(dc.getDeleteConfirmButton());
        dc.clickMethod(dc.getDeleteConfirmButton());
    }

    @Then("User should see the Country successfully deleted message")
    public void userShouldSeeTheCountrySuccessfullyDeletedMessage() {
        dc.verifyContainsText(dc.getCountryDeletedSuccessMessage(), "Country successfully deleted");

    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String countryName, String countryCode) {
        dc.clickMethod(dc.getAddCountryBtn());
        dc.sendKeysMethod(dc.getCountryNameInput(), countryName);
        dc.sendKeysMethod(dc.getCountryCodeInput(), countryCode);
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.getCountrySaveButton());
    }

    @When("Search the country name as {string} and code as {string}")
    public void searchTheCountryNameAsAndCodeAs(String countryName, String countryCode) {
        dc.sendKeysMethod(dc.getNameSearchInput(), countryName);
        dc.sendKeysMethod(dc.getCodeSearchInput(), countryCode);
        dc.clickMethod(dc.getSearchBtn());
    }
}
