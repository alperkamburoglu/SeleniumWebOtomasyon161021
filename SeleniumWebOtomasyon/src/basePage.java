import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
    WebDriver driver = null;
    WebDriverWait wait = null;

    public basePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60L);
    }

    public WebElement findElement(By by) {
        this.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return this.driver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        this.findElement(by).sendKeys(new CharSequence[]{text});
    }

    public void click(By by) {
        this.wait.until(ExpectedConditions.elementToBeClickable(by));
        this.findElement(by).click();
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(this.driver);
        actions.moveToElement(this.findElement(by)).build().perform();
    }

    public String getText(By by) {
        this.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return this.findElement(by).getText();
    }
}