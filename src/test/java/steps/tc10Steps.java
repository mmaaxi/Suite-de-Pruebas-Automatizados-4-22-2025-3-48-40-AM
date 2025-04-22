package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc10Page;

public class tc10Steps {

    private WebDriver driver;
    private tc10Page page;

    @Given("estoy en la página principal")
    public void estoyEnLaPaginaPrincipal() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com");
        page = new tc10Page(driver);
    }

    @When("realizo la Acción 10")
    public void realizoLaAccion10() {
        page.realizarAccion10();
    }

    @Then("debería ver el Resultado 10")
    public void deberiaVerElResultado10() {
        Assert.assertTrue(page.verificarResultado10());
        driver.quit();
    }
}