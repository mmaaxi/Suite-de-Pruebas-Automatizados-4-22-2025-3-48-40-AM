package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc5Page;

public class tc5Steps {

    WebDriver driver;
    tc5Page page;

    @Given("I am on the test page")
    public void i_am_on_the_test_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/test-page");
        page = new tc5Page(driver);
    }

    @When("I perform Action 5")
    public void i_perform_action_5() {
        page.performAction5();
    }

    @Then("I should see Resultado 5")
    public void i_should_see_resultado_5() {
        page.verifyResultado5();
        driver.quit();
    }
}