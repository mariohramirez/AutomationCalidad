package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SSMU extends PageObject {
    public static final Target USER_INPUT = the("Email input")
            .locatedBy("//*[@id=\":Rlaiem:\"]\n");

    public static final Target PASSWORD_INPUT = the("Password input")
            .locatedBy("//*[@id=\":Rtaiem:\"]\n");
    public static final Target TEXT_MESSAGE = the("Password input")
            .locatedBy("//*[@id='Ryaiem']");
}
