package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import model.DemoQAData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.*;

import java.util.List;

public class Caso1DemoQAStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ingresar a pagina de demoqa para creacion de usuario$")
    public void queTesterQuiereIngresarAPaginaDeDemoqaParaCreacionDeUsuario(String usuario) {
        OnStage.theActorCalled(usuario).wasAbleTo(Abrir.laPaginaDeDemoQA());
    }

    @Cuando("^diligencia los datos para la creación de un usuario$")
    public void diligenciaLosDatosParaLaCreaciónDeUnUsuario(List<DemoQAData> demoQAData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.aRegistrar());
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.proceso(demoQAData));
    }

    @Y("^realiza el logueo$")
    public void realizaElLogueo(List<DemoQAData> demoQAData) {

        OnStage.theActorInTheSpotlight().attemptsTo(Loguearse.conCredenciales(demoQAData));
    }

    @Y("^elimina la cuenta$")
    public void eliminaLaCuenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Eliminar.laCuentaRegistrada());
    }

    @Entonces("^el deberia ver el (.*)$")
    public void elDeberiaVerElMensaje(String pregunta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.la(pregunta)));
    }
}
