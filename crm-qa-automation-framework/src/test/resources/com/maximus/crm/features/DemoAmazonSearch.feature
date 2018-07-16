Feature: Cucumber TestNG Demo Feature

  @demo
  Scenario: Amazon search
    Given I am on amazon home page
    And I search for <iphone charger>
    Then Search result should be displayed

  Scenario: SecomOne
    And do something
