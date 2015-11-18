package runner;

import common.CommonMethods;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.DriverManager;
import org.testng.annotations.AfterTest;

/**
 * Created with IntelliJ IDEA.
 * User: ceciliachalar
 * Date: 11/11/15
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class RunCukesTest  extends AbstractTestNGCucumberTests {

    @AfterTest
    public void afterExecution() {
        try {
            CommonMethods.logOut();
        } catch (Exception e) {
//            log.error("Unable to logout after execution", e);
        } finally {
            DriverManager.getInstance().quitDriver();
        }
    }

}
