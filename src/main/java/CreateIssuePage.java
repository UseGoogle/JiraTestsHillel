import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateIssuePage {
    private WebDriver driver;

    public CreateIssuePage(WebDriver driver) {
        this.driver = driver;
    }


    private By projectFieldLocator = By.xpath("//input[@id='project-field']");
    private By issueTypeLocator = By.xpath("//input[@id='issuetype-field']");
    private By summaryFieldLocator = By.xpath("//input[@id='summary']");
    private By descriptionTextAreaLocator = By.xpath("//textarea[@id='description']");
    private By createIssueButtonLocator = By.xpath("//input[@id='create-issue-submit']");
    WebElement ds;

    private void selectProject() {
        driver.findElement(projectFieldLocator).click();
    }

    private void selectIssueType(String issueType) {
        driver.findElement(issueTypeLocator).click();
        driver.findElement(issueTypeLocator).sendKeys(Keys.BACK_SPACE);
        driver.findElement(issueTypeLocator).sendKeys(issueType);


    }

    private void fillSummary(String summary) {
        driver.findElement(summaryFieldLocator).sendKeys(summary);
    }

    private void fillDescription(String description) {
        driver.findElement(descriptionTextAreaLocator).sendKeys(description);
    }

    public void clickCreateIssueButton() {
        driver.findElement(createIssueButtonLocator).click();
    }

    public void clickIssueDropDown() {
        driver.findElement(issueTypeLocator).click();
    }


    public WebElement getIssueOptionXpath(String issueType) {
        String path = String.format("//a[@class='aui-list-item-link aui-iconised-link']/parent::li//a[contains(text(),'%s')]", issueType);
        WebElement issueOptionXpath = driver.findElement(By.xpath(path));
        return issueOptionXpath;
    }









}


