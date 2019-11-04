import pages.LoginPage;
import properties.Credentionals;
import properties.URL;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Feature("Login")
    @Test(groups = {"Smoke"})
    public void successfulLoginToJira() {
        LoginPage loginPage = new LoginPage();
        loginPage.navigate(URL.BETA);
        loginPage.loginToJira(Credentionals.USERNAME, Credentionals.PASSWORD);
        loginPage.checkLogin(URL.DASHBOARD);
    }





}

