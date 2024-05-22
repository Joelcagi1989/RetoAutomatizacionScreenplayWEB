package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static userinterface.DemoQANewUserPage.BOTON_NUEVO_USUARIO;

public class Ingresar implements Task {

    public Ingresar() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_NUEVO_USUARIO),
                Hit.the(Keys.PAGE_DOWN).into(BOTON_NUEVO_USUARIO),
                Click.on(BOTON_NUEVO_USUARIO)
        );
    }

    public static Ingresar aRegistrar() {
        return Tasks.instrumented(Ingresar.class);
    }
}
