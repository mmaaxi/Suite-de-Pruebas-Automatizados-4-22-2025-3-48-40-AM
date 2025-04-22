import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc1Page;
import static org.junit.Assert.assertTrue;

public class tc1Steps {

    WebDriver driver = new ChromeDriver();
    tc1Page page = new tc1Page(driver);

    @Given("el usuario está en la página inicial")
    public void elUsuarioEstaEnLaPaginaInicial() {
        page.openHomePage();
    }

    @When("el usuario realiza Acción 1")
    public void elUsuarioRealizaAccion1() {
        page.performAction1();
    }

    @Then("el usuario debería ver Resultado 1")
    public void elUsuarioDeberiaVerResultado1() {
        assertTrue(page.isResult1Displayed());
        driver.quit();
    }
}