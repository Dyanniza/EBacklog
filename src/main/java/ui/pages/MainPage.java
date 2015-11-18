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
 * Date: 11/12/15
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainPage extends BasePageObject {
    @FindBy(id = "user_name")
    @CacheLookup
    WebElement userName;
    @FindBy(id = "user_name")
    @CacheLookup
    WebElement backlogButton;


    public MainPage() {
        PageFactory.initElements(driver,this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {

        wait.until(ExpectedConditions.visibilityOf(userName));

    }
    public void createBacklog(){

    }
    public void goToAssertInfoView(){

    }


    public String getPageTitle(){
        return driver.getTitle();
    }
}
