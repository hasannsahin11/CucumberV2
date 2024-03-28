package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _05_FeeSteps {
    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();

    @Given("Navigate to Fee Page")
    public void navigateToFeePage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParametersBtn());
        nv.clickMethod(nv.getFeesBtn());
    }

    @And("Click on Add Fee Button")
    public void clickOnAddFeeButton() {
        dc.clickMethod(dc.getAddFeeBtn());
    }

    @And("Fill the add fee form")
    public void fillTheAddFeeForm(DataTable addFeeData) {
        List<String> dataList = addFeeData.asList(String.class);
        dc.sendKeysMethod(dc.getCountryNameInput(), dataList.get(0));
        dc.sendKeysMethod(dc.getCountryCodeInput(), dataList.get(1));
        dc.sendKeysMethod(dc.getFeeIntegrationCodeInput(), dataList.get(2));
        dc.sendKeysMethod(dc.getFeePriorityInput(), dataList.get(3));
        Actions actions = new Actions(DriverClass.getDriver());
        Action action = actions.sendKeys(Keys.TAB).build();
        action.perform();
    }

    @When("Click on Save & Close button")
    public void clickOnSaveCloseButton() {
        dc.clickMethod(dc.getSaveAndCloseBtn());
    }

    @When("Search for the Fee")
    public void searchForTheFee(DataTable deleteFeeData) {
        List<String> dataList = deleteFeeData.asList(String.class);
        dc.sendKeysMethod(dc.getNameSearchInput(), dataList.get(0));
        dc.sendKeysMethod(dc.getCodeSearchInput(), dataList.get(1));
        dc.sendKeysMethod(dc.getPrioritySearchInput(), dataList.get(2));
        dc.clickMethod(dc.getSearchBtn());
    }

    @And("Delete the Fee")
    public void deleteTheFee() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteBtn());
        dc.clickMethod(dc.getDeleteConfirmButton());
    }
}
