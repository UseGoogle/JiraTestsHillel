
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public  class BaseTest {

    WebDriver driver;

    @BeforeTest(groups = "Regression")
    public void setUp() {
        WebDriverManager.chromedriver().version("77.0.3865.120").setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest(groups = "Regression")
    public void tearDown() {
        this.driver.quit();
    }








}




