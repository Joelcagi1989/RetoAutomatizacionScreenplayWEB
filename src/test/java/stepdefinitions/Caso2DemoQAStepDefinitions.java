package stepdefinitions;


import cucumber.api.java.es.Y;
import model.DemoQAData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.conditions.Check;
import tasks.Acceder;
import tasks.Extraer;
import tasks.Llenar;

import java.util.List;

import static userinterface.DemoQAFramePage.*;

public class Caso2DemoQAStepDefinitions {
    @Y("^ingresa al modulo (.*) en la opcion (.*)$")
    public void ingresaAlModuloEnLaOpcion(String modulo, String opcion) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Check.whether(modulo.equalsIgnoreCase("Alerts, Frame & Windows"))
                        .andIfSo(Acceder.alModuloConOpcion(modulo, opcion, NESTED_FRAME))
                        .otherwise(
                                Check.whether(modulo.equalsIgnoreCase("Forms"))
                                        .andIfSo(Acceder.alModuloConOpcion(modulo, opcion, PRACTICE_FORM))
                                        .otherwise(
                                                Check.whether(modulo.equalsIgnoreCase("Book Store Application"))
                                                        .andIfSo(Acceder.alModuloConOpcion(modulo, opcion, PROFILE))
                                        )
                        )
        );
    }

    @Y("^extrae el texto (.*) y (.*)$")
    public void extraeElTextoParentFrameYChildIframe(String padre, String hijo) {
        OnStage.theActorInTheSpotlight().attemptsTo(Extraer.elFrame(padre, hijo));
    }

    @Y("^llena el formulario$")
    public void llenaElFormulario(List<DemoQAData> demoQAData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.elFormulario(demoQAData));
    }
}
