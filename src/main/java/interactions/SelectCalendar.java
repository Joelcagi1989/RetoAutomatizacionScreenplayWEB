package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static userinterface.DemoQAPracticeFormPage.MONTHSTRING;
import static userinterface.DemoQAPracticeFormPage.YEARSTRING;

public class SelectCalendar implements Interaction {

    private Target target;
    private String dateString;

    private SelectCalendar(Target target, String dateString) {
        this.target = target;
        this.dateString = dateString;
    }

    public static SelectCalendar of(Target target, String dateString) {
        return new SelectCalendar(target, dateString);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] ddmmyy = dateString.split(" ");
        String day = ddmmyy[0];
        String month = ddmmyy[1];
        String year = ddmmyy[2];
        switch (month){
            case "Jan":
                month="January";
                break;
            case "Feb":
                month="February";
                break;
            case "Mar":
                month="March";
                break;
            case "Apr":
                month="April";
            case "May":
                month="May";
                break;
            case "Jun":
                month="June";
                break;
            case "Jul":
                month="July";
                break;
            case "Aug":
                month="August";
                break;
            case "Sep":
                month="September";
                break;
            case "Oct":
                month="October";
                break;
            case "Nov":
                month="November";
                break;
            case "Dec":
                month="December";
                break;
            default:
                month="0";
        }
        Target diaCalendario = Target.the("dia seleccionar").located(By.buttonText(day));

        actor.attemptsTo(
                SelectFromOptions.byVisibleText(year).from(YEARSTRING),
                SelectFromOptions.byVisibleText(month).from(MONTHSTRING),
                Click.on(diaCalendario)
        );
    }
}

