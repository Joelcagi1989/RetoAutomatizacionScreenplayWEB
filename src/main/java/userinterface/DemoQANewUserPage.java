package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DemoQANewUserPage extends PageObject {
    public static final Target BOTON_NUEVO_USUARIO = Target.the("Boton New User").located(By.id("newUser"));
    public static final Target BOTON_LOGIN = Target.the("Boton login").located(By.id("login"));
    public static final Target CAMPO_PRIMER_NOMBRE = Target.the("Campo primer nombre").located(By.id("firstname"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo apellido").located(By.id("lastname"));
    public static final Target CAMPO_USUARIO = Target.the("Campo usuario").located(By.id("userName"));
    public static final Target CAMPO_REGISTRAR_PASSWORD = Target.the("Campo registrar password").located(By.id("password"));
    public static final Target CHECK_CAPTCHA = Target.the("Captcha").located(By.id("recaptcha-anchor"));
    public static final Target BOTON_REGISTRAR = Target.the("Boton registrar").located(By.id("register"));
    public static final Target IFRAME = Target.the("Iframe").located(By.xpath("//*[@id='g-recaptcha']/div/div/iframe"));
    public static final Target IFRAME2 = Target.the("Iframe2").located(By.xpath("//iframe[@title='recaptcha challenge expires in two minutes']"));
    public static final Target BOTON_VERIFICAR_CAPTCHA = Target.the("Boton Verificar captcha").located(By.xpath("//button[@id='recaptcha-verify-button']"));
    public static final Target BOTON_REGRESAR_LOGIN = Target.the("Boton regresar login").located(By.id("gotologin"));

    public static final Target BOTON_ALERTA = Target.the("Boton de alerta").located(By.xpath("//button[@onclick='jsAlert()']"));
    public static final Target BOTON_CONFIRMACION = Target.the("Boton de Confirmacion").located(By.xpath("//button[@onclick='jsConfirm()']"));
    public static final Target BOTON_PROMPT = Target.the("Boton de Prompt").located(By.xpath("//button[@onclick='jsPrompt()"));
   public static final Target BOTON_OK_BORRAR = Target.the("Boton OK borrado").located(By.buttonText("OK"));


    public static final Target CAMPO_PASSWORD = Target.the("Campo password").located(By.id("password"));
      public static final Target BOTON_ELIMINAR_USUARIO = Target.the("Boton eliminar usuario").located(By.buttonText("Delete Account"));

    public static final Target VALIDACION = Target.the("Invalid username or password!").located(By.xpath("//p[@id='name']"));
}