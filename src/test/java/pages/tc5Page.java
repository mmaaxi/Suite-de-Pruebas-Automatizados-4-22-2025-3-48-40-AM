package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc5Page {

    WebDriver driver;

    By action5Button = By.id("action5Button");
    By result5Element = By.id("result5");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction5() {
        WebElement actionButton = driver.findElement(action5Button);
        actionButton.click();
    }

    public void verifyResultado5() {
        WebElement resultElement = driver.findElement(result5Element);
        Assert.assertTrue("Resultado 5 is not displayed", resultElement.isDisplayed());
    }
}