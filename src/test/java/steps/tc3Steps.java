package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc3Page;

public class tc3Steps {

    WebDriver driver;
    tc3Page page;

    @Given("I am on the Action 3 page")
    public void i_am_on_the_Action_3_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/action3");
        page = new tc3Page(driver);
    }

    @When("I perform Action 3")
    public void i_perform_Action_3() {
        page.performAction3();
    }

    @Then("I should see the Result 3")
    public void i_should_see_the_Result_3() {
        Assert.assertTrue(page.isResult3Displayed());
        driver.quit();
    }
}