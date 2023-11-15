package co.edu.udea.certificacion.calidad.stepdefinitions;

import co.edu.udea.certificacion.calidad.questions.Validation;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.userinterfaces.AmazonPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.certificacion.calidad.interactions.AddToCart.addToCart;
import static co.edu.udea.certificacion.calidad.interactions.ClickItem.clickItem;
import static co.edu.udea.certificacion.calidad.interactions.SearchArticle.searchArticle;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddItemStepDefinition {
    @Managed(driver = "firefox")
    public WebDriver driver;

    public Actor client = Actor.named("Mario");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        client.can(BrowseTheWeb.with(driver));
    }
    
    @After
    public void posStage(){
        driver.quit();
    }
    
    @Given("que me encuentro en la pagina principal de Amazon")
    public void queMeEncuentroEnLaPaginaPrincipalDeAmazon() {
        client.can(BrowseTheWeb.with(driver));
        client.attemptsTo(OpenThe.Browser(new AmazonPage()));
    }


    @When("busque un articulo en la barra de busqueda")
    public void busqueUnArticuloEnLaBarraDeBusqueda() {
        client.attemptsTo(searchArticle());
    }

    @And("selecione el primer resultado de la busqueda")
    public void selecioneElPrimerResultadoDeLaBusqueda() {
    //    client.attemptsTo(clickItem());
    }

    @And("agrega al carrito de compras")
    public void agregaAlCarritoDeCompras() {
        client.attemptsTo(addToCart());
    }

    @Then("puedo ver el icono de carros de compras actualizado con {int} articulo")
    public void puedoVerElIconoDeCarrosDeComprasActualizadoConArticulo(int arg0) {
        client.should(seeThat(Validation.theCartCount(), equalTo(true)));
    }
}
