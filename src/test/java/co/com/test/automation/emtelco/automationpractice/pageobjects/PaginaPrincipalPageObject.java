package co.com.test.automation.emtelco.automationpractice.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;

public class PaginaPrincipalPageObject {

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement opcionRegistrarse;
	
	public void clickRegistrarse() {

		opcionRegistrarse.click();
	}	
}
