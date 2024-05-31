package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.automation.AbstractPage;

public class RegistrationConfirmationPage extends AbstractPage {
    
    @FindBy(id = "go-to-flights-search")
    private WebElement goToflightSearchButton;

    @FindBy(css = "#registration-confirmation-section p b")
    private WebElement getCustomerName;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.goToflightSearchButton));
        return this.goToflightSearchButton.isDisplayed();
    }

    public String getFirstName() {
        return this.getCustomerName.getText();
    }

    public void goToflightSearch() {
        this.goToflightSearchButton.click();
    }
}
