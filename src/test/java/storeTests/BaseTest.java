package storeTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AuthentificationPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public AuthentificationPage autPage;
    public MyAccountPage myAccPage;
    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);
        autPage = PageFactory.initElements(driver, AuthentificationPage.class);
        myAccPage = PageFactory.initElements(driver,MyAccountPage.class);
    }
    @After
    public void after() {
        driver.quit();
    }

}
