Feature: Test
  Scenario: test
    Given I test
    When test
    Then I should login to EasyBacklog succesfully

  @smokeTest
  Scenario: user should be able to login using valid credentials
    Given I navigate to login page
    When I login as "ceciliachalar" with password "Contro123"
    Then I should login to EasyBacklog succesfully

  @smokeTest
  Scenario: Users should be able to login using valid credentials
    Given I navigate to login page <url>
    When I login as "<User Name>" with password "<Password>"
    Then I should login to EasyBacklog succesfully

  @smokeTest
  Scenario Outline: : Users should be able to login using valid credentials
    Given I navigate to login page <url>
    When I login as "<User Name>" with password "<Password>"
    Then I should login to EasyBacklog succesfully

  Examples:
    |url                                  |User Name                        |Password  |
    |https://easybacklog.com/users/sign_in|cecilia.chalar@fundacion-jala.org|Control123|

