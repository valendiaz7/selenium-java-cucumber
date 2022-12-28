Feature: Probando busqueda en la home page de movistar


  @Maximus
  Scenario Outline: Busco iphone 14 en el input de busqueda
    Given Ingreso a la home page
    When Busco por <Productos>
    And Clickeo en el boton de busqueda
    Then Valido que no exista el criterio buscado

    Examples:
      |Productos          |
      |Iphone 14         |
