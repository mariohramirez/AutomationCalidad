package co.edu.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certificacion.calidad.userinterfaces.AmazonPage.ITEM_LIST;

public class ClickItem implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ITEM_LIST)
        );
    }
    public static ClickItem clickItem(){
        return Tasks.instrumented(ClickItem.class);
    }
}