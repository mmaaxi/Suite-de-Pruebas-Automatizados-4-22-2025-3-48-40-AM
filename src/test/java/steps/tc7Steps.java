package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc7Page;

public class tc7Steps {
    WebDriver driver;
    tc7Page page;

    public tc7Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc7Page.class);
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        driver.get("http://example.com");
    }

    @When("I perform Action 7")
    public void i_perform_action_7() {
        page.performAction7();
    }

    @Then("I should see Resultado 7")
    public void i_should_see_resultado_7() {
        Assert.assertTrue(page.isResultado7Displayed());
    }
}