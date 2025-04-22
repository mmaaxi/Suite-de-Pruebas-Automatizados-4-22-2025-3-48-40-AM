package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc2Page;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;

public class tc2Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc2Page page = PageFactory.initElements(driver, tc2Page.class);

    @Given("el usuario navega a la página de inicio")
    public void el_usuario_navega_a_la_página_de_inicio() {
        driver.get("http://url_de_la_pagina_de_inicio.com");
    }

    @When("el usuario realiza Acción 2")
    public void el_usuario_realiza_Acción_2() {
        page.performAction2();
    }

    @Then("el usuario ve Resultado 2")
    public void el_usuario_ve_Resultado_2() {
        assertTrue(page.isResult2Displayed());
    }
}