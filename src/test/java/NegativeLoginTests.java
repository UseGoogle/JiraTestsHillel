import org.testng.Assert;
import pages.LoginPage;

import org.testng.annotations.Test;
import base.TestUtility;
import base.CSVDataProvider;

import java.util.Map;


public class NegativeLoginTests extends TestUtility {


    @Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
    public void negativeLoginTest(Map<String, String> testData) {

        String username = testData.get("username");
        String password = testData.get("password");

        LoginPage loginPage = new LoginPage(driver, logger);
        loginPage.openPage();
       loginPage.loginToJira(username, password);
        loginPage.clickSignInButton();
        Assert.assertEquals(loginPage.getErrorMessageText(), loginPage.getErrorMessageText());
    }

}







