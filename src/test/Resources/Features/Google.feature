@run
Feature: Google Sogeti

  Background: Navigate To Sogeti Home Page

    Given I navigate to "https://www.google.com"
    And I search for "Sogeti"
    And I press enter in the search field
    And I click on "Sogeti"
    Then I should be on the "Sogeti" page

  Scenario: Search for stuff
    Given I do a sogeti search for "Techonology"
    And I wait 10 seconds