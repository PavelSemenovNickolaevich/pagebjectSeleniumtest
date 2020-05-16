import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.xpath("//a[text()='Sign in']");
    By singUpButton = By.xpath("//a[text()='Sign up']");
    By userNameField = By.xpath(".//*[@id='user[login]']");
    By emailField = By.xpath(".//*[@id='user[email]']");
    By passwordField = By.xpath(".//*[@id='user[password]']");
    By signUpForButton = By.cssSelector("button.btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3");


    public LoginPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp() {
        driver.findElement(singUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForGitHubButton() {
        driver.findElement(signUpForButton).click();
        return  new SignUpPage(driver);
    }

    public MainPage typeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public MainPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage register (String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickSignUp();
        return new SignUpPage(driver);

    }

}
