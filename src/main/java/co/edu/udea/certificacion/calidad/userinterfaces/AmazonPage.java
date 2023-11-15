package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class AmazonPage extends PageObject {
    public static final Target SEARCH_INPUT = the("Search input")
            .locatedBy("//*[@id='twotabsearchtextbox']");
    public static final Target ITEM_LIST = the("First item list")
            .locatedBy("//*[@id=\"search\"]/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div");
    public static final Target ADD_TO_CART_BUTTON = the("Add to cart button")
            .locatedBy("//*[@id='add-to-cart-button']");
    public static final Target CART_ITEMS_NUMBER = the("Number of item in cart")
            .locatedBy("//*[@id='nav-cart-count']");
}
