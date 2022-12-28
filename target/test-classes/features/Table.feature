Feature: Probar tabla

    Scenario: As a Test Engineer, I want to retrieve the value of an static table.
      Given I navigate to the static table
      Then I can return the value I wanted


 Scenario: As a Test Engineer, I want to retrieve the value of an static table is displayed.
   Given I navigate to the static table
   Then I can validate the table is displayed

  @List
    Scenario Outline: As a Test Engineer, I want to validate that a text is present inside the list.
      Given I navigate to the list page
      When I search <state> in the list
      Then I can find <city> in the list

    Examples:
      |state      |city               |
      |Washington |Seattle, Washington|
      |Chicago    |Chicago, Illinois  |
