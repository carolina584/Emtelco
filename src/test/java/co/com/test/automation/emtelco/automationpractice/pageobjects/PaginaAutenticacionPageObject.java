package co.com.test.automation.emtelco.automationpractice.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php?controller=address")
public class PaginaAutenticacionPageObject extends PageObject{

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement opcionRegistrarse;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")
    public WebElement email;
	
	@FindBy(how = How.ID, using = "passwd")
    public WebElement password;
	
	
	public void inciarsesion() {

		opcionRegistrarse.click();
		email.sendKeys("yinaa56@hotmail.com");
		password.sendKeys("Emtelco2020.");
	}	
}
