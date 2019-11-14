import org.testng.Assert;
import pages.LoginPage;

import org.testng.annotations.Test;
import base.TestUtility;
import base.CSVDataProvider;

import java.util.Map;


public class NegativeLoginTest extends TestUtility {


    @Test(dataProvider = "csvReader", dataProviderClass = CSVDataProvider.class)
    public void negativeLoginTest(Map<String, String> testData) {

        String username = testData.get("username");
        String password = testData.get("password");
        String expectedErrorMessage = testData.get("expected_message");


        LoginPage loginPage = new LoginPage(driver, logger);
        loginPage.openPage();
        loginPage.negativeLogIn(username, password);
        loginPage.clickSignInButton();
        Assert.assertEquals(loginPage.getErrorMessageText(), expectedErrorMessage);

    }

}







