package storeTests;

import org.junit.Test;

public class CreateAccTest extends BaseTest{
    @Test
    public void testAccountCreation()
    {
        homePage.clickSignInButton();
        homePage.sendNewAccEmail("testemail1@yahoo.com");
        autPage.clickCreateAnAccButton();
        createAccPage.selectManGender();
        createAccPage.enterFirstName("test");
        createAccPage.enterLastName("page");
        createAccPage.enterPassword("password");
        createAccPage.selectDay("12");
        createAccPage.selectMonth("8");
        createAccPage.selectYear("1998");
        createAccPage.enterCompany("TestComp");
        createAccPage.enterAddress1("Earth");
        createAccPage.enterAddress2("Moon");
        createAccPage.enterCity("Rome");
        createAccPage.selectState("2");
        createAccPage.enterZipCode("12345");
        createAccPage.selectCountry("21");
        createAccPage.enterAdditionalInfo("It's a test");
        createAccPage.enterHomePhone("1234567890");
        createAccPage.enterMobilePhone("0987654321");
    }
}
