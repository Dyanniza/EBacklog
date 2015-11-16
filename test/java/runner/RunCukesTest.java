package runner;

import common.CommonMethods;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import framework.DriverManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;

/**
 * Created by silvia valencia on 11/9/2015.
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
