package common;

import framework.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import ui.pages.MainPage;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/11/15
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonMethods {
    public static WebDriver driver = DriverManager.getInstance().getWebDriver();
    public static void logOut() {
            //mainPage = new MainPage();
            //mainPage.logout();
    }

    public static boolean isElementPresent (By byElement){
        try {
            driver.findElement(byElement);
            return true;
        }catch (NoSuchElementException e) {
            return false;
        }
    }

}
