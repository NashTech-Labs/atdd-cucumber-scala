Feature: Multiplication 
  In order to avoid making mistakes
  As an accountant
  I want to multiply numbers

  Scenario: Multiply two variables
    Given a variable x with value 3
    And a variable y with value 4
    When I multiply x * y
    Then I get 12
  Scenario: Multiply two variables
    Given a variable x with value 3
    And a variable y with value 3
    When I multiply x * y
    Then I get 9  
  Scenario Outline: Multiply two variables
    Given a variable x with value <x_1>
    And a variable y with value <y_1>	
    When I multiply x <op> y
    Then I get <result>
    Examples:
      | x_1 | y_1 | op | result |
      | 20  | 30  | *  | 600    |
      | 30  | 30  | *  | 900    |
      | 40  | 30  | *  | 1200   |
      | 4   | 20  | *  | 80   |
      