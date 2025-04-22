package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc8Page {
    WebDriver driver;
    By action8Button = By.id("action8Button");
    By result8Text = By.id("result8Text");

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction8() {
        WebElement button = driver.findElement(action8Button);
        button.click();
    }

    public boolean verifyResult8() {
        WebElement result = driver.findElement(result8Text);
        return result.isDisplayed();
    }
}