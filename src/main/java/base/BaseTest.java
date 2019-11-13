package base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;
    protected Logger logger;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(String browser) {
        WebDriverFactory factory = new WebDriverFactory(browser);
        driver = factory.createWebDriverInstance();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}


