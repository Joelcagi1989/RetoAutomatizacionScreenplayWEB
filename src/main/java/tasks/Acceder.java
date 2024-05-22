package tasks;

import interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.DemoQAFramePage.TARGET_MODULO;

public class Acceder implements Task {
private String modulo;
private String opcion;
private Target TARGET_OPCION;

    public Acceder(String modulo, String opcion, Target TARGET_OPCION) {
        this.modulo = modulo;
        this.opcion = opcion;
        this.TARGET_OPCION = TARGET_OPCION;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TARGET_MODULO, isEnabled()).forNoMoreThan(10).seconds(),
                Seleccionar.modulo(TARGET_MODULO, modulo,"div"),
                WaitUntil.the(TARGET_OPCION, isEnabled()).forNoMoreThan(10).seconds(),
                Scroll.to(TARGET_OPCION),
                Seleccionar.modulo(TARGET_OPCION, opcion,"li")
        );
    }

    public static Acceder alModuloConOpcion(String modulo, String opcion, Target TARGET_OPCION) {
        return Tasks.instrumented(Acceder.class, modulo, opcion, TARGET_OPCION);
    }
}
