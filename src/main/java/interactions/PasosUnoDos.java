package interactions;

import model.UTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.UTestHomePage.*;

public class PasosUnoDos implements Interaction {

    private List<UTestData> uTestData;

    public PasosUnoDos(List<UTestData> uTestData) {
        this.uTestData = uTestData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(uTestData.get(0).getPrimerNombre()).into(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(uTestData.get(0).getApellido()).into(CAMPO_APELLIDO),
                Enter.theValue(uTestData.get(0).getCorreo()).into(CAMPO_CORREO),
                SelectFromOptions.byVisibleText(uTestData.get(0).getMesN().trim()).from(LISTA_MES),
                SelectFromOptions.byVisibleText(uTestData.get(0).getDiaN().trim()).from(LISTA_DIA),
                SelectFromOptions.byVisibleText(uTestData.get(0).getAnioN().trim()).from(LISTA_ANIO),
                Hit.the(Keys.TAB).into(LISTA_ANIO),
                WaitUntil.the(CAMPO_IDIOMA, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(uTestData.get(0).getIdioma()).into(CAMPO_IDIOMA),
                Click.on(BOTON_LOCACION),
                WaitUntil.the(BOTON_DISPOSITIVOS, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DISPOSITIVOS)
        );
    }

    public static PasosUnoDos diligenciar(List<UTestData> uTestData){
        return Tasks.instrumented(PasosUnoDos.class, uTestData);
    }
}
