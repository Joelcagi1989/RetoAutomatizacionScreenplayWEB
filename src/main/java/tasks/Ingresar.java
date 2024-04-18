package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UTestHomePage;

public class Ingresar implements Task {

    public Ingresar() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestHomePage.BOTON_REGISTRAR)
        );
    }

    public static Ingresar aRegistrar() {
        return Tasks.instrumented(Ingresar.class);
    }
}
