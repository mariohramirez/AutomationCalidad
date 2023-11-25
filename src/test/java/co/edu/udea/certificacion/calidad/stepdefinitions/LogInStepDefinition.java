package co.edu.udea.certificacion.calidad.stepdefinitions;

import co.edu.udea.certificacion.calidad.questions.Validation;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.userinterfaces.SSMU;
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

import static co.edu.udea.certificacion.calidad.interactions.InputEmail.inputEmail;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LogInStepDefinition {
    @Managed(driver = "firefox")
    public WebDriver driver;

    public Actor user = Actor.named("Robinson");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        user.can(BrowseTheWeb.with(driver));
    }
    
    @After
    public void posStage(){
        driver.quit();
    }
    
    @Given("in the log in page")
    public void logInToTheSite() {
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(OpenThe.Browser(new SSMU()));
    }


    @When("input my email")
    public void inputMyEmail() {
        user.attemptsTo(inputEmail());
    }

    @And("input my password")
    public void inputMyPassword() {
        user.attemptsTo();
    }

    @Then("I succesfully log in to the site")
    public void logInSuccess(int arg0) {
        user.should(seeThat(Validation.theCartCount(), equalTo(true)));
    }
}
