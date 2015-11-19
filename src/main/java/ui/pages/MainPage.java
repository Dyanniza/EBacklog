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
    @FindBy(linkText = "Create a new backlog")
    @CacheLookup
    WebElement backlogButton;

    @FindBy(id = "user_name")
    @CacheLookup
    WebElement backlogButton2;


    public MainPage() {
        PageFactory.initElements(driver,this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {

        wait.until(ExpectedConditions.visibilityOf(backlogButton));

    }
    public void createBacklog(){

    }
    public void goToAssertInfoView(){

    }
    public boolean isBacklogsDisplayed(){
        return (backlogButton.getText().equalsIgnoreCase("Create a new backlog"))? true : false;
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
