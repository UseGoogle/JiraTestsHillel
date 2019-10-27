package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;


import java.util.List;


public class CreateIssuePage {
    private WebDriver driver;
    private UI_Actions ui_actions;

    public CreateIssuePage() {
        driver = WebDriverFactory.getDriver();
        ui_actions = new UI_Actions(driver);
    }


    private By projectFieldLocator = By.xpath("//input[@id='project-field']");
    private By issueTypeLocator = By.xpath("//input[@id='issuetype-field']");
    private By summaryFieldLocator = By.xpath("//input[@id='summary']");
    private By descriptionTextAreaLocator = By.xpath("//textarea[@id='description']");
    private By createIssueButtonLocator = By.xpath("//input[@id='create-issue-submit']");
    private By moreButtonLocator = By.xpath("//span[@class='icon aui-ss-icon noloading drop-menu']");
    private By dataModeSource = By.xpath("//li[@data-mode='source']");



    @Step("Select Project by Entering Text")
    public void setProjectByEnteringText(String project) {
        clearField();
        ui_actions.enterText(projectFieldLocator, project, 3, 3);
    }


    @Step("Set Issue Type by Entering Text")
    public void setIssueTypeByEnteringText(String issueType) {
        clearField();
        ui_actions.enterText(issueTypeLocator, issueType, 3, 3);
    }





    @Step("Click on Issue Type Field")
    public void clickIssueTypeField() {
        driver.findElement(issueTypeLocator).click();
    }

    @Step("Enter Summary")
    public void enterSummary(String summary) {
        driver.findElement(summaryFieldLocator).sendKeys(summary);
    }

    @Step("Enter Description")
    public void enterDescription(String description) {
        driver.findElement(descriptionTextAreaLocator).sendKeys(description);
    }


    public void enterIssueDescription(String description) {
        driver.findElement(dataModeSource);
        ui_actions.enterText(descriptionTextAreaLocator, description, 3, 3);
    }



    @Step("Click Create Button")
    public void clickCreateIssueButton() {
        driver.findElement(createIssueButtonLocator).click();
    }


    @Step("Clear Issue Type Field")
    public void clearField() {
        driver.findElement(issueTypeLocator).clear();
    }


    public void clickMoreButton(int index) {
        List<WebElement> myList = driver.findElements(moreButtonLocator);
        myList.get(index).click();
    }


    public WebElement setIssueOptionXpath(String issueType) {
        String path = String.format("//a[contains(text(),'%s')]", issueType);
        WebElement issueOption = driver.findElement(By.xpath(path));
        System.out.println(issueOption);
        return issueOption;
    }


}


