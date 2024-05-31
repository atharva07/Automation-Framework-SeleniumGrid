package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.automation.AbstractPage;

public class Registrationpage extends AbstractPage {
    
    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement emailAddress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "street")
    private WebElement street;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "zip")
    private WebElement zip;

    @FindBy(id = "register-btn")
    private WebElement registerButton;

    // this is a constructor through which we will accept webdriver
    public Registrationpage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.firstName));
        return this.firstName.isDisplayed();
    }

    public void goTo(String url) {
        this.driver.get(url);
    }

    public void enterUserDetails(String firstName, String lastName) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
    }

    public void enterUserCredentials(String email, String password) {
        this.emailAddress.sendKeys(email);
        this.password.sendKeys(password);
    }

    public void enterAddress(String street, String city, String zip) {
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.zip.sendKeys(zip);
    }

    public void register() {
        this.registerButton.click();
    }
}