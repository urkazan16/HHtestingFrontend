import Page.BrowserFactory;
import Page.DataOptions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfTests {
    public WebDriver driver;
    public AuthorizationPage objAuthorizationPage;
    public DataOptions objDataOptions;
    public ResumePage objResumePage;
    public BrowserFactory objBrowserFactory;

    @Before
    public void startUpChrome(){
        ChromeOptions options = BrowserFactory.getDriver("chrome");
        driver = new ChromeDriver(options);
        objAuthorizationPage = new AuthorizationPage(driver);
        objResumePage = new ResumePage(driver);
        objDataOptions = new DataOptions();
        driver.manage().deleteAllCookies();
    }


    @After
    public void quit() {
        driver.quit();
    }
}
