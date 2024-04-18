package tasks;

import interactions.PasoTresCuatro;
import interactions.PasosUnoDos;
import model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Diligenciar implements Task {

    private List<UTestData> uTestData;

    public Diligenciar(List<UTestData> uTestData) {
        this.uTestData = uTestData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PasosUnoDos.diligenciar(uTestData),
                PasoTresCuatro.diligenciar(uTestData));
    }

    public static Diligenciar pasos(List<UTestData> uTestData) {
        return Tasks.instrumented(Diligenciar.class, uTestData);
    }
}
