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
    public Seleccionar(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listaObjeto = lista.resolveFor(actor).findElements(By.tagName("li"));
        for (int i=0; i < listaObjeto.size(); i++) {
            if(listaObjeto.get(i).getText().equals(opcion)) {
                listaObjeto.get(i).click();
                break;
            }
        }
    }
    public static Seleccionar opcion(Target lista, String opcion) {
        return new Seleccionar(lista, opcion);
    }

}
