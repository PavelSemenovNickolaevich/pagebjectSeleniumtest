import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    By heading = By.xpath("//h1[@class]");
    By signUpButton = By.xpath(".//*[@id='signup button']");
    By usernameField = By.xpath(".//*[@id='user_login']");
    By userEmail = By.xpath(".//*[@id='user_email']");
    By userPassword = By.xpath(".//*[@id='user_password']");
    By mainError = By.xpath("//div[@class='flash flash-error my-3']");
    By userNameError = By.xpath("//input[@id='user_login']/ancestor::dd/following-sibling::dd");
    By emailError = By.xpath(".//*[@id='user_email']/ancestor::dd/following-sibling::dd");
   // By passwordError = By.xpath(".//*[@id='user_password']/ancestor::dd/following-sibling::dd");
    By passwordAtLeast15Char = By.xpath("//span[@class='text-red text-bold']");

    public SignUpPage typeUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password) {
        driver.findElement(userPassword).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email) {
        driver.findElement(userEmail).sendKeys(email);
        return this;
    }

    public SignUpPage registerWithInvalidCreds(String username, String email, String password) {
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(signUpButton);
        return new SignUpPage(driver);
    }

    public String getHedingText() {
        return driver.findElement(heading).getText();
    }

    public String getMainError() {
        return driver.findElement(mainError).getText();
    }

    public String getUserNameErrir() {
        return driver.findElement(userNameError).getText();
    }

    public String getEmailError() {
        return driver.findElement(emailError).getText();
    }

    public String getPasswordError() {
        return driver.findElements(passwordAtLeast15Char).get(0).getAttribute("class");
    }




}
