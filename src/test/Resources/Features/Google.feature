@run
Feature: NavigateToGoogle

  Background: Navigate To Sogeti Home Page

    Given Navigate to "https://www.google.com"
    And I search for "Sogeti"
    And I press enter in the search field
    And I click on "Sogeti"
    Then I should be on the "Sogeti" page

  Scenario: Search for stuff
    Given I click on the text "Search"