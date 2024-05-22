package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.DemoQAFramePage.*;

public class Extraer implements Task {
private String padre;
private String hijo;

    public Extraer(String padre, String hijo) {
        this.padre = padre;
        this.hijo = hijo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FRAME_NESTED_TEXTO)
        );
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(FRAME_PADRE.resolveFor(actor));
       /* actor.attemptsTo(
                Scroll.to(FRAME_PADRE)
        );
        actor.should(
                seeThat(the(FRAME_PADRE), hasValue(padre)));

        */
        System.out.println("Entre al parent frame y veo el texto: " + FRAME_PADRE_TEXTO.toString() + "**");
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(FRAME_HIJO.resolveFor(actor));
        System.out.println("Entre al child iframe y veo el texto: " + FRAME_HIJO_TEXTO.toString() + "**");

        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
    }

    public static Extraer elFrame(String padre, String hijo) {
        return Tasks.instrumented(Extraer.class, padre, hijo);
    }
}
