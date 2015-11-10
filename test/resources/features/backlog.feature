@backlog
Feature: backlog

  Scenario: Adding stories to a new backlog
    Given I have a empty backlog "backlog" recently created
      And two new themes are added "Features" and "TestCases"
    When I add a new story in "Features" theme
      And I add a new story in "TestCases"" theme
    Then the stories should displayed in the backlog
    And the stories should assorted by theme


