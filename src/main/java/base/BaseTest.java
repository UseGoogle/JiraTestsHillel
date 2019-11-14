package base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;
    protected Logger logger;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser, ITestContext ct) {
        WebDriverFactory factory = new WebDriverFactory(browser, logger);
        driver = factory.createWebDriverInstance();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}


