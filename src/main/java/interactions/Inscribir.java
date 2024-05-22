package interactions;

import model.DemoQAData;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.DemoQANewUserPage.*;

public class Inscribir implements Interaction {

    private List<DemoQAData> demoQAData;

    public Inscribir(List<DemoQAData> demoQAData) {
        this.demoQAData = demoQAData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
          /*      Enter.theValue(demoQAData.get(0).getFirstName()).into(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(demoQAData.get(0).getLastName()).into(CAMPO_APELLIDO),
                Enter.theValue(demoQAData.get(0).getUserName()).into(CAMPO_CORREO),
                SelectFromOptions.byVisibleText(demoQAData.get(0).getPassword().trim()).from(LISTA_MES),
                SelectFromOptions.byVisibleText(demoQAData.get(0).getDiaN().trim()).from(LISTA_DIA),
                SelectFromOptions.byVisibleText(demoQAData.get(0).getAnioN().trim()).from(LISTA_ANIO),
                Hit.the(Keys.TAB).into(LISTA_ANIO),
                WaitUntil.the(CAMPO_IDIOMA, isEnabled()).forNoMoreThan(10).seconds(),
                Type.theValue(demoQAData.get(0).getIdioma()).into(CAMPO_IDIOMA),
                Click.on(BOTON_LOCACION),
                WaitUntil.the(BOTON_DISPOSITIVOS, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DISPOSITIVOS),
                WaitUntil.the(BOTON_VERIFICAR_CAPTCHA, isEnabled()).forNoMoreThan(10).seconds(),


           */
                Scroll.to(CAMPO_PRIMER_NOMBRE),
                Hit.the(Keys.PAGE_DOWN).into(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(demoQAData.get(0).getFirstName()).into(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(demoQAData.get(0).getLastName()).into(CAMPO_APELLIDO),
                Enter.theValue(demoQAData.get(0).getUserName()).into(CAMPO_USUARIO),
                Enter.theValue(demoQAData.get(0).getPassword()).into(CAMPO_REGISTRAR_PASSWORD)

        );

        BrowseTheWeb.as(actor).getDriver().switchTo().frame(IFRAME.resolveFor(actor));
        actor.attemptsTo(
                WaitUntil.the(CHECK_CAPTCHA, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(CHECK_CAPTCHA)
        );

        new InternalSystemClock().pauseFor(60000);
        BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();

        actor.attemptsTo(
                Scroll.to(BOTON_REGISTRAR),
                Click.on(BOTON_REGISTRAR)
        );
/*
        BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        actor.attemptsTo(
                WaitUntil.the(BOTON_ALERTA, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ALERTA)
        );

 */

        actor.attemptsTo(
                WaitUntil.the(BOTON_REGRESAR_LOGIN, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REGRESAR_LOGIN)
        );
    }

    public static Inscribir laCuentaDeUsuario(List<DemoQAData> demoQAData){
        return Tasks.instrumented(Inscribir.class, demoQAData);
    }
}
