package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class _06_ScenarioOutlineWithDataTableSteps {
    @Given("Step one")
    public void stepOne(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));
    }

    @When("Step two")
    public void stepTwo() {
    }

    @And("Step three")
    public void stepThree(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));
    }

    @Then("Step four")
    public void stepFour() {
    }
}
