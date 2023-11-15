package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.INPUT_TEXT;

public class UdeaHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("U de A").into(INPUT_TEXT).thenHit(Keys.RETURN));
    }
    public static UdeaHomePage go(){
        return Tasks.instrumented(UdeaHomePage.class);
    }
}
