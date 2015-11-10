package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/10/15
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class driverManager {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriver mozilla = null;

    private static driverManager instance = null;

    protected driverManager(){
        openBrowser();
    }

    public WebDriver openBrowser() {
        if (mozilla == null){
            driver = new FirefoxDriver();
            mozilla = driver;
        }else
            if(mozilla !=null){
                driver = mozilla;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver,30,1000);
            return driver;
    }

    public static driverManager getInstance(){
        if (instance == null){
            instance = new driverManager();
        }
        return instance;
    }

}
