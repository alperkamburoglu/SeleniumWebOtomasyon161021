import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class pageTests extends baseTest {

    loginPage loginPage;
    homePage homePage;
    sepetimPage sepetimPage;

    @Before
    public void Before() throws InterruptedException{
        loginPage = new loginPage(getWebDriver());
        homePage = new homePage(getWebDriver());
        sepetimPage = new sepetimPage(getWebDriver());
    }

    @Test
    public void test() throws InterruptedException {
        loginPage.moveToLoginpage().trytoLogin();
        homePage.trytoSearch("pantolon").scrollDown().dahaFazlaUrun().chooseProductandaddtoCart();
        sepetimPage.movetosepetimPage().toplusCount().todeleteProduct();
    }
    @After
    public void after() throws InterruptedException{
        tearDown();
    }
}

