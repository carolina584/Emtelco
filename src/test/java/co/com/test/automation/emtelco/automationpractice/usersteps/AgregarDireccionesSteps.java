package co.com.test.automation.emtelco.automationpractice.usersteps;

import co.com.test.automation.emtelco.automationpractice.pageobjects.PaginaAgregarDireccionesPageObject;
import co.com.test.automation.emtelco.automationpractice.pageobjects.PaginaAutenticacionPageObject;
import co.com.test.automation.emtelco.automationpractice.pageobjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;

public class AgregarDireccionesSteps {

	PaginaAutenticacionPageObject pagina1;
	PaginaPrincipalPageObject pagina;
	PaginaAgregarDireccionesPageObject pagina3;

	@Step("usuario ingresa a la aplicacion web de automationpractice")
	public void abrePagina() {
		pagina1.open();
	}

	@Step("usuario selecciona la opcion registrarse y ingresa las credenciales del sitio")
	public void seleccionaEnRegistrarseYIngresaCredenciales() {
		pagina1.inciarsesion();
	}

	@Step("se visualiza la lista de direcciones agregadas")
	public void seVisualizaLaListaDeDireccionesAgregadas() {
		pagina1.inciarsesion();
	}

	@Step("^usuario elige la opcion mis direcciones, ademas agrega una nueva$")
	public void usuarioEligeLaOpcionMisDireccionesAdemasAgregaUnaNueva() {
		pagina3.agregarDirecciones();
	}
}
