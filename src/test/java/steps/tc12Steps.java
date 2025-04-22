import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc12Page;

public class tc12Steps {
    WebDriver driver;
    tc12Page page;

    public tc12Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, tc12Page.class);
    }

    @Given("I am on the start page")
    public void i_am_on_the_start_page() {
        driver.get("http://example.com/start");
    }

    @When("I perform Action 12")
    public void i_perform_action_12() {
        page.performAction12();
    }

    @Then("I should see Resultado 12")
    public void i_should_see_resultado_12() {
        Assert.assertTrue(page.isResultado12Displayed());
    }
}