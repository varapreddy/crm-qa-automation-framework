Feature: Cucumber TestNG Demo Feature

  @demo
   @smoke
    @regression
     @smokeSomeField
  Scenario: Amazon search
    Given I am on Aamazon home page
    And I search for <iphone charger>
    Then Search result should be displayed
@demo @test
  Scenario: Amazon search 2
    Given I am on amazon home page
    And I search for <lamp>
    Then Search result should be displayed
