Feature: 2plus2

  Scenario Outline: output of number plus number
    Given I open the "<browser>"
    When i go the "<webPage>"
    And Addition "<numberOne>" and "<numberTwo>"
    Then I get the "<result>"

    Examples:
      | browser | webPage                                   | numberOne | numberTwo | result |
      | chrome  | https://www.desmos.com/scientific?lang=es | 1         | 2         | 3      |