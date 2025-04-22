package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {

    WebDriver driver;

    By action1Button = By.id("action1Button");
    By result1Element = By.id("result1");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("http://example.com/");
    }

    public void performAction1() {
        driver.findElement(action1Button).click();
    }

    public boolean isResult1Displayed() {
        return driver.findElement(result1Element).isDisplayed();
    }
}