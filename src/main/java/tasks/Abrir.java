package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.DemoQAHomePage;

public class Abrir implements Task{

    private DemoQAHomePage demoQAHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoQAHomePage));
    }

    public static Abrir laPaginaDeDemoQA() {
        return Tasks.instrumented(Abrir.class);
    }
}
