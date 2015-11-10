@story
Feature: story

  Scenario: assigned stories to a empty sprint
    Given I have two stories added in the dashboard
    When I create a new sprint
    Then the new sprint should be empty
      And the backlog should displayed at right to the Sprint containing all unassigned stories
    When I move a story from backlog to the sprint panel
    Then sprint panel should contain the story assigned


@story
Feature: stories in sprint

  Scenario: The stories assigned in a sprint should have state
    Given I have two unassigned stories added in the dash board
      And the stories has 3 points each one
    When I assigned the stories in a sprint
    Then the sprint should contain the stories
      And the stories should be in "To do" state
      And the point
    And the backlog should displayed at right to the Sprint containing all unassigned stories
    When I move a story from backlog to the sprint panel
    Then sprint panel should contain the story assigned


