
import pages.CreateIssuePage;
import pages.DashboardPage;
import pages.LoginPage;
import properties.URL;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;


public class CreateIssueTest extends BaseTest {



    @Feature("Create an Issue")
    @Test(groups = {"Regression"})
    public void createIssue() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigate(URL.BETA);
        loginPage.successfulLoginToJira("Tihran_Behoian", "Tihran_Behoian");
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.clickCreateIssueButton();
        CreateIssuePage issuePage = new CreateIssuePage();
        issuePage.setProjectByEnteringText("QAAUT-8");
        issuePage.setIssueTypeByEnteringText("Task");
        issuePage.enterIssueDescription("Well done");
    }

}


