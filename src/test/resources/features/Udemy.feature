Feature: Probamos la plataforma de udemy

  @Udemy
  Scenario: Buscamos cursos aplicando filtros
    Given Ingresamos a la home de Udemy
    When Ingreso un criterio de busqueda
    And Clickeo en el boton search
    And Aplico filtros ordenar por e idioma
    Then Valido la cantidad de cursos disponibles
