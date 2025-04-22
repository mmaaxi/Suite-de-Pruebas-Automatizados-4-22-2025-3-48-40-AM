package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc10Page {

    private WebDriver driver;

    // Element locator for Resultado 10
    private By resultado10Locator = By.id("resultado10");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion10() {
        // Implementación de la Acción 10
        driver.findElement(By.id("accion10")).click();
    }

    public boolean verificarResultado10() {
        // Verificación de que el Resultado 10 se muestra correctamente
        return driver.findElement(resultado10Locator).isDisplayed();
    }
}