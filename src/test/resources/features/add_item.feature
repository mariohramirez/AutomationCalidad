#author: mariohramirez
#date: 14/11/2023
#language: en

  Feature: Añadir un articulo al carro de compras de Amazon
    Como cliente de Amazon quiero buscar un articulo en la pagina de Amazon
    seleccionarlo y añadirlo al carrito de compras

  @ItemAdded
  Scenario: Añadir un articulo al carrito de compras
    Given que me encuentro en la pagina principal de Amazon
    When busque un articulo en la barra de busqueda
    And selecione el primer resultado de la busqueda
    And agrega al carrito de compras
    Then puedo ver el icono de carros de compras actualizado con 1 articulo