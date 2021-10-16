import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage {

    public loginPage(WebDriver driver) {
        super(driver);
    }

    public loginPage moveToLoginpage(){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        return this;
    }
    public loginPage trytoLogin() throws InterruptedException{
        driver.findElement(By.id("LoginEmail"))
                .sendKeys("kamburoglualper@gmail.com");
        driver.findElement((By.id("Password"))).sendKeys("a2684357");
        driver.findElement(By.id("loginLink")).click();
        Thread.sleep(2000);
        return this;
    }
}
