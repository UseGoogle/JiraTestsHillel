package pages;

import org.testng.Assert;
import properties.URL;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;


public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = WebDriverFactory.getDriver();
    }


    private By userNameLocator = By.xpath("//input[@id='login-form-username']");
    private By passwordLocator = By.xpath("//input[@id='login-form-password']");
    private By errorMessageLocator = By.xpath("//div[@class='aui-message aui-message-error']");
    private By loginButtonLocator = By.xpath("//input[@id='login']");
    private By LoginButtonLocatorFromLoginForm = By.xpath("//input[@id='login-form-submit']");
    private By rememberMeCheckBoxLocator = By.xpath("//input[@id='login-form-remember-me']");


    @Step("Navigate to Login Page")
    public void navigate(String url) {
        driver.get(url);
    }


    @Step("Fill User Name Field")
    private void typeUserName(String userName) {
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    @Step("Fill User Password Field")
    private void typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    @Step("Click SignIn Button")
    private void clickLoginButton() {
        String url = URL.BETA;


        if (url == URL.BETA) {
            driver.findElement(LoginButtonLocatorFromLoginForm).click();
        } else {
            driver.findElement(loginButtonLocator).click();
        }
    }

    @Step("Click RememberMe CheckBox")
    private void selectRememberMeCheckBox() {
        driver.findElement(rememberMeCheckBoxLocator).click();
    }


    public void loginToJira(String userName, String userPassword) {
        typeUserName(userName);
        typePassword(userPassword);
        selectRememberMeCheckBox();
        clickLoginButton();
    }


    public void checkLogin(String URL){
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessageLocator).getText();

    }
}