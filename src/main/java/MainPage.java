import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//a[text()='Sign in']")
    WebElement signInButton;
    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement singUpButton;
    @FindBy(xpath = ".//*[@id='user[login]']")
    WebElement userNameField;
    @FindBy(xpath = ".//*[@id='user[email]']" )
    WebElement emailField;
    @FindBy(xpath = ".//*[@id='user[password]']")
    WebElement passwordField;
    @FindBy(css = "button.btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3")
    WebElement signUpForButton;


    public LoginPage clickSignIn() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp() {
        singUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForGitHubButton() {
        signUpForButton.click();
        return  new SignUpPage(driver);
    }

    public MainPage typeUserName(String username) {
        userNameField.sendKeys(username);
        return this;
    }

    public MainPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email) {
        emailField.sendKeys(email);
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
