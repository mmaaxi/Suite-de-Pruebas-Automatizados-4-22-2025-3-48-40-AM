package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc9Page {
    WebDriver driver;

    By actionNineButton = By.id("action9Button");
    By resultadoNineText = By.id("resultado9");

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction9() {
        driver.findElement(actionNineButton).click();
    }

    public boolean isResultado9Displayed() {
        WebElement resultText = driver.findElement(resultadoNineText);
        return resultText.isDisplayed();
    }
}