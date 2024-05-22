package tasks;

import interactions.Inscribir;
import model.DemoQAData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Diligenciar implements Task {

    private List<DemoQAData> demoQAData;

    public Diligenciar(List<DemoQAData> demoQAData) {
        this.demoQAData = demoQAData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Inscribir.laCuentaDeUsuario(demoQAData));
    }

    public static Diligenciar proceso(List<DemoQAData> demoQAData) {
        return Tasks.instrumented(Diligenciar.class, demoQAData);
    }
}
