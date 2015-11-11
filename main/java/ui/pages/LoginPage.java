package ui.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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



    @Override
    public void waitUntilPageObjectIsLoaded() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
