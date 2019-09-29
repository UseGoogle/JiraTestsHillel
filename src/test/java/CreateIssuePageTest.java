import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateIssuePageTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CreateIssuePage issuePage;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tihran Behoian\\IdeaProjects\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jira.hillel.it/login.jsp");
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        issuePage = new CreateIssuePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }

    @Test
    public void successfulLoginToJira(){
        loginPage.loginToJira("Tihran_Behoian", "Tihran_Behoian");
        dashboardPage.clickCreateIssueButton();
        issuePage.createIssue("Something", "Something");
        // Assert.assertEquals("dsds", dashboardPage.getCreatedIssueText());
        Assert.assertTrue(dashboardPage.getCreatedIssue());

    }
}

