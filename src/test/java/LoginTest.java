import pages.DashboardPage;
import pages.LoginPage;
import properties.URL;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Feature("Login")
    @Test(groups = {"Smoke"})
    public void successfulLoginToJira() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigate(URL.BETA);
        loginPage.successfulLoginToJira("Tihran_Behoian", "Tihran_Behoian");
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(1==2);

    }


}

