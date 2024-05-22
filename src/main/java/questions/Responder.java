package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.DemoQANewUserPage;

public class Responder implements Question<Boolean> {

    private String pregunta;

    public Responder(String pregunta) {
        this.pregunta = pregunta;
    }

    public static Responder la(String pregunta) {
        return new Responder(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String validacion = DemoQANewUserPage.VALIDACION.getName();
        System.out.println("Pregunta  : " + pregunta + "**");
        System.out.println("validacion: " + validacion + "**");
       if (pregunta.equals(validacion)){
           resultado = true;
       }else{
           resultado = false;
       }
        return resultado;
    }
}
