import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateIssuePageTest extends BaseTest{

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CreateIssuePage issuePage;


    @BeforeClass
    public void setUp1() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        issuePage = new CreateIssuePage(driver);

    }

  //@Test
    //public void createIssue() {
      //  loginPage.loginToJira("Tihran_Behoian", "Tihran_Behoian");
        //dashboardPage.clickCreateIssueButton();
        //issuePage.createIssue("Task for AutoTest", "Something");
        //Assert.assertTrue(dashboardPage.getCreatedIssue());
    //}


    @Test
    public void ewr(){
        loginPage.loginToJira("Tihran_Behoian", "Tihran_Behoian");
        dashboardPage.clickCreateIssueButton();
        issuePage = new CreateIssuePage(driver);
        issuePage.clickIssueDropDown();
        issuePage.getIssueOptionXpath("Bug").click();
    }



}

