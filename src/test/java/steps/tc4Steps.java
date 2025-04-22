package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc4Page;

public class tc4Steps {
    WebDriver driver;
    tc4Page page;

    @Given("I am on the proper initial page")
    public void i_am_on_the_proper_initial_page() {
        driver = new ChromeDriver();
        driver.get("http://your_initial_page_url");
        page = new tc4Page(driver);
    }

    @When("I perform Action 4")
    public void i_perform_action_4() {
        page.performAction4();
    }

    @Then("I should see Result 4")
    public void i_should_see_result_4() {
        Assert.assertTrue(page.isResult4Displayed());
        driver.quit();
    }
}