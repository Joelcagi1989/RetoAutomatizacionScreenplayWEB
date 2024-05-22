package tasks;

import interactions.Realizar;
import model.DemoQAData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Llenar implements Task {

    private List<DemoQAData> demoQAData;

    public Llenar(List<DemoQAData> demoQAData) {
        this.demoQAData = demoQAData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Realizar.elDiligenciamiento(demoQAData));
    }

    public static Llenar elFormulario(List<DemoQAData> demoQAData) {
        return Tasks.instrumented(Llenar.class, demoQAData);
    }
}
