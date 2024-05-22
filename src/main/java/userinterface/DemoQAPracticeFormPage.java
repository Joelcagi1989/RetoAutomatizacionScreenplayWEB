package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DemoQAPracticeFormPage extends PageObject {
    public static final Target STUDENT_REGISTRATION = Target.the("Student registration form").located(By.xpath("//div[@id='app']//h5[text()='Student Registration Form']"));
    public static final Target CAMPO_NOMBRE_ESTUDIANTE = Target.the("Nombre estudiante").located(By.id("firstName"));
    public static final Target CAMPO_APELLIDO_ESTUDIANTE = Target.the("Apellido estudiante").located(By.id("lastName"));
    public static final Target CAMPO_EMAIL = Target.the("email").located(By.id("userEmail"));
    public static final Target CAMPO_MOBILE = Target.the("Campo celular").located(By.id("userNumber"));
    public static final Target CAMPO_FECHA_NACIMIENTO = Target.the("Campo fecha nacimiento").located(By.id("dateOfBirthInput"));
    public static final Target CAMPO_SUBJECT = Target.the("Subjects").located(By.xpath("//div[@id=\"subjectsContainer\"]//input[@id=\"subjectsInput\"]"));
    public static final Target CAMPO_DIRECCION_ACTUAL = Target.the("Dirección actual").located(By.id("currentAddress"));
    public static final Target STATE = Target.the("State").located(By.id("state"));
    public static final Target CITY = Target.the("City").located(By.id("city"));
    public static final Target BOTON_SUBMIT = Target.the("Boton Submit").located(By.id("submit"));

    public static final Target RADIO_MALE = Target.the("Radio Male").located(By.buttonText("Male"));
    public static final Target RADIO_FEMALE = Target.the("Radio Female").located(By.buttonText("Female"));
    public static final Target RADIO_OTHER = Target.the("Radio Other").located(By.buttonText("Other"));
    public static final Target CHECKBOX_SPORTS = Target.the("Sports Hobbie").located(By.buttonText("Sports"));
    public static final Target CHECKBOX_READING = Target.the("Reading Hobbie").located(By.buttonText("Reading"));
    public static final Target CHECKBOX_MUSIC = Target.the("Music Hobbie").located(By.buttonText("Music"));
    public static final Target BOTON_SELECCIONAR_ARCHIVO = Target.the("Boton seleccionar archivo").located(By.id("uploadPicture"));


    public static final Target YEARSTRING = Target.the("Anio datepicker").located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
    public static final Target MONTHSTRING = Target.the("Month datepicker").located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
    public static final Target CALENDARIO = Target.the("Despliegue de calendario").located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div"));
    public static final Target BOTON_CERRAR = Target.the("Boton cerrar").located(By.id("closeLargeModal"));

    public static final Target CAMPO_STATE = Target.the("Campo State").located(By.id("react-select-3-input"));
    public static final Target CAMPO_CITY = Target.the("Campo City").located(By.id("react-select-4-input"));
    public static final Target IMAGEN_INICIO = Target.the("Imagen Inicio").located(By.xpath("//*[@id=\"app\"]/header/a/img"));
}