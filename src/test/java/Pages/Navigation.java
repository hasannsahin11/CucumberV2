package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement parametersBtn;

    @FindBy(xpath = "(//span[contains(text(),'Countries')])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "//span[contains(text(),'Citizenships')]")
    private WebElement citizenshipsBtn;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement feesBtn;

    @FindBy(xpath = "//span[contains(text(),'Entrance Exams')]")
    private WebElement entranceExamsBtn;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[3]")
    private WebElement entranceExamsSetupBtn;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[2]")
    private WebElement entranceExamsInnerBtn;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement statesBtn;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParametersBtn() {
        return parametersBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }

    public WebElement getCitizenshipsBtn() {
        return citizenshipsBtn;
    }

    public WebElement getFeesBtn() {
        return feesBtn;
    }

    public WebElement getEntranceExamsBtn() {
        return entranceExamsBtn;
    }

    public WebElement getEntranceExamsSetupBtn() {
        return entranceExamsSetupBtn;
    }

    public WebElement getEntranceExamsInnerBtn() {
        return entranceExamsInnerBtn;
    }

    public WebElement getStatesBtn() {
        return statesBtn;
    }
}
