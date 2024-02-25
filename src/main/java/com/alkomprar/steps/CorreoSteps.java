package com.alkomprar.steps;
/*
 * @(#) CorreoSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkomprar.pages.ValidacionCorreo;
import com.alkomprar.utils.Excel;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class CorreoSteps {
    @Page
    ValidacionCorreo correo;

    @Step("Ingresar correo")
    public void ingresarCorreo(){
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/registro.xlsx", "Registro");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        correo.getDriver().findElement(correo.getTxtEmail())
                .sendKeys(datos.get(0).get("Correo"));
    }

    @Step("Ingresar correo")
    public void clicValidarEmail(){
        
        correo.getDriver().findElement(correo.getBtnContinuar()).click();

    }
}
