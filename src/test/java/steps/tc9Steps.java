package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc9Page;

public class tc9Steps {
    WebDriver driver;
    tc9Page tc9page;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        driver = new ChromeDriver();
        driver.get("http://example.com");
        tc9page = new tc9Page(driver);
    }

    @When("I perform Action 9")
    public void iPerformAction9() {
        tc9page.performAction9();
    }

    @Then("I should see Resultado 9")
    public void iShouldSeeResultado9() {
        Assert.assertTrue(tc9page.isResultado9Displayed());
        driver.quit();
    }
}