import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc12Page {
    WebDriver driver;

    @FindBy(id = "action12Button")
    WebElement action12Button;

    @FindBy(id = "resultado12")
    WebElement resultado12;

    public tc12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction12() {
        action12Button.click();
    }

    public boolean isResultado12Displayed() {
        return resultado12.isDisplayed();
    }
}