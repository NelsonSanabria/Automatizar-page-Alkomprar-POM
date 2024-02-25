#language: es

Característica: Registro de usuario
  Yo como usuario quiero registrarme en la pagina de alkomprar
  para tener una cuenta activa.

  @RegistroExitoso
  Esquema del escenario: Registro de usuario exitoso
    Dado que el usuario abre la pagina de alkomprar
    Y pulsa el boton de mi cuenta
    Cuando el usuario ingresa la informacion de registro
      | Correo   | Nombre   | Apellido   | Telefono   |
      | <correo> | <nombre> | <apellido> | <telefono> |
    Entonces  verá el panel de perfil de usuario
    Ejemplos:
      | correo                       | nombre | apellido | telefono   |
      | alt.ru-69hzkxw17@yopmail.com | Juan   | Naranjo  | 3203003030 |