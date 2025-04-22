package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc2Page {

    WebDriver driver;

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "accion2Element")
    private WebElement accion2Element;

    @FindBy(id = "resultado2Element")
    private WebElement resultado2Element;

    public void performAction2() {
        accion2Element.click(); // Assuming the action is a click
    }

    public boolean isResult2Displayed() {
        return resultado2Element.isDisplayed();
    }
}