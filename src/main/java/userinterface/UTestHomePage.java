package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://utest.com/")
public class UTestHomePage extends PageObject {
    public static final Target BOTON_REGISTRAR = Target.the("Boton Join Today").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target CAMPO_PRIMER_NOMBRE = Target.the("Campo primer nombre").located(By.id("firstName"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo apellido").located(By.id("lastName"));
    public static final Target CAMPO_CORREO = Target.the("Campo correo").located(By.id("email"));
    public static final Target LISTA_MES = Target.the("lista mes").located(By.id("birthMonth"));
    public static final Target LISTA_DIA = Target.the("lista dia").located(By.id("birthDay"));
    public static final Target LISTA_ANIO = Target.the("lista anio").located(By.id("birthYear"));
    public static final Target CAMPO_IDIOMA = Target.the("Campo idioma").located(By.xpath("//div[@id='languages']//input"));
    public static final Target BOTON_LOCACION = Target.the("Boton Locacion").located(By.buttonText("Next: Location"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton Dispositivos").located(By.buttonText("Next: Devices"));

    public static final Target OPCION_DISPOSITIVOS = Target.the("Opcion dispositivo").located(By.xpath("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']"));
    public static final Target CAMPO_DISPOSITIVOS = Target.the("Campo dispositivo").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target LISTA_DISPOSITIVOS = Target.the("lista dispositivo").located(By.xpath("//div[@class='ui-select-box']//div[@name='handsetMakerId']//div[@class='ui-select-match']"));
    public static final Target OPCION_MODELOS = Target.the("Opcion modelo").located(By.xpath("//div[@name='handsetModelId']//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']"));
    public static final Target CAMPO_MODELOS = Target.the("Campo modelo").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target LISTA_MODELOS = Target.the("lista modelos").located(By.xpath("//div[@class='ui-select-box']//div[@name='handsetModelId']//div[@class='ui-select-match']"));
    public static final Target OPCION_SO = Target.the("Opcion sistema operativo").located(By.xpath("//div[@name='handsetOSId']//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']"));
    public static final Target CAMPO_SO = Target.the("Campo sistema operativo").located(By.xpath("//div[@name='handsetOSId']//input[@placeholder='Select OS']"));
    public static final Target LISTA_SO = Target.the("lista sistema operativo").located(By.xpath("//div[@class='ui-select-box']//div[@name='handsetOSId']//div[@class='ui-select-match']"));
    public static final Target BOTON_ULTIMO_PASO = Target.the("Boton Ultimo Paso").located(By.buttonText("Next: Last Step"));


    public static final Target CAMPO_PASSWORD = Target.the("Campo password").located(By.id("password"));
    public static final Target CAMPO_CONFIRMAR_PASSWORD = Target.the("Campo confirmar password").located(By.id("confirmPassword"));
    public static final Target TERMINOS_USO = Target.the("Terminos de Uso").located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target POLITICA_PRIVACIDAD = Target.the("Politicas de privacidad").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BOTON_COMPLETAR_REGISTRO = Target.the("Boton Completar registro").located(By.buttonText("Complete Setup"));

    public static final Target VALIDACION = Target.the("Welcome to the world's largest community of freelance software testers!").located(By.xpath("//body//ui-view//h1[1]"));
}