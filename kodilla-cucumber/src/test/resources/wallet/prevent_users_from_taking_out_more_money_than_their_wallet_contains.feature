Feature: Prevent users from taking out more money than their wallet contains
  Scenario: User tries to take out more money than their balance
    Given there is $100 in my wallet
    When I withdraw $200
    Then nothing should be dispensed
    And the $100 should remain in the wallet