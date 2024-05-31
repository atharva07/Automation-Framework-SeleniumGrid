package com.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.automation.AbstractPage;

public class FlightSearchPage extends AbstractPage {
    
    @FindBy(id = "passengers")
    private WebElement passengersSelect;

    @FindBy(id = "search-flights")
    private WebElement searchFlightButton;
    
    public FlightSearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.passengersSelect));
        return this.passengersSelect.isDisplayed();
    }

    public void selectPassengers(String noOfPassengers) {
        Select passenger = new Select(this.passengersSelect);
        passenger.selectByValue(noOfPassengers);
    }

    public void searchFlight() {
        this.searchFlightButton.click();
    }
}