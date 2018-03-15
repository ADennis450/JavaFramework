@run
Feature: NavigateToGoogle

  Scenario: Navigate To Google

    Given Navigate to "https://www.google.com"
    And I search for "Sogeti"
    And I press enter in the search field
    And I click on "Sogeti"
    Then I should be on the "asdfasdfasdf" page