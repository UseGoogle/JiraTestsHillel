import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.WebDriverFactory;

public class BaseTest {


    @BeforeTest(groups = {"Regression", "Smoke"})
    public void setUp() {
        WebDriverFactory.createInstance("qwewqe");
    }


    @AfterTest(groups = {"Regression", "Smoke"})
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }

}