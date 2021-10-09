package runners.mobile;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/mobile/BuscandoPropiedad.feature",
        glue = "stepdefinitions",
        tags = "@test",
        snippets = SnippetType.CAMELCASE)
public class BusquedaPropiedadRunner {
}
