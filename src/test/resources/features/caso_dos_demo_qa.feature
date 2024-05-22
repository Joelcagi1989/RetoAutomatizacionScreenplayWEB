# language:es

  Característica: Diligenciar formulario creacion/eliminacion nuevo usuario
    Como tester
    quiero ingresar a la pagina de demoqa
    para diligenciar los pasos del formulario para creación de un nuevo usuario, gestión de opciones y posterior eliminacion de este

  Esquema del escenario: gestionar caso 2
    Dado que tester quiere ingresar a pagina de demoqa para creacion de usuario
    Cuando diligencia los datos para la creación de un usuario
      | firstName   | lastName   | userName   | password   |
      | <firstName> | <lastName> | <userName> | <password> |
    Cuando realiza el logueo
      | userName   | password   |
      | <userName> | <password> |
    Y ingresa al modulo Alerts, Frame & Windows en la opcion Nested Frames
    Y extrae el texto Parent frame y Child Iframe
    Y ingresa al modulo Forms en la opcion Practice Form
    Y llena el formulario
      | firstNameStudent   | lastNameStudent   | email   | gender   | mobile   | dOB   | subjects   | hobbies   | currentAddress   | state   | city   | foto   |
      | <firstNameStudent> | <lastNameStudent> | <email> | <gender> | <mobile> | <dOB> | <subjects> | <hobbies> | <currentAddress> | <state> | <city> | <foto> |
    Y ingresa al modulo Book Store Application en la opcion Profile
    Y elimina la cuenta
    Y realiza el logueo
      | userName   | password   |
      | <userName> | <password> |
    Entonces el deberia ver el <mensaje>
  Ejemplos:
    |firstName|lastName|userName|password|mensaje| firstNameStudent   | lastNameStudent   | email   | gender   | mobile   | dOB   | subjects   | hobbies   | currentAddress   | state   | city   |foto|
    ##@externaldata@.src/test/resources/data/DataCaso2.xlsx@Datos@1
  |Test02 |Test02 |test02 |Test2023* |Invalid username or password!|Prueba01|Prueba01   | prueba@yopmail.com|Female|3004441234|27 Sep 2000|Aspirante|Music|Autopista Norte al oriente|Haryana|karnal|D:\Users\ASUS\IdeaProjects\RetoAutomatizacionDemoQAWebScreenplay\src\test\resources\data\JCALDERONG3X4.jpg|