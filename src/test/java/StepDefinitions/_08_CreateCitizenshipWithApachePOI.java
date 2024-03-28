package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;

import java.util.ArrayList;

public class _08_CreateCitizenshipWithApachePOI {
    @Then("Create a citizenship by ApachePOI")
    public void createACitizenshipByApachePOI() {

        DialogContent dc = new DialogContent();


        ArrayList<ArrayList<String>> citizenshipData = ExcelUtilities.getDataFromExcel("C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\Excel.xlsx","testCitizenship",2);


        for (int i = 0; i < citizenshipData.size(); i++) {
            dc.clickMethod(dc.getAddCitizenshipButton());
            dc.sendKeysMethod(dc.getCitizenshipNameInput(),citizenshipData.get(i).get(0));
            dc.sendKeysMethod(dc.getCitizenshipShortNameInput(),citizenshipData.get(i).get(1));
            dc.clickMethod(dc.getCountrySaveButton());
            dc.verifyContainsText(dc.getSuccessMessage(),"success");
        }
    }
}
