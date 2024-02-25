package com.alkomprar.pages;
/*
 * @(#) HomePage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomePage extends PageObject {

    private By btnMicuenta = By.xpath("//li[@id='js-myaccount-header']/a");

    public By getBtnMicuenta() {
        return btnMicuenta;
    }
}
