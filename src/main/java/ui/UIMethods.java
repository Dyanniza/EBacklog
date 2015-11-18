package ui;

import framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/13/15
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class UIMethods {
    private WebDriver driver = DriverManager.getInstance().getWebDriver();
    public boolean isPresent;

    public UIMethods() {
    }

    public boolean isErrorMessagePresent(){
        try {
            driver.findElements(By.id("error"));

        }catch(NoSuchElementException e){

        }

        return false;
    }

}
