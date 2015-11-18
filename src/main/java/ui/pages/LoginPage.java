package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ui.BasePageObject;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/11/15
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends BasePageObject{
    @FindBy(id = "user_email")
    @CacheLookup
    WebElement userEmail;

    @FindBy(id = "user_password")
    @CacheLookup
    WebElement userPassword;

    @FindBy(name = "commit")
    WebElement sigInButton;
    @FindBy(className = "error")
    WebElement errorMessage;

   // public WebDriver driver;
   // public WebDriverWait wait;

    public LoginPage(){
        PageFactory.initElements(driver,this);
        waitUntilPageObjectIsLoaded();
    }
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(sigInButton));
    }

    public LoginPage setUserEmail(String uEmail) {
        userEmail.clear();
        userEmail.sendKeys(uEmail);
        return this;
    }

    public LoginPage setUserPassword(String uPassword) {
        userPassword.clear();
        userPassword.sendKeys(uPassword);
        return this;
    }
    public MainPage clickSigInButtonOk(){
        sigInButton.click();
        return new MainPage();
    }
    public LoginPage clickSigInButtonFail(){
        sigInButton.click();
        return this;
    }

    public void login(String uEmail,String uPass){
        setUserEmail(uEmail);
        setUserPassword(uPass);
    }

    public MainPage loginOk(String uEmail,String uPass){
        login(uEmail,uPass);
        return clickSigInButtonOk();
    }

    public LoginPage loginFail(String uEmail,String uPass){
        login(uEmail,uPass);
        return  clickSigInButtonFail();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
