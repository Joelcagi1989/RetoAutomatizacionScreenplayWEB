package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;

import java.io.IOException;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions (
        snippets= SnippetType.CAMELCASE,
        features = "src/test/resources/features/caso_dos_demo_qa.feature",
        glue = "stepdefinitions")
public class CasoDosRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles(".src/test/resources/features/caso_dos_demo_qa.feature");
    }
}

