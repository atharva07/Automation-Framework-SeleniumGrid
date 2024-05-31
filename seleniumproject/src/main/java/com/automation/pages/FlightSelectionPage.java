package com.automation.pages;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.automation.AbstractPage;

public class FlightSelectionPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='departure-flight']")
    private List<WebElement> departureFlight;

    @FindBy(xpath = "//input[@name='arrival-flight']")
    private List<WebElement> arrivalFlight;

    @FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
    private WebElement confirmFlightsButton;
    
    public FlightSelectionPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.confirmFlightsButton));
        return this.confirmFlightsButton.isDisplayed();
    }

    public void selectFlights() {
        int random = ThreadLocalRandom.current().nextInt(0, departureFlight.size());
        this.departureFlight.get(random).click();
        this.arrivalFlight.get(random).click();
    }

    public void confirmFlight() {
        this.confirmFlightsButton.click();
    }
}
