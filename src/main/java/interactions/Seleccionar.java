package interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Seleccionar implements Interaction {
    private Target lista;
    private String opcion;
    private String tag;
    public Seleccionar(Target lista, String opcion, String tag) {
        this.lista = lista;
        this.opcion = opcion;
        this.tag = tag;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listaObjeto = lista.resolveFor(actor).findElements(By.tagName(tag));
        for (int i=0; i < listaObjeto.size(); i++) {
            if(listaObjeto.get(i).getText().equals(opcion)) {
                listaObjeto.get(i).click();
                break;
            }
        }
    }
    public static Seleccionar modulo(Target lista, String opcion, String tag) {
        return new Seleccionar(lista, opcion, tag);
    }

}
