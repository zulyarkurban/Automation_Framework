Feature: TestAuth Login test with Scenario Outline

  @login
  Scenario Outline: login to TestAuth website with credentials
    Given user open the Test Auth website
    When user enter <username> and <password>
    Then user should be login to website

    Examples:
      | username        | password |
      | mobileteknoloji | 123456   |
      | mobileteknoloji | test1    |
      | mobtek          | 123456   |
