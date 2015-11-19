package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.PageTransporter;
import ui.pages.LoginPage;
import ui.pages.MainPage;

/**
 * Created by ceciliachalar on 11/9/2015.
 */

public class LoginSteps {

    private DriverManager automation = DriverManager.getInstance();
    private WebDriver driver;
    public String url = "https://easybacklog.com/users/sign_in";
    public String userName = "CeciliaChalar";

    public LoginPage loginPage;
    public MainPage mainPage;

    @Given("^I navigate to login page$")
    public void I_navigate_to_login_page(){
        //driver = automation.getWebDriver();
        //driver.get(url);
        loginPage = PageTransporter.getInstance().goToLoginPage();

    }
    @When("^I login as \"(.*?)\" with password \"(.*?)\"$")
    public void login(String userEmail,String userPassword){
       // driver.findElement(By.id("user_email")).sendKeys(userEmail);
        //driver.findElement(By.id("user_password")).sendKeys(userPassword);
        //mainPage = new MainPage();
       // mainPage = loginPage.loginOk(userEmail,userPassword);
        mainPage = loginPage.loginOk(userEmail,userPassword);
    }
    @Then("^I should login to EasyBacklog succesfully$")
    public void verifyMainPageIsDisplayed(){
        //driver.findElement(By.name("commit")).click();
        //Assert.assertTrue("Login succesfully",driver.findElements(By.partialLinkText(userName)).size()!=0);

        //mainPage = loginPage.loginSuccessful(userName,userPassword);
        //assertTrue(mainPage);
        Assert.assertTrue("Login succesfully",mainPage.isBacklogsDisplayed());

    }

    @Then("^I should not login to EasyBacklog$")
    public void verifyLoginPageDisplayed(){
        //String errMess = driver.findElement(By.className("error")).getText();
        //Assert.assertEquals("  Invalid email or password. ",errMess);
       // Assert.assertEquals("Log in : easyBacklog", driver.getTitle());
        Assert.assertTrue("Login Failed",loginPage.isLoginPage());
    }

}
