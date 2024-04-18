package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.Abrir;
import tasks.Diligenciar;
import tasks.Ingresar;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) quiere ingresar a pagina de utest para creacion de usuario$")
    public void queTesterQuiereIngresarAPaginaDeUtestParaCreacionDeUsuario(String usuario) {
        OnStage.theActorCalled(usuario).wasAbleTo(Abrir.laPaginaDeUtest());
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.aRegistrar());
    }

    @Cuando("^diligencia los pasos con los datos$")
    public void diligenciaLosPasosConLosDatos(List<UTestData> uTestData){
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.pasos(uTestData));
    }

    @Entonces("^el deberia ver el (.*)$")
    public void elDeberiaVerElMensaje(String pregunta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.la(pregunta)));
    }

}
