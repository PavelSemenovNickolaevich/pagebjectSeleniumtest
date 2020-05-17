import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    SignUpPage signUpPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        // driver  = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
