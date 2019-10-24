import Pages.DashboardPage;
import Pages.LoginPage;
import Properties.URL;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Feature("Login")
    @Test(groups = {"Regression"})
    public void successfulLoginToJira() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(URL.BETA);
        loginPage.successfulLoginToJira("Tihran_Behoian", "Tihran_Behoian");
        DashboardPage dashboardPage = new DashboardPage(driver);

    }


}

