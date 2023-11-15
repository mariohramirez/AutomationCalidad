package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.calidad.userinterfaces.AmazonPage.ADD_TO_CART_BUTTON;

public class AddToCart implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_TO_CART_BUTTON)
        );
    }
    public static AddToCart addToCart(){
        return Tasks.instrumented(AddToCart.class);
    }
}