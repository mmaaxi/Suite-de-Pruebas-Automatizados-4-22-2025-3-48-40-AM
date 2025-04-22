package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc3Page {

    WebDriver driver;

    By action3Button = By.id("action3Button");
    By result3Text = By.id("result3Text");

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction3() {
        driver.findElement(action3Button).click();
    }

    public boolean isResult3Displayed() {
        return driver.findElement(result3Text).isDisplayed();
    }
}