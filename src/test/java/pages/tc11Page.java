package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc11Page {

    private WebDriver driver;

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    private By botonAccion11 = By.id("accion11");
    private By resultado11 = By.id("resultado11");

    public void realizarAccion11() {
        driver.findElement(botonAccion11).click();
    }

    public boolean verificarResultado11() {
        return driver.findElement(resultado11).isDisplayed();
    }
}