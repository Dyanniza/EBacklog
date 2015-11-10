@sprint
Feature: sprint

Scenario: the sprint should be change to complete state when all stories are completed

Given I have project 'Automation' added
	And two stories that are already in the backlog unassigned stories
When I create a new sprint "sprint 1"
Then the story unassigned belongs to the "Automation" project
	And I assigned the story to "sprint 1"
When I mark the story to complete state
Then the button "Mark sprint as complete" are enabled to click
	And the sprint is complete
Then a message "Sprint 1 completed" is displayed
    And a the Sprint Completed Page should be displayed


//para  data driven    osea  se corre el test case porlas veces  q contanga example
Scenario Outline:..........
Given I ...........
When I..........  login to web as: <fila> with password <value>
Then I .......... se usa con un "should"
    and....

Example
fila|value
pass|
user|control123
Implementacion lineal valores separados por  comas "xx,yy,zz" , el test  se ejecuta una ves  en el escenario


//backgroung  se ejecuta antes de cada  test como un before each
Background:
    Login

//hooks
metodo after
con tag
q se ejecutara despues  de cada  tag
