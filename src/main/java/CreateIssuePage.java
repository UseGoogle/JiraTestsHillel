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
    public By issueTypeLocator = By.xpath("//input[@id='issuetype-field']");
    private By summaryFieldLocator = By.xpath("//input[@id='summary']");
    private By descriptionTextAreaLocator = By.xpath("//textarea[@id='description']");
    private By createIssueButtonLocator = By.xpath("//input[@id='create-issue-submit']");
    private By issue;


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

    private void clickCreateIssueButton() {
        driver.findElement(createIssueButtonLocator).click();
    }

    public void clearField(WebElement webElement){
        driver.findElement((By) webElement).clear();
    }

    public void createIssue (WebElement webElement, String type, String summary, String description){
        fillSummary(summary);
        fillDescription(description);
        clickCreateIssueButton();
    }

    public void seele() throws InterruptedException {
        driver.findElement(issueTypeLocator).click();
        Thread.sleep(4000);
    }


    public By issueWebElementBuilder(String issueType){
        WebElement Issue = driver.findElement(By.xpath("//a[@class='aui-list-item-link aui-iconised-link']/parent::li//a[contains(text(),'" + issueType + "')]"));
        return this.issue;
    }

    public void createIssue1() throws InterruptedException {{
        driver.findElement(issueTypeLocator).click();
        Thread.sleep(4000);
        driver.findElement(issue).click();
        Thread.sleep(4000);



    }


    }


}

