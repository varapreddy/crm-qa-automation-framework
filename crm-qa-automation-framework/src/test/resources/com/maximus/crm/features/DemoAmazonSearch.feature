Feature: Cucumber TestNG Demo Feature
  Background:   Given I am on amazon home page
  @demo
  Scenario: Amazon search
     And I search for <iphone charger>
    Then Search result should be displayed
    
   Scenario: SecomOne
   
   And do something
