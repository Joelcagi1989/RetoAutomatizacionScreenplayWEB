package runners;

import cucumber.api.SnippetType;

import utils.BeforeSuite;
import utils.DataToFeature;
import cucumber.api.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions (
        snippets= SnippetType.CAMELCASE,
        features = "src/test/resources/features/caso_uno_demo_qa.feature",
        glue = "stepdefinitions")
public class CasoUnoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles(".src/test/resources/features/caso_uno_demo_qa.feature");
    }
}

