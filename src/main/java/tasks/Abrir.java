package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UTestHomePage;

public class Abrir implements Task{

    private UTestHomePage UTestHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UTestHomePage));
    }

    public static Abrir laPaginaDeUtest() {
        return Tasks.instrumented(Abrir.class);
    }
}
