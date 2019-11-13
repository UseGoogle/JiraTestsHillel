package pages;

import org.apache.logging.log4j.Logger;
import properties.URL;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePageObject {


    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }


    private By userNameLocator = By.xpath("//input[@id='login-form-username']");
    private By passwordLocator = By.xpath("//input[@id='login-form-password']");
    private By errorMessageLocator = By.xpath("//div[@class='aui-message aui-message-error']");
    private By loginButtonLocator = By.id("login-form-submit");
    private By rememberMeCheckBoxLocator = By.xpath("//input[@id='login-form-remember-me']");


    @Step("Navigate to Login Page")
    public void openPage() {
        openUrl(URL.BETA);
    }


    @Step("Fill User Name Field")
    private void typeUserName(String username) {
        type(username, userNameLocator);
    }

    @Step("Fill User Password Field")
    private void typePassword(String password) {
        type(password, passwordLocator);
    }


    @Step("Click RememberMe CheckBox")
    private void  clickRememberMeCheckBox() {
        click(rememberMeCheckBoxLocator);
    }

    @Step("Click SignIn Button")
    public void clickSignInButton(){
        click(loginButtonLocator);
    }


    public void loginToJira(String username, String password) {
        typeUserName(username);
        typePassword(password);
        clickRememberMeCheckBox();
        clickSignInButton();
    }


    public void negativeLogIn(String username, String password) {
        logger.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
        type(username, userNameLocator);
        type(password, passwordLocator);
        click(loginButtonLocator);
    }



    public String getErrorMessageText() {
        return driver.findElement(errorMessageLocator).getText();

    }


}