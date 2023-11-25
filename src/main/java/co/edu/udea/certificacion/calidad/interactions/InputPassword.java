package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.SSMU.*;

public class InputPassword implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("12345").into(PASSWORD_INPUT).thenHit(Keys.TAB)
                        .thenHit(Keys.TAB)
                        .thenHit(Keys.RETURN)
        );
    }
    public static InputPassword clickItem(){
        return Tasks.instrumented(InputPassword.class);
    }
}