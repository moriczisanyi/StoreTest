package storeTests;
import org.junit.Test;
public class LoginTests extends BaseTest {
    @Test
    public void shouldSuccesfullyLogin()
    {
        homePage.clickSignInButton();
        autPage.enterEamilAddress("smoriczi@yahoo.com");
        autPage.enterPassword("password");
        autPage.clickSignIn();
        myAccPage.checkWelcomeMsg("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccPage.clickLogOut();
    }
}
