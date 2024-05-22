package tasks;

import model.DemoQAData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static userinterface.DemoQANewUserPage.*;

public class Loguearse implements Task {
    private List<DemoQAData> demoQAData;

    public Loguearse(List<DemoQAData> demoQAData) {
        this.demoQAData = demoQAData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_LOGIN),
                Enter.theValue(demoQAData.get(0).getUserName()).into(CAMPO_USUARIO),
                Enter.theValue(demoQAData.get(0).getPassword()).into(CAMPO_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public static Loguearse conCredenciales(List<DemoQAData> demoQAData) {
        return Tasks.instrumented(Loguearse.class, demoQAData);
    }
}
