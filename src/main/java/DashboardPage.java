import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {


    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By createButtonLocator = By.xpath("//a[@id='create_link']");
    private By createdIssueLaberLocator = By.xpath("//div[@id='aui-flag-container']");

    public void clickCreateIssueButton() {
        driver.findElement(createButtonLocator).click();
    }

    public String getCreatedIssueText(){
        String issue = driver.findElement(createdIssueLaberLocator).getText();
        return issue;
    }

    public boolean getCreatedIssue(){
        return driver.findElement(createdIssueLaberLocator).isDisplayed();
    }
}


