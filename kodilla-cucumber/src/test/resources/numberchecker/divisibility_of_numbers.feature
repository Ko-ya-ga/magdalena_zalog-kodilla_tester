Feature: Divisibility of numbers
  Numbers should be divisible by 3, 5 or both 3 and 5

  Scenario Outline: The number is or isn't divisible by 3, 5 or both 3 and 5
    Given the number is <number>
    When I ask whether it's divisible by one of said factors
    Then I should be told <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 9 | "Fizz" |
      | 15 | "FizzBuzz" |
      | 45 | "FizzBuzz" |
      | 200  | "Buzz" |
      | 80 | "Buzz" |
      | 82 | "None" |
      | 152 | "None" |