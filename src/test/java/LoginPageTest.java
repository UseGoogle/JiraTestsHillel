import Pages.DashboardPage;
import Pages.LoginPage;
import Properties.URL;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.WebDriverFactory;

public class LoginPageTest extends BaseTest {

    @Feature("Login")
    @Test(groups = {"Regression"})
    public void successfulLoginToJira() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigate(URL.BETA);
        loginPage.successfulLoginToJira("Tihran_Behoian", "Tihran_Behoian");
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(1==2);

    }


}

