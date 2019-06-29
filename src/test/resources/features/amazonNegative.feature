Feature: login with negative credentials

  @negative
  Scenario: login to amazon
    Given user open the Amazon
    When user open the login page
    Then user enter "test@gmail.com" and "123456"
    Then user should be login to amazon
