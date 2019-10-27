package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class DashboardPage {

    private WebDriver driver;
    UI_Actions ui_actions;
    public DashboardPage() {
        driver = WebDriverFactory.getDriver();
        ui_actions = new UI_Actions(driver);
    }

    private By createButtonLocator = By.id("create_link");
    private By createdIssueLabelLocator = By.xpath("//div[@id='aui-flag-container']");

    public void clickCreateIssueButton() {
        ui_actions.click(createButtonLocator, 3, 3);
    }

    public String getCreatedIssueText() {
        String issue = driver.findElement(createdIssueLabelLocator).getText();
        return issue;
    }

}


