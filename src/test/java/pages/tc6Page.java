package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class tc6Page {
    WebDriver driver;

    public tc6Page() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        driver.get("http://example.com");
    }

    public void performAction6() {
        WebElement actionElement = driver.findElement(By.id("action6"));
        actionElement.click();
    }

    public boolean isResultado6Displayed() {
        WebElement resultElement = driver.findElement(By.id("resultado6"));
        return resultElement.isDisplayed();
    }
}