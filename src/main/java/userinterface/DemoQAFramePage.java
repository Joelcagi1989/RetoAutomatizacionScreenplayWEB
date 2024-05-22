package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DemoQAFramePage extends PageObject {
    public static final Target TARGET_MODULO = Target.the("Boton Alert Frame Window Modulo").located(By.xpath("//div[@id=\"app\"]//div[@class='accordion']"));
    public static final Target NESTED_FRAME = Target.the("Nested frame").located(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/div/ul"));
    public static final Target PROFILE = Target.the("Profile").located(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[6]/div/ul"));
    public static final Target PRACTICE_FORM = Target.the("Practice form").located(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div/ul"));
       public static final Target FRAME_PADRE = Target.the("Frame padre").located(By.id("frame1"));
    public static final Target FRAME_HIJO = Target.the("Frame hijo").located(By.xpath("/html/body/iframe"));
    public static final Target FRAME_NESTED_TEXTO = Target.the("Nested Frame").located(By.xpath("//*[@id=\"framesWrapper\"]/h1"));
    public static final Target FRAME_PADRE_TEXTO = Target.the("Parent Frame").located(By.xpath("/html/body/text()"));
    public static final Target FRAME_HIJO_TEXTO = Target.the("Child IFrame").located(By.xpath("/html/body/p"));
   }