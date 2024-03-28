package StepDefinitions;

import Pages.DialogContent;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dialogContent = new DialogContent();
    WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(30));

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();
//        BasicDriver.getDriver().manage().deleteAllCookies();

    }

    @When("Enter valid credentials")
    public void enter_valid_credentials() {
        dialogContent.sendKeysMethod(dialogContent.getLoginPageUsernameInput(), "turkeyts");
        dialogContent.sendKeysMethod(dialogContent.getLoginPagePasswordInput(), "TechnoStudy123");

    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dialogContent.clickMethod(dialogContent.getLoginPageLoginButton());

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dialogContent.waitUntilVisible(dialogContent.getDashBoardHeaderAfterLogin());
        Assert.assertTrue(dialogContent.getDashBoardHeaderAfterLogin().isDisplayed(), "Element is not there!");
    }
}
