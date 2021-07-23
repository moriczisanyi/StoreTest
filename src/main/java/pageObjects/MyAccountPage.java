package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//*[@class='info-account']")
    private WebElement welcomeMsg;
    public void checkWelcomeMsg(String expectedMsg)
    {
        Assert.assertTrue(expectedMsg.equals(welcomeMsg.getText()));

    }
    @FindBy(xpath = "//*[@class='logout']")
    private WebElement logOut;
    public void clickLogOut()
    {
        logOut.click();
    }
}
