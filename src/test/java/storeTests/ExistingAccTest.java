package storeTests;

import org.junit.Test;

public class ExistingAccTest extends BaseTest{
    @Test
    public void checkIfUserExists()
    {
        homePage.clickSignInButton();
        homePage.sendNewAccEmail("smoriczi@yahoo.com");
        autPage.clickCreateAnAccButton();
        autPage.checkErrorMessage("An account using this email address has already been registered. Please enter a valid password or request a new one.");
    }
}
