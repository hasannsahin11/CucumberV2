package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginPageUsernameInput;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPagePasswordInput;

    @FindBy(xpath = "//span[text()=\" LOGIN \"]")
    private WebElement loginPageLoginButton;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeaderAfterLogin;

    @FindBy(xpath = "//ms-add-button[@tooltip='COUNTRY.TITLE.ADD']")
    private WebElement addCountryBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement countryNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement countryCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement countrySaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement nameSearchInput;

    @FindBy(css = "input[data-placeholder='Code']")
    private WebElement codeSearchInput;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchBtn;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteBtn;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private List<WebElement> countryDeleteBtnList;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteConfirmButton;

    @FindBy(xpath = "//div[text()='Country successfully deleted']")
    private WebElement countryDeletedSuccessMessage;

    @FindBy(xpath = "//ms-add-button[@tooltip='CITIZENSHIP.TITLE.ADD']")
    private WebElement addCitizenshipButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement citizenshipNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement citizenshipShortNameInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[text()='Citizenship successfully created']")
    private WebElement citizenshipAddedSuccessMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement citizenshipNameSearchInput;

    @FindBy(xpath = "//ms-add-button[@tooltip='FEE_TYPES.TITLE.ADD']")
    private WebElement addFeeBtn;
    @FindBy(css = "input[data-placeholder='Short Name']")
    private WebElement citizenshipShortNameSearchInput;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement feeIntegrationCodeInput;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement feePriorityInput;

    @FindBy(xpath = "//span[text()='Save & Close']")
    private WebElement saveAndCloseBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[1]")
    private WebElement prioritySearchInput;

    @FindBy(xpath = "//ms-add-button[@tooltip='ENTRANCE_EXAM.TITLE.ADD']")
    private WebElement addEntranceExamsBtn;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement entExamsNameInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='academicPeriod']")
    private WebElement academicPeriodSelect;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement academicPeriodOption;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement gradeLevelSelect;

    @FindBy(xpath = "//span[contains(text(),' 11 ')]")
    private WebElement gradeLevelOption;

    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[2]")
    private WebElement descriptionBtn;

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    private WebElement descriptionAndNotesIFrame;

    @FindBy(css = "#tinymce>p")
    private WebElement descriptionAndNotesInput;

    @FindBy(xpath = "(//div[@class=\"mdc-tab mat-mdc-tab mat-mdc-focus-indicator ng-star-inserted\"])[3]")
    private WebElement notesBtn;

    @FindBy(xpath = "//span[contains(text(),' New Exam ')]")
    private WebElement nexExamHeader;

    @FindBy(xpath = "//tbody[@role='rowgroup']//td[2]")
    private List<WebElement> statesList;

    public WebElement getLoginPageUsernameInput() {
        return loginPageUsernameInput;
    }

    public WebElement getLoginPagePasswordInput() {
        return loginPagePasswordInput;
    }

    public WebElement getLoginPageLoginButton() {
        return loginPageLoginButton;
    }

    public WebElement getDashBoardHeaderAfterLogin() {
        return dashBoardHeaderAfterLogin;
    }

    public WebElement getAddCountryBtn() {
        return addCountryBtn;
    }

    public WebElement getCountryNameInput() {
        return countryNameInput;
    }

    public WebElement getCountryCodeInput() {
        return countryCodeInput;
    }

    public WebElement getCountrySaveButton() {
        return countrySaveButton;
    }

    public WebElement getCountrySuccessMessage() {
        return successMessage;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getNameSearchInput() {
        return nameSearchInput;
    }

    public WebElement getCodeSearchInput() {
        return codeSearchInput;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getDeleteConfirmButton() {
        return deleteConfirmButton;
    }

    public WebElement getCountryDeletedSuccessMessage() {
        return countryDeletedSuccessMessage;
    }

    public List<WebElement> getCountryDeleteBtnList() {
        return countryDeleteBtnList;
    }

    public WebElement getAddCitizenshipButton() {
        return addCitizenshipButton;
    }

    public WebElement getCitizenshipNameInput() {
        return citizenshipNameInput;
    }

    public WebElement getCitizenshipShortNameInput() {
        return citizenshipShortNameInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCitizenshipAddedSuccessMessage() {
        return citizenshipAddedSuccessMessage;
    }

    public WebElement getCitizenshipNameSearchInput() {
        return citizenshipNameSearchInput;
    }

    public WebElement getCitizenshipShortNameSearchInput() {
        return citizenshipShortNameSearchInput;
    }

    public WebElement getAddFeeBtn() {
        return addFeeBtn;
    }

    public WebElement getFeeIntegrationCodeInput() {
        return feeIntegrationCodeInput;
    }

    public WebElement getFeePriorityInput() {
        return feePriorityInput;
    }

    public WebElement getSaveAndCloseBtn() {
        return saveAndCloseBtn;
    }

    public WebElement getPrioritySearchInput() {
        return prioritySearchInput;
    }

    public WebElement getAddEntranceExamsBtn() {
        return addEntranceExamsBtn;
    }

    public WebElement getEntExamsNameInput() {
        return entExamsNameInput;
    }

    public WebElement getAcademicPeriodSelect() {
        return academicPeriodSelect;
    }

    public WebElement getAcademicPeriodOption() {
        return academicPeriodOption;
    }

    public WebElement getGradeLevelSelect() {
        return gradeLevelSelect;
    }

    public WebElement getGradeLevelOption() {
        return gradeLevelOption;
    }

    public WebElement getDescriptionBtn() {
        return descriptionBtn;
    }

    public WebElement getNotesBtn() {
        return notesBtn;
    }

    public WebElement getDescriptionAndNotesIFrame() {
        return descriptionAndNotesIFrame;
    }

    public WebElement getDescriptionAndNotesInput() {
        return descriptionAndNotesInput;
    }

    public WebElement getNexExamHeader() {
        return nexExamHeader;
    }

    public List<WebElement> getStatesList() {
        return statesList;
    }
}
