
import Pages.CreateIssuePage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Properties.URL;
import org.testng.annotations.Test;


public class CreateIssuePageTest extends BaseTest {


    @Test
    public void createIssue() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(URL.BETA);
        loginPage.successfulLoginToJira("Tihran_Behoian", "Tihran_Behoian");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickCreateIssueButton();
        CreateIssuePage issuePage = new CreateIssuePage(driver);
        issuePage.setProjectByEnteringText("QAAUT-8");
        issuePage.setIssueTypeByEnteringText("Task");
        issuePage.enterIssueDescription("Well done");
    }

}


