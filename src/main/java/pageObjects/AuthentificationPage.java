package pageObjects;

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
}
