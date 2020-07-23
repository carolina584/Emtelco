package co.com.test.automation.emtelco.automationpractice.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "test.automation.emtelco.automationpractice/feature",
        glue = {"co.com.test.automation.emtelco.automationpractice.stepsdefinitions"}
)
public class agregardireccionesrunner {

}
