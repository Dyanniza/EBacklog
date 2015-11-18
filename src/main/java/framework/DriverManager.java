package framework;
import org.openqa.selenium.WebDriver;
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
public class DriverManager {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriver mozilla = null;

    private static DriverManager instance = null;

    protected DriverManager(){
        initialize();
    }

    public void initialize(){
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
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }

    public static DriverManager getInstance(){
        if (instance == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public void quitDriver(){
        driver.quit();
        instance = null;
    }

}
