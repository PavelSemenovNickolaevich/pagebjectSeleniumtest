import org.junit.Assert;
import org.junit.Test;

public class SignUpPageTest extends BaseTest {


    @Override
    public String toString() {
        return "SignUpPageTest{" +
                "signUpPage=" + signUpPage +
                '}';
    }
//негативный
    @Test
    public void signWithShortPass() {
        SignUpPage signUpPage = mainPage.clickSignUp();
        SignUpPage sp = signUpPage.typePassword("123");
        String error = sp.getPasswordError();
        Assert.assertEquals("text-red text-bold", error);

    }

}
