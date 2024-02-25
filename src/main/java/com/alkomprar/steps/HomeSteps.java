package com.alkomprar.steps;
/*
 * @(#) HomeSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkomprar.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeSteps {
    @Page
    HomePage homePage;


    @Step("Abrir el navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.alkomprar.com/");
    }

    @Step("Dar clic en boton Mi Cuenta")
    public void darClicCuenta(){
        homePage.getDriver().findElement(homePage.getBtnMicuenta()).click();
    }


}
