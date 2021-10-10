package runners.apis;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/apis/users.feature",
        glue = "stepdefinitions",
        tags = "@TC001",
        snippets = SnippetType.CAMELCASE)
public class UserRunner {
}
