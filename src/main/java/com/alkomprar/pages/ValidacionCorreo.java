package com.alkomprar.pages;
/*
 * @(#) ValidacionCorreo.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ValidacionCorreo extends PageObject {

    private By txtEmail= By.id("js-login-email");
    private By btnContinuar = By.id("js-login-continue");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
