import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import org.testng.annotations.Test;
import base.TestUtility;
import base.CSVDataProvider;

import java.util.Map;


public class NegativeLoginTest extends TestUtility {

    LoginPage loginPage;

    @BeforeMethod
    public void initializePage() {
        LoginPage loginPage = new LoginPage(driver, logger);
        loginPage.openPage();
    }

    @Test(dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
    public void negativeLoginTest(Map<String, String> testData) {

        String username = testData.get("username");
        String password = testData.get("password");
        String expectedErrorMessage = testData.get("expected_message");
        loginPage.loginToJira(username, password);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(), expectedErrorMessage);

    }

}







