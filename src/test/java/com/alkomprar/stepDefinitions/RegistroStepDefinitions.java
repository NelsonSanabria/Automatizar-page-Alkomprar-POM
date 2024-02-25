package com.alkomprar.stepDefinitions;
/*
 * @(#) RegistroStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkomprar.steps.CorreoSteps;
import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.PerfilSteps;
import com.alkomprar.steps.RegistroSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class RegistroStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Steps
    CorreoSteps correo;

    @Steps
    RegistroSteps registro;
    @Steps
    PerfilSteps perfil;

    @Dado("que el usuario abre la pagina de alkomprar")
    public void queElUsuarioAbreLaPaginaDeAlkomprar() {
        homeSteps.abrirNavegador();

    }
    @Dado("pulsa el boton de mi cuenta")
    public void pulsaElBotonDeMiCuenta() {
        homeSteps.darClicCuenta();

    }
    @Cuando("el usuario ingresa la informacion de registro")
    public void elUsuarioIngresaLaInformacionDeRegistro(DataTable dataTable) {
        correo.ingresarCorreo();
        correo.clicValidarEmail();
        registro.ingresarDatos();
        registro.autorizarYRegistrar();

    }
    @Entonces("verá el panel de perfil de usuario")
    public void veráElPanelDePerfilDeUsuario() {
        perfil.validarRegistro();

    }
}
