import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    private By userNameLocator = By.xpath("//input[@id='login-form-username']");
    private By passwordLocator = By.xpath("//input[@id='login-form-password']");
    private By errorMessageLocator = By.xpath("//div[@class='aui-message aui-message-error']");
    private By loginButtonLocator = By.xpath("//input[@id='login-form-submit']");
    private By rememberMeCheckBoxLocator = By.xpath("//input[@id='login-form-remember-me']");


    private void typeUserName(String userName) {
        driver.findElement(userNameLocator).sendKeys(userName);
    }

    private void typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    private void clickLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }


    private void selectRememberMeCheckBox() {
        driver.findElement(rememberMeCheckBoxLocator).click();
    }


    public void loginToJira(String userName, String password) {
        selectRememberMeCheckBox();
        typeUserName(userName);
        typePassword(password);
        clickLoginButton();
    }

    public String getErrorMessageText(){
        return driver.findElement(errorMessageLocator).getText();

    }
}