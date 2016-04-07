Feature: springXMLsecurity.feature

  Scenario: testing Web MVC Appplication
    Given I am on the start index page
    When I performs operation "get"
    Then I see "This is your 1st Spring MCV Tutorial" in response
