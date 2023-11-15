package co.edu.udea.certificacion.calidad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_udea_homepage.feature",
        glue = "co.edu.udea.certificacion.calidad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@PaginaEncontrada"
)
public class FindHomePage {

}