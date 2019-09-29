import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihran Behoian\\IdeaProjects\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jira.hillel.it/login.jsp");
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successfulLoginToJira() {
        loginPage.loginToJira("Tihran_Behoian", "Tihran_Behoian");
    }

    @Test
    public void invalidLoginToJira() {
        loginPage.loginToJira("Tihran_Behoian", "incorrectPassword");
        Assert.assertEquals(loginPage.getErrorMessageText(), "Sorry, your username and password are incorrect - please try again.");
    }


}

