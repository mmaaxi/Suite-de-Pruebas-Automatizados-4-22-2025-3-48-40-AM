package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc7Page {
    WebDriver driver;

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "action7Button")
    WebElement action7Button;

    @FindBy(id = "resultado7")
    WebElement resultado7;

    public void performAction7() {
        action7Button.click();
    }

    public boolean isResultado7Displayed() {
        return resultado7.isDisplayed();
    }
}