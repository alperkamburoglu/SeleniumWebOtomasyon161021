import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.String;

import java.util.ArrayList;

public class homePage extends basePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    public homePage trytoSearch(String search) throws InterruptedException{
        driver.findElement(By.id("search_input")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("search_input")).sendKeys(search);
        driver.findElement(By.className("searchButton")).click();
        Thread.sleep(2000);
        return this;
    }
    public homePage scrollDown() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        return this;
    }
    public homePage dahaFazlaUrun() throws InterruptedException{
        driver.findElement(By.className("lazy-load-button")).click();
        Thread.sleep(2000);
        return this;
    }
    public homePage chooseProductandaddtoCart() throws InterruptedException{

        ArrayList<WebElement> urunler = (ArrayList<WebElement>) driver.findElements(By.className("a_model_item"));
        int randomurun = (int) (Math.random() * urunler.size()) + 1;
        urunler.get(randomurun).click();

        Thread.sleep(4000);

        ArrayList<WebElement> bedenler = (ArrayList<WebElement>)
                driver.findElements(By.cssSelector("a[data-tracking-label='BedenSecenekleri']"));
        int randombeden = (int) (Math.random() * bedenler.size()) + 1;
        int rnd = randombeden;

        Thread.sleep(2000);

        bedenler.get(2).click();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",
                bedenler.get(2), "class", "selected");

        Thread.sleep(2000);

        driver.findElement(By.id("pd_add_to_cart")).click();

        Thread.sleep(2000);
        return this;
    }
}
