package co.com.test.automation.emtelco.automationpractice.stepsdefinitions;

import co.com.test.automation.emtelco.automationpractice.usersteps.AgregarDireccionesSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class agregardireccionesstepdefinitions {
	
	@Steps
	AgregarDireccionesSteps usuarioStep;
	
	
	@Given("^que el usuario ingresa a la pagina de automationpractice$")
    public void que_el_usuario_ingresa_a_la_pagina_de_automationpractice() throws Throwable {
       usuarioStep.abrePagina();
    }

    @When("^el usuario selecciona en login y diligencia las credenciales email y contraseña en el formulario$")
    public void el_usuario_selecciona_en_login_y_diligencia_las_credenciales_email_y_contrasea_en_el_formulario() throws Throwable {
      usuarioStep.seleccionaEnRegistrarseYIngresaCredenciales();
    }

    @Then("^el usuario visualiza la informacion de su cuenta$")
    public void el_usuario_visualiza_la_informacion_de_su_cuenta()  {
       
    }

    @When("^usuario elige la opcion mis direcciones, ademas agrega una nueva$")
    public void usuario_elige_la_opcion_mis_direcciones_ademas_agrega_una_nueva() throws Throwable {
      usuarioStep.usuarioEligeLaOpcionMisDireccionesAdemasAgregaUnaNueva();
    }

    @Then("^se visualiza la lista de direcciones agregadas$")
    public void se_visualiza_la_lista_de_direcciones_agregadas() throws Throwable {
     
    }
}
