#author: mariohramirez
#date: 14/11/2023
#language: en
  Feature: Consultar la pagina principal de la U de A
    Como estudiante de la U de A necesito buscar el homepage de la U
    en google para ingresar al sitio oficial

  @PaginaEncontrada
  Scenario: : Buscar la pagna oficial de la U de A en el motor de busqueda
    Given que me encuentro en la pagina principal de gooogle
    When escriba la palabra U de A
    Then puedo ver el link de la pagina oficial