package co.com.test.automation.emtelco.automationpractice.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class PaginaAgregarDireccionesPageObject {

	@FindBy(how = How.XPATH, using = "//*[@id='lastname']")
    public WebElement nombre;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/input")
    public WebElement apellido;
	
	@FindBy(how = How.XPATH, using = "//*[@id='company']")
    public WebElement empresa;
	
	@FindBy(how = How.XPATH, using = "//*[@id='address1']")
    public WebElement domicilio;
	
	@FindBy(how = How.XPATH, using = "//*[@id='address2']")
    public WebElement direccion2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='city']")
    public WebElement ciudad;
	
	@FindBy(how = How.XPATH, using = "//*[@id='id_state']")
    public WebElement estado;
	
	@FindBy(how = How.XPATH, using = "//*[@id='id_state']")
    public WebElement seleccionarEstado;
	
	@FindBy(how = How.XPATH, using = "//*[@id='id_country']")
    public WebElement pais;
	
	@FindBy(how = How.XPATH, using = "//*[@id='phone']")
    public WebElement telefono;
	
	public void agregarDirecciones() {

		nombre.sendKeys("Carolina");
		apellido.sendKeys("Muñoz");
		empresa.sendKeys("Emtelco");
		domicilio.sendKeys("Carrera 29 # 81 -28");
		ciudad.sendKeys("Medellin");
		estado.click();
		seleccionarEstado.sendKeys("Arizona");
		pais.click();
		telefono.sendKeys("312432123.");
	}	
}
