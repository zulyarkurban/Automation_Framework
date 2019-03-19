Feature: search OCA book in amazon
  @test
  Scenario: searching a book
    Given user open the Amazon
    When user enter "OCA Book" on searchbox
    Then user can see related info on result

