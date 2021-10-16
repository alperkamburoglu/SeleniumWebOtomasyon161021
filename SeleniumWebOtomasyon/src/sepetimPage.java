import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sepetimPage extends basePage{

    public sepetimPage(WebDriver driver) {
        super(driver);
    }
    public sepetimPage movetosepetimPage() throws InterruptedException{
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/sepetim");
        Thread.sleep(2000);
        return this;
    }

    public sepetimPage toplusCount() throws InterruptedException{
        driver.findElement(By.cssSelector("a[class='oq-up plus']")).click();
        Thread.sleep(2000);
        return this;
    }
    public sepetimPage todeleteProduct() throws InterruptedException {
        driver.findElement(By.cssSelector("a[class='cart-square-link']")).click();

        Thread.sleep(2000);

        driver.findElement(By.
                cssSelector("a[class='inverted-modal-button sc-delete ins-init-condition-tracking']")).click();

        Thread.sleep(2000);

        WebElement sepetbosmu = driver.findElement(By.cssSelector("p[class='cart-empty-title'"));
        String sepetKontrol = sepetbosmu.getText();
        String emptyMessageActual = sepetbosmu.getText();
        String emptyMessageExpected = "Sepetinizde ürün bulunmamaktadır.";
        Assert.assertEquals(emptyMessageExpected, emptyMessageActual);
        Thread.sleep(1500);
        driver.findElement(By.id("search")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("search")).sendKeys("Sepet Boş");
        Thread.sleep(1500);
        return this;
    }
}
