package com.alkomprar.steps;
/*
 * @(#) RegistroSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.alkomprar.pages.RegistroPage;
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
public class RegistroSteps {
    @Page
    RegistroPage registro;

    @Step("Ingresar datos de registro")
    public void ingresarDatos(){
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/registro.xlsx", "Registro");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        registro.getDriver().findElement(registro.getTxtNombre())
                .sendKeys(datos.get(0).get("Nombre"));

        registro.getDriver().findElement(registro.getTxtApellido())
                .sendKeys(datos.get(0).get("Apellido"));

        registro.getDriver().findElement(registro.getTxtNumero())
                .sendKeys(datos.get(0).get("Telefono"));

    }

    @Step("Ingresar datos de registro")
    public void autorizarYRegistrar(){

        registro.getDriver().findElement(registro.getChkAutorizar())
                .click();

        registro.getDriver().findElement(registro.getBtnRegistrar())
                .submit();
    }
}
