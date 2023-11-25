package co.edu.udea.certificacion.calidad.questions;

import co.edu.udea.certificacion.calidad.userinterfaces.SSMU;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validation implements Question<Boolean> {

    private static final String EXPECTED_TEXT = "Ha ingresado correctamente";

    @Override
    public Boolean answeredBy(Actor actor) {
        String validationText = actor.asksFor(Text.of(SSMU.TEXT_MESSAGE).asString());
        System.out.println(String.format("Result: %s", validationText));
        return validationText.equals(EXPECTED_TEXT);
    }

    public static Validation theCartCount() {
        return new Validation();
    }
}

