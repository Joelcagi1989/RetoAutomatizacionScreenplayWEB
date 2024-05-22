# language:es

  Característica: Diligenciar formulario creacion/eliminacion nuevo usuario
    Como tester
    quiero ingresar a la pagina de demoqa
    para diligenciar los pasos del formulario para creación de un nuevo usuario, gestión de opciones y posterior eliminacion de este

  Esquema del escenario: gestionar caso 1
    Dado que tester quiere ingresar a pagina de demoqa para creacion de usuario
    Cuando diligencia los datos para la creación de un usuario
      | firstName  | lastName   | userName   | password   |
      | <firstName>| <lastName> | <userName> | <password> |
    Y realiza el logueo
      | userName   | password   |
      | <userName> | <password> |
    Y elimina la cuenta
    Y realiza el logueo
      | userName   | password   |
      | <userName> | <password> |
    Entonces el deberia ver el <mensaje>
  Ejemplos:
    | firstName | lastName |userName | password | mensaje |
    ##@externaldata@.src/test/resources/data/DataCaso1.xlsx@Datos@1
  |Test01 |Test01 |test01 |Test2023* |Invalid username or password!|