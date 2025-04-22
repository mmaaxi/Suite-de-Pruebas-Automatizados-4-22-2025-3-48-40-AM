package steps;

import pages.tc14Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc14Steps {

    private tc14Page page = new tc14Page();

    @Given("the user performs Action 14")
    public void the_user_performs_action_14() {
        page.performAction14();
    }

    @When("the system processes the action")
    public void the_system_processes_the_action() {
        page.waitForProcessing();
    }

    @Then("the user should see Resultado 14")
    public void the_user_should_see_resultado_14() {
        assertTrue(page.verifyExpectedResult());
    }
}