package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterface.DemoQANewUserPage.BOTON_ELIMINAR_USUARIO;
import static userinterface.DemoQANewUserPage.BOTON_OK_BORRAR;

public class Eliminar implements Task {

    public Eliminar() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_ELIMINAR_USUARIO),
                Click.on(BOTON_ELIMINAR_USUARIO),
                Click.on(BOTON_OK_BORRAR)
        );
    }

    public static Eliminar laCuentaRegistrada() {
        return Tasks.instrumented(Eliminar.class);
    }
}
