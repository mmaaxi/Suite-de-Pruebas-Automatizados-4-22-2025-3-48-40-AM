import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc13Page {
    WebDriver driver;

    By action13Button = By.id("action13Button");
    By resultado13Element = By.id("resultado13");

    public tc13Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRequiredPage() {
        driver.get("http://example.com/requiredpage");
    }

    public void performAction13() {
        driver.findElement(action13Button).click();
    }

    public boolean isResultado13Displayed() {
        return driver.findElement(resultado13Element).isDisplayed();
    }
}