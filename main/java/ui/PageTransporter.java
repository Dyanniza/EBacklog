package ui;

import framework.DriverManager;
import org.openqa.selenium.WebDriver;
import ui.pages.LoginPage;
import ui.pages.MainPage;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/12/15
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class PageTransporter {
    private WebDriver driver = DriverManager.getInstance().getWebDriver();
    public String baseURL = "https://easybacklog.com/users/sign_in";
    public String mainURL = "https://easybacklog.com/";
    private static PageTransporter instance;

    public PageTransporter() {

    }

    public static PageTransporter getInstance(){
        if (instance == null){
            instance = new PageTransporter();
        }
        return instance;
    }

    private void initialize(){

    }

    private void goToURL(String url){
        driver.navigate().to(url);
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public LoginPage goToLoginPage(){
        goToURL(baseURL);
        return new LoginPage();
    }
    public MainPage goToMainPage(){
        goToURL(mainURL);
        return  new MainPage();
    }


}
