package base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver;
    protected Logger logger;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {
        WebDriverFactory factory = new WebDriverFactory(browser, logger);
        driver = factory.createWebDriverInstance();
    }



    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}


