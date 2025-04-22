package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc11Page;
import utils.DriverFactory;

public class tc11Steps {

    private WebDriver driver = DriverFactory.getDriver();
    private tc11Page page = new tc11Page(driver);
    private WebDriverWait wait = DriverFactory.getWait();

    @Given("el usuario navega a la página de inicio")
    public void elUsuarioNavegaALaPaginaDeInicio() {
        driver.get("https://www.example.com");
    }

    @When("el usuario realiza la acción 11")
    public void elUsuarioRealizaLaAccion11() {
        page.realizarAccion11();
    }

    @Then("el usuario debería ver el resultado esperado 11")
    public void elUsuarioDeberiaVerElResultadoEsperado11() {
        Assert.assertTrue(page.verificarResultado11());
    }
}