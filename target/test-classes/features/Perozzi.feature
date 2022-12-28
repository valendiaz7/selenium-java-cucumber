Feature: Probar pagina de Perozzi

  @Perozzi
  Scenario Outline: Validar opciones de pago
    Given Ingreso a la pagina principal
    When Busco por <Producto>
    And Clickeo sobre el primer item
    Then Valido cuotas de pago

    Examples:
      |Producto|
      |Lavarropas aurora|