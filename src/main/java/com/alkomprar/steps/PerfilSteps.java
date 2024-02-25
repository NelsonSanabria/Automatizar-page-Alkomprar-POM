package com.alkomprar.steps;
/*
 * @(#) PerfilSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkomprar.pages.PerfilPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PerfilSteps {

    @Page
    PerfilPage perfil;

    @Step("Validar registro")
    public void validarRegistro(){
        Assert.assertTrue(
                perfil.getDriver().findElement(perfil.getLblCuenta()).isDisplayed()
        );
    }
}
