package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

public class CreateAccountPage {
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver)
    {
        this.driver=driver;
    }

    @FindBy(id="id_gender1")
    private WebElement manGenderRadioButton;
    @FindBy(id ="customer_firstname")
    private WebElement firstNameField;
    @FindBy (id="customer_lastname")
    private WebElement lastNameField;
    @FindBy(id="passwd")
    private WebElement passwordField;
    @FindBy(id="days")
    private WebElement daysComboBox;
    //@FindBy(id="months")
    //private WebElement monthsComboBox;
    //@FindBy(id="months")
    //private Select monthsSelect;// = new Select(driver.findElement(By.xpath("//*[@id='months']")));
    @FindBy(id="years")
    private WebElement yearsComboBox;
    @FindBy(id="company")
    private WebElement companyField;
    @FindBy(id="address1")
    private WebElement addressFiled1;
    @FindBy(id="address2")
    private WebElement addressField2;
    @FindBy(id="city")
    private WebElement cityField;
    @FindBy(id="postcode")
    private WebElement zipCodeField;
    @FindBy(id="other")
    private WebElement additionalInfoField;
    @FindBy(id="phone")
    private WebElement phoneField;
    @FindBy(id="phone_mobile")
    private WebElement mobilePhoneField;
    public void selectManGender()
    {
        manGenderRadioButton.click();
    }
    public void enterFirstName(String firstName)
    {
        firstNameField.sendKeys(firstName);
    }
    public void enterLastName(String lastName)
    {
        lastNameField.sendKeys(lastName);
    }
    public void enterPassword(String password)
    {
        passwordField.sendKeys(password);
    }
    public void selectDay(String number)
    {
        daysComboBox.sendKeys(number);
    }
    public void selectMonth(String month)
    {
        Select monthsSelect = new Select(driver.findElement(By.id("months")));
        //monthsComboBox.sendKeys(month);
        monthsSelect.selectByValue(month);
    }
    public void selectYear(String year)
    {
        yearsComboBox.sendKeys(year);
    }
    public void enterCompany(String company)
    {
        companyField.sendKeys(company);
    }
    public void enterAddress1(String address)
    {
        addressFiled1.sendKeys(address);
    }
    public void enterAddress2(String address)
    {
        addressField2.sendKeys(address);
    }
    public void enterCity(String city)
    {
        cityField.sendKeys(city);
    }
    public void selectState(String value)
    {
        Select stateSelect = new Select(driver.findElement(By.id("id_state")));
        stateSelect.selectByValue(value);
    }
    public void selectCountry(String value)
    {
        Select countrySelect = new Select(driver.findElement(By.id("id_country")));
        countrySelect.selectByValue(value);
    }
    public void enterZipCode(String code)
    {
        zipCodeField.sendKeys(code);
    }
    public void enterAdditionalInfo(String info)
    {
        additionalInfoField.sendKeys(info);
    }
    public void enterHomePhone(String phone)
    {
        phoneField.sendKeys(phone);
    }
    public void enterMobilePhone(String mobilePhone)
    {
        mobilePhoneField.sendKeys(mobilePhone);
    }

}
