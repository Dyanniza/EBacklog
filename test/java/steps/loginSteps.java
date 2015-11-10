package steps;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.driverManager;
import org.openqa.selenium.WebDriver;

/**
 * Created by ceciliachalar on 11/9/2015.
 */

public class loginSteps {
    private driverManager easyBacklog = driverManager.getInstance();
    private WebDriver driver;

    @Given("^I navigate to login page$")
    public void navigateLoginPage(String url){
        driver = easyBacklog.openBrowser();
        driver.get(url);

    }
    @When("^I loginSteps as \"(.*?)\" with password\"(.*?)\"$")
    public void I_login_as_with_password(String userName,String userPassword){
        //mainPage = loginPage.loginSuccessful(userName,userPassword);

    }
    @Then("^I loginSteps as \"(.*?)\" with password\"(.*?)\"$")
    public void verifyMainBacklogPageIsDisplayed(){
        //mainPage = loginPage.loginSuccessful(userName,userPassword);
        //assertTrue(mainPage)
    }
}
