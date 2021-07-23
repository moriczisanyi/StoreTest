package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthentificationPage {
    WebDriver driver;

    public AuthentificationPage(WebDriver driver)
    {
        this.driver = driver;

    }
    @FindBy(id="email")
    private WebElement emailAddress;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(xpath = "//*[@class='icon-lock left']")
    private WebElement signInButton;
    @FindBy(xpath = "//*[@class='icon-user left']")
    private WebElement createAnAccButton;
    @FindBy(id="create_account_error")
    private WebElement errorMessage;
    public void enterEamilAddress(String email) {
        emailAddress.sendKeys(email);
    }
    public void enterPassword(String passw)
    {
        password.sendKeys(passw);
    }
    public void clickSignIn()
    {
        signInButton.click();
    }
    public void clickCreateAnAccButton()
    {
        createAnAccButton.click();
    }
    public void checkErrorMessage(String msg)
    {
        //Assert.assertTrue(msg.equals(errorMessage.getText()));
        String errorMsg=driver.findElement(By.xpath("//*[@class='alert alert-danger']//li")).getText();
        Assert.assertEquals(errorMsg,msg);
    }
}
