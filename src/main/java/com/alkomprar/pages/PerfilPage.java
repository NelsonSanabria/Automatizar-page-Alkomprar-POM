package com.alkomprar.pages;
/*
 * @(#) PerfilPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PerfilPage extends PageObject {

    private By lblCuenta = By.xpath("//div[contains(@class,'module-title')]");

    public By getLblCuenta() {
        return lblCuenta;
    }
}
