import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc13Steps {
    WebDriver driver;
    tc13Page page;

    public tc13Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, tc13Page.class);
    }

    @Given("the user is on the required page")
    public void the_user_is_on_the_required_page() {
        page.navigateToRequiredPage();
    }

    @When("the user performs action 13")
    public void the_user_performs_action_13() {
        page.performAction13();
    }

    @Then("the result should be resultado 13")
    public void the_result_should_be_resultado_13() {
        assertTrue(page.isResultado13Displayed());
    }
}