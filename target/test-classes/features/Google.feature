Feature: Probar la busqueda en Google

  @Google
  Scenario: Busco algo en Google
    Given I am on the google search page
    When I enter a search criteria
    And click on the search button
    Then The results match the criteria


