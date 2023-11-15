package co.edu.udea.certificacion.calidad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

//@RunWith(Cucumber.class)
public class FindHomePageStepDefinition {

    @Managed(driver = "firefox")
    public WebDriver driver;

    public Actor estudiante = Actor.named("mario");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de gooogle")
    public void queMeEncuentroEnLaPaginaPrincipalDeGooogle() {
        estudiante.can(BrowseTheWeb.with(driver));
    }
    @When("escriba la palabra U de A")
    public  void  escribaLaPalabraUdeA(){
        //todo task
    }

    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerElLinkOficial(){
        //todo task
    }


}
