Feature: Login Testing

  @positive
  Scenario: login to TestAuth website with positive credentials
    Given user open the Test Auth website
    When user enter "mobileteknoloji" and "123456"
    Then user should be login to website


#
#  @negative
#  Scenario: login to Test Auth website with negative credentials
#    Given user open the Test Auth website
#    When user enter "mobileteknoloji" and "11111"
#    Then user should be login to website



  @login
  Scenario Outline: login to TestAuth website with credentials
    Given user open the Test Auth website
    When user enter "<username>" and "<password>"
    Then user should be login to website

    Examples:
      | username        | password |
      | mobileteknoloji | 123456   |
      | mobileteknoloji | test1    |
      | mobtek          | 123456   |
