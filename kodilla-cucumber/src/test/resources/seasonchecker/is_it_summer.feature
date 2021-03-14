Feature: Is it Summer?
  Everybody likes Summer

  Scenario Outline: Today is or isn't summer
    Given today is <day>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
      | day | answer |
      | the last day of December | "Nope" |
      | the second day of January | "Nope" |
      | the 10th day of February | "Nope" |
      | the 20th day of June | "Nope" |
      | the 5th day of May   | "Nope" |
      | the 24th day of September | "Nope" |
      | the first day of August | "Yes! Summer!" |
      | the 21st day of June | "Yes! Summer!" |
      | the 23rd day of September | "Yes! Summer!" |