@Login
Feature: login
  In order to test login to EasyBacklog

  @smokeTest
  Scenario: users should be able to login using valid credentials
    Given I navigate to login page
    When I login as "ceciliachalar" with password "Control123"
    Then I should login to EasyBacklog succesfully

  @smokeTest
  Scenario Outline: : Users should be able to login using valid credentials
    Given I navigate to login page
    When I login as "<User Name>" with password "<Password>"
    Then I should login to EasyBacklog succesfully

  Examples:
    |User Name                        |Password  |
    |cecilia.chalar@fundacion-jala.org|Control123|

  @negativeFunctional
  Scenario Outline: Users should not be able to login using invalid credentials
    Given I navigate to login page
    When I login as "<User Name>" with password "<Password>"
    Then I should not login to EasyBacklog

  Examples:
  |User Name|Password|
  |cecilia|  |
  |cecilia|Control123|
  |ceciliachalar@fundacionjala.org|Control123|

