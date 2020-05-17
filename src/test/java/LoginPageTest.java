import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void loginWithEmptyCredsTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        LoginPage newloginPage = loginPage.incorrectLogin("", "");
        String error = newloginPage.getError();
        Assert.assertEquals("Incorrect username or password.", error);
    }

    @Test
    public void loginWithInvalidCredsTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        LoginPage newloginPage = loginPage.incorrectLogin("ddddddddddddddddd", "dddddddddddddddddddddd");
        String error = newloginPage.getError();
        Assert.assertEquals("Incorrect username or password.", error);
    }

    @Test
    public void cresteAccTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        SignUpPage signUpPage = loginPage.clickCreateNewAccount();
        String heading = signUpPage.getHedingText();
        Assert.assertEquals("Create your account", heading);


    }
}
