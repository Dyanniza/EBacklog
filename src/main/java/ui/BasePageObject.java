package ui;
import framework.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/11/15
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasePageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePageObject() {
        this.driver = DriverManager.getInstance().getWebDriver();
        this.wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver,this);
    }
    public abstract  void waitUntilPageObjectIsLoaded();
}
