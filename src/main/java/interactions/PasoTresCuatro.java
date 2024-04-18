package interactions;

import model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.UTestHomePage.*;

public class PasoTresCuatro implements Interaction {

    private List<UTestData> uTestData;

    public PasoTresCuatro(List<UTestData> uTestData) {
        this.uTestData = uTestData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LISTA_DISPOSITIVOS),
                WaitUntil.the(OPCION_DISPOSITIVOS, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(uTestData.get(0).getDispositivoMovil()).into(CAMPO_DISPOSITIVOS),
                Seleccionar.opcion(OPCION_DISPOSITIVOS, uTestData.get(0).getDispositivoMovil()),
                Click.on(LISTA_MODELOS),
                WaitUntil.the(OPCION_MODELOS, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(uTestData.get(0).getModelo()).into(CAMPO_MODELOS),
                Seleccionar.opcion(OPCION_MODELOS, uTestData.get(0).getModelo()),
                Click.on(LISTA_SO),
                WaitUntil.the(OPCION_SO, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(uTestData.get(0).getSistemaOperativo()).into(CAMPO_SO),
                Seleccionar.opcion(OPCION_SO, uTestData.get(0).getSistemaOperativo()),
                Click.on(BOTON_ULTIMO_PASO),
                Enter.theValue(uTestData.get(0).getContrasena()).into(CAMPO_PASSWORD),
                Enter.theValue(uTestData.get(0).getConfirmarContrasena()).into(CAMPO_CONFIRMAR_PASSWORD),
                Click.on(TERMINOS_USO),
                Click.on(POLITICA_PRIVACIDAD),
                Click.on(BOTON_COMPLETAR_REGISTRO)
                );
    }

    public static PasoTresCuatro diligenciar(List<UTestData> uTestData){
        return Tasks.instrumented(PasoTresCuatro.class, uTestData);
    }
}
