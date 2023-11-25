package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.SSMU.USER_INPUT;

public class InputEmail implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("email1@gmail.com").into(USER_INPUT).thenHit(Keys.TAB)
        );
    }
    public static InputEmail inputEmail(){
        return Tasks.instrumented(InputEmail.class);
    }
}