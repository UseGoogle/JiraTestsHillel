import org.testng.Assert;
import pages.LoginPage;

import org.testng.annotations.Test;
import base.TestUtilities;
import base.CSVDataProvider;

import java.util.Map;


public class NegativeLoginTests extends TestUtilities {


    @Test(dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
    public void negativeLoginTest(Map<String, String> testData) {

        String no = testData.get("no");
        String username = testData.get("username");
        String password = testData.get("password");
        String expectedErrorMessage = testData.get("expectedMessage");
        String description = testData.get("description");

        LoginPage loginPage = new LoginPage(driver, logger);
        loginPage.openPage();
        loginPage.loginToJira(username, password);
        Assert.assertEquals(loginPage.getErrorMessageText(), expectedErrorMessage);
    }

}







