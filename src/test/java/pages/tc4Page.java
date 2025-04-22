package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc4Page {
    WebDriver driver;
    By action4Button = By.id("action4Button");
    By result4Element = By.id("result4Element");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction4() {
        driver.findElement(action4Button).click();
    }

    public boolean isResult4Displayed() {
        return driver.findElement(result4Element).isDisplayed();
    }
}