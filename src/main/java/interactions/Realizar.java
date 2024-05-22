package interactions;

import model.DemoQAData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.DemoQAPracticeFormPage.*;

public class Realizar implements Interaction {

    private List<DemoQAData> demoQAData;

    public Realizar(List<DemoQAData> demoQAData) {
        this.demoQAData = demoQAData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       /* actor.attemptsTo(
                Upload.theFile(demoQAData.get(0).getFoto()).to(BOTON_SELECCIONAR_ARCHIVO)
                );

        */
        actor.attemptsTo(
                Scroll.to(STUDENT_REGISTRATION),
                Enter.theValue(demoQAData.get(0).getFirstNameStudent()).into(CAMPO_NOMBRE_ESTUDIANTE),
                Enter.theValue(demoQAData.get(0).getLastNameStudent()).into(CAMPO_APELLIDO_ESTUDIANTE),
                Enter.theValue(demoQAData.get(0).getEmail()).into(CAMPO_EMAIL),
                Check.whether(demoQAData.get(0).getGender().equals("Female"))
                        .andIfSo(Click.on(RADIO_FEMALE))
                        .otherwise(Check.whether(demoQAData.get(0).getGender().equals("Male"))
                                .andIfSo(Click.on(RADIO_MALE))
                                .otherwise(Click.on(RADIO_OTHER))
                        ),
                Enter.theValue(demoQAData.get(0).getMobile()).into(CAMPO_MOBILE),
                Click.on(CAMPO_FECHA_NACIMIENTO),
                SelectCalendar.of(CALENDARIO, demoQAData.get(0).getdOB()),
                Type.theValue(demoQAData.get(0).getSubjects()).into(CAMPO_SUBJECT),
                Check.whether(demoQAData.get(0).getHobbies().equals("Music"))
                        .andIfSo(Click.on(CHECKBOX_MUSIC))
                        .otherwise(Check.whether(demoQAData.get(0).getHobbies().equals("Sports"))
                                .andIfSo(Click.on(CHECKBOX_SPORTS))
                                .otherwise(Click.on(CHECKBOX_READING))
                        ),
                Enter.theValue(demoQAData.get(0).getCurrentAddress()).into(CAMPO_DIRECCION_ACTUAL),
                Click.on(STATE),
                Enter.theValue(demoQAData.get(0).getState()).into(CAMPO_STATE),
                Hit.the(Keys.ENTER).into(CAMPO_STATE),
                Click.on(CITY),
                Enter.theValue(demoQAData.get(0).getCity()).into(CAMPO_CITY),
                Hit.the(Keys.ENTER).into(CAMPO_CITY),
                Click.on(BOTON_SUBMIT),
                WaitUntil.the(BOTON_CERRAR, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR)
                );
    }

    public static Realizar elDiligenciamiento(List<DemoQAData> demoQAData){
        return Tasks.instrumented(Realizar.class, demoQAData);
    }
}
