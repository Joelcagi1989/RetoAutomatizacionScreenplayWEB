# language:es

  Característica: Diligenciar formulario creacion nuevo usuario
    Como tester
    quiero ingresar a la pagina de utest
    para diligenciar los pasos del formulario para creación de un nuevo usuario

  Esquema del escenario: diligenciar formulario
    Dado que tester quiere ingresar a pagina de utest para creacion de usuario
    Cuando diligencia los pasos con los datos
      | primerNombre | apellido | correo | mesN | diaN | anioN | idioma | dispositivoMovil | modelo | sistemaOperativo | contrasena | confirmarContrasena |
      |<primerNombre>|<apellido>|<correo>|<mesN>|<diaN>|<anioN>|<idioma>|<dispositivoMovil>|<modelo>|<sistemaOperativo>|<contrasena>|<confirmarContrasena>|
    Entonces el deberia ver el <mensaje>
  Ejemplos:
    | primerNombre | apellido |correo       | mesN | diaN | anioN | idioma | dispositivoMovil | modelo        | sistemaOperativo | contrasena | confirmarContrasena | mensaje                                                                |
    | John         | Calderon |john1@mail.com| April| 11   | 1989  | Spanish| Xiaomi           | Redmi Note 9S | Android 11       | 60lC4r4c0l | 60lC4r4c0l          | Welcome to the world's largest community of freelance software testers!|