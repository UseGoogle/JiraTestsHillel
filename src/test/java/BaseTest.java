import io.qameta.allure.Feature;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import properties.Credentionals;
import utils.WebDriverFactory;

public class BaseTest {


    @BeforeTest(groups = {"Regression", "Smoke"})
    public void setUp() {
        WebDriverFactory.createInstance("qwewqe");
    }


    @AfterTest(groups = {"Regression", "Smoke"})
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }


    @Feature("Create an Issue")
    @BeforeTest(groups = {"Regression", "Smoke"})
    public void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToJira(Credentionals.USERNAME, Credentionals.PASSWORD);
    }


}


