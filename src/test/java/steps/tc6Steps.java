package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc6Page;
import static org.junit.Assert.assertTrue;

public class tc6Steps {
    tc6Page page = new tc6Page();

    @Given("I navigate to the application home page")
    public void iNavigateToTheApplicationHomePage() {
        page.navigateToHomePage();
    }

    @When("I perform Action 6")
    public void iPerformAction6() {
        page.performAction6();
    }

    @Then("I should see Resultado 6")
    public void iShouldSeeResultado6() {
        assertTrue(page.isResultado6Displayed());
    }
}