import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseTest {
    static WebDriver webDriver = null;

    public baseTest() {
    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/CASPER/Downloads/selenium/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"start-maximized"});
        options.addArguments(new String[]{"disable-notifications"});
        options.addArguments(new String[]{"disable-popup-blocking"});
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        baseTest.webDriver = webDriver;
    }

    public void tearDown() {
        getWebDriver().quit();
    }
}
