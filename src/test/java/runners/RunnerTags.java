package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/utest_form.feature",
        glue = "stepdefinitions",
        tags = "@casoExitoso",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
