Feature: Google Search

  Scenario: Search for Cucumber
    Given I am on the Google home page
    When I search for "Cucumber BDD"
    Then the result page title contains "Cucumber"
