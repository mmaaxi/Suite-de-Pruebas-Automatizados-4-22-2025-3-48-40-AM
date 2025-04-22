package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc8Page;

public class tc8Steps {
    WebDriver driver;
    tc8Page page;

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://example.com");
        page = new tc8Page(driver);
    }

    @When("I perform Action 8")
    public void i_perform_action_8() {
        page.performAction8();
    }

    @Then("I should see Result 8")
    public void i_should_see_result_8() {
        assert page.verifyResult8();
        driver.quit();
    }
}