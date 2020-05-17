
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameOrEmailField = By.xpath("//input[@id='login_field']");
    By passwordField = By.id("password");
    By signInButton = By.cssSelector("input[value='Sign in']");
    By heading = By.xpath("//div[contains(@class, 'auth-form-header')]/h1");
    By error = By.xpath("//div[@class='flash flash-full flash-error ']");
    By createAnAccount = By.xpath("//a[text()='Create an account']");


    public LoginPage typeEmailOrLogin(String emailOrLogin) {
        driver.findElement(usernameOrEmailField).sendKeys(emailOrLogin);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage incorrectLogin(String emailOrLogin, String password) {
        this.typeEmailOrLogin(emailOrLogin);
        this.typePassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public String getHeadingText () {
        return driver.findElement(heading).getText();
    }

    public String getError() {
        return driver.findElement(error).getText();
    }

    public SignUpPage clickCreateNewAccount() {
        driver.findElement(createAnAccount).click();
        return new SignUpPage(driver);
    }



}
