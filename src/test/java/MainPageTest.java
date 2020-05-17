import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPageTest extends BaseTest {


    @Test
    public void signInTest() throws InterruptedException {
        LoginPage loginPage = mainPage.clickSignIn();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);
    }

    @Test
    public void registerFailTest() {
        SignUpPage signUpPage = mainPage.register("username148888", "testmail1488", "password14888");
        String error = signUpPage.getMainError();
        Assert.assertEquals("There were problems creating your account.", error);
    }

    @Test
    public void usernameFailTestWithoutUserName() {
        SignUpPage signUpPage = mainPage.register("","testmail1488", "password14888" );
        String error = signUpPage.getUserNameErrir();
        Assert.assertEquals("Username can't be blank", error);
    }

    @Test
    public void signUpInvalidEmail() {
        SignUpPage signUpPage = mainPage.register("", "testmail1488", "password14888");
        String error = signUpPage.getEmailError();
        Assert.assertEquals("Email is invalid or already taken", error);
    }

}