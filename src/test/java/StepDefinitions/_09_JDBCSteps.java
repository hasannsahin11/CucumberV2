package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.DBUtilities;
import Utilities.MyMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ja.且つ;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _09_JDBCSteps extends MyMethods {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();

    @Given("Navigate to States page")
    public void navigateToStatesPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParametersBtn());
        nv.clickMethod(nv.getStatesBtn());
    }

    ArrayList<ArrayList<String>> dbList;

    @When("Send query {string}")
    public void sendQuery(String query) {
        dbList = DBUtilities.getData(query);
        System.out.println(dbList);
    }

    @Then("Check if they match with UI")
    public void checkIfTheyMatchWithUI() {
        List<WebElement> uiList = dc.getStatesList();
        for (int i = 0; i < uiList.size(); i++) {
            Assert.assertEquals(dbList.get(i).get(1),uiList.get(i).getText(),"Something is wrong. Data doesn't match!");
        }
    }
}
