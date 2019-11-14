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
        type(userNameLocator, username);
    }

    @Step("Fill User Password Field")
    private void typePassword(String password) {
        type(passwordLocator, password);
    }


    @Step("Click RememberMe CheckBox")
    private void clickRememberMeCheckBox() {
        click(rememberMeCheckBoxLocator);
    }

    @Step("Click SignIn Button")
    public void clickLoginButton() {
        click(loginButtonLocator);
    }



    public void negativeLogIn(String username, String password) {
        type(userNameLocator, username);
        type(passwordLocator, password);
        clickRememberMeCheckBox();
        click(loginButtonLocator);
    }


    public boolean getErrorMessageText() {
        return driver.findElement(errorMessageLocator).isDisplayed();

    }


}