Feature: Integer Arithmetic Expressions
  This feature provides a range of scenarios corresponding to the
  intended external behaviour of arithmetic expressions on integers.

  # This is just a comment.
  # You can start with a Background: that will be run before executing each scenario.

  Background:
    Given I initialise a calculator

  # Each scenario can be seen as a test that can be executed with JUnit,
  # provided that each of the steps (Given, When, And and Then) are
  # implemented in a Java mapping file (CalculatorSteps.Java)

  Scenario Outline: Different operation between two terms of different types
    Given an operation <o>
    When I provide a first number <val1>
    And I provide a second number <val2>
    Then the operation evaluates to <res>
    Examples:
      | o   | val1       | val2       | res           |
      | '+' | 4          | 5          | 9             |
      | '+' | 4          | 5.5        | 9.5           |
      | '+' | 4          | 2/5        | 4.4           |
      | '+' | 4          | 5.0 + 3.0i | 9.0 + 3.0i    |
      | '+' | 4.5        | 5          | 9.5           |
      | '+' | 4.5        | 5.5        | 10            |
      | '+' | 4.5        | 2/5        | 4.9           |
      | '+' | 4.5        | 5.0 + 3.0i | 9.5 + 3.0i    |
      | '+' | 2/5        | 5          | 5.4           |
      | '+' | 2/5        | 5.5        | 5.9           |
      | '+' | 2/5        | 2/5        | 4/5           |
      | '+' | 2/5        | 5.0 + 3.0i | 5.4 + 3.0i    |
      | '+' | 2.0 + 3.0i | 5          | 7.0 + 3.0i    |
      | '+' | 2.0 + 3.0i | 5.5        | 7.5 + 3.0i    |
      | '+' | 2.0 + 3.0i | 2/5        | 2.4 + 3.0i    |
      | '+' | 2.0 + 3.0i | 5.0 + 3.0i | 7.0 + 6.0i    |
      | '-' | 4          | 5          | -1            |
      | '-' | 4          | 5.5        | -1.5          |
      | '-' | 4          | 2/5        | 3.6           |
      | '-' | 4          | 5.0 + 3.0i | -1.0 + -3.0i  |
      | '-' | 4.5        | 5          | -0.5          |
      | '-' | 4.5        | 5.5        | -1            |
      | '-' | 4.5        | 2/5        | 4.1           |
      | '-' | 4.5        | 5.0 + 3.0i | -0.5 + -3.0i  |
      | '-' | 2/5        | 5          | -4.6          |
      | '-' | 2/5        | 5.5        | -5.1          |
      | '-' | 2/5        | 2/5        | 0             |
      | '-' | 2/5        | 5.0 + 3.0i | -4.6 + -3.0i  |
      | '-' | 2.0 + 3.0i | 5          | -3.0 + 3.0i   |
      | '-' | 2.0 + 3.0i | 5.5        | -3.5 + 3.0i   |
      | '-' | 2.0 + 3.0i | 2/5        | 1.6 + 3.0i    |
      | '-' | 2.0 + 3.0i | 5.0 + 3.0i | -3            |
      | '*' | 4          | 5          | 20            |
      | '*' | 4          | 5.5        | 22            |
      | '*' | 4          | 2/5        | 1.6           |
      | '*' | 4          | 5.0 + 3.0i | 20.0 + 12.0i  |
      | '*' | 4.5        | 5          | 22.5          |
      | '*' | 4.5        | 5.5        | 24.75         |
      | '*' | 4.5        | 2/5        | 1.8           |
      | '*' | 4.5        | 5.0 + 3.0i | 22.5 + 13.5i  |
      | '*' | 2/5        | 5          | 2             |
      | '*' | 2/5        | 5.5        | 2.2           |
      | '*' | 2/5        | 2/5        | 0.16          |
      | '*' | 2/5        | 5.0 + 3.0i | 2.0 + 1.2i    |
      | '*' | 2.0 + 3.0i | 5          | 10.0 + 15.0i  |
      | '*' | 2.0 + 3.0i | 5.5        | 11.0 + 16.5i  |
      | '*' | 2.0 + 3.0i | 2/5        | 0.8 + 1.2i    |
      | '*' | 2.0 + 3.0i | 5.0 + 3.0i | 1.0 + 21.0i   |
      | '/' | 4          | 5          | 0.8           |
      | '/' | 4          | 0.5        | 8             |
      | '/' | 4          | 2/5        | 10            |
      | '/' | 4          | 2.0 + 4.0i | 0.4 + -0.8i   |
      | '/' | 4.5        | 5          | 0.9           |
      | '/' | 4.5        | 5.5        | 1             |
      | '/' | 4.5        | 2/5        | 11.25         |
      | '/' | 4.5        | 2.5 + 0.0i | 1.8           |
      | '/' | 2/5        | 5          | 0.08          |
      | '/' | 1/5        | 2.5        | 0.2           |
      | '/' | 2/5        | 4/5        | 0.5           |
      | '/' | 1/4        | 4.0 + 2.0i | 0.05+ -0.025i |
      | '/' | 2.0 + 3.0i | 5          | 0.4 + 0.6i    |
      | '/' | 2.0 + 3.0i | 5.5        | 4.0 + 2.0i    |
      | '/' | 2.0 + 3.0i | 2/5        | 5.0 + 7.5i    |
      | '/' | 8.0 + 4.0i | 4.0 + 2.0i | 2             |

  Scenario: Printing the sum of two integer numbers
    Given the sum of two numbers 8 and 6
    Then its INFIX notation is ( 8 + 6 )
    And its PREFIX notation is + (8, 6)
    And its POSTFIX notation is (8, 6) +

  # This is an example of a scenario in which we provide a list of numbers as input.
  # (In fact, this is not entirely true, since what is given as input is a table of
  # strings. In this case, the table is of dimension 1 * 3 (1 line and three columns).
  Scenario: Evaluation arithmetic operations over a list of integer numbers
    Given the following list of integer numbers
      | 8 | 2 | 2 |
    Then the sum is 12
    And the product is 32
    And the difference is 4
    And the quotient is 2

  Scenario Outline: Evaluating arithmetic operations with two integer parameters
    Given an operation <op>
    When I provide a first number <n1>
    And I provide a second number <n2>
    Then the operation evaluates to <result>

    Examples:
      | op  |n1|n2|result|
      | "+" | 4| 5|     9|
      | "-" | 8| 5|     3|
      | "*" | 7| 2|    14|
      | "/" | 6| 2|     3|

  Scenario Outline: Checks the formatting of an equation between two integers parameters
    Given an operation <op>
    When I provide a first number <n1>
    When I provide a second number <n2>
    And I provide the notation <notation> to operator 0
    Then the operation is written like <result>

    Examples:
      | op  |n1|n2|notation|   result|
      | "+" | 4| 5|  PREFIX|   + (4, 5)|
      | "-" | 4| 5|  PREFIX|   - (4, 5)|
      | "*" | 4| 5|  PREFIX|   * (4, 5)|
      | "/" | 4| 5|  PREFIX|   / (4, 5)|
      | "+" | 4| 5|  POSTFIX| (4, 5) + |
      | "-" | 4| 5|  POSTFIX| (4, 5) - |
      | "*" | 4| 5|  POSTFIX| (4, 5) * |
      | "/" | 4| 5|  POSTFIX| (4, 5) /|
      | "+" | 4| 5|  INFIX|   ( 4 + 5 )|
      | "-" | 4| 5|  INFIX|   ( 4 - 5 )|
      | "*" | 4| 5|  INFIX|   ( 4 * 5 )|
      | "/" | 4| 5|  INFIX|   ( 4 / 5 )|
      
  Scenario Outline: Checks the formatting of an equation composed of multiple equations
    Given an operation <op_0>

    When I provide another integer operation <op_1> to operator 0
    And I provide a first number <arg_10> to operator 1
    And I provide a second number <arg_11> to operator 1
    And I provide a third number <arg_12> to operator 1
    And I provide the notation <not_1> to operator 1

    When I provide another integer operation <op_2> to operator 0
    And I provide a first number <arg_20> to operator 2
    And I provide a second number <arg_21> to operator 2
    And I provide the notation <not_2> to operator 2

    When I provide a first number <arg_0> to operator 0
    And I provide the notation INFIX to operator 0
    Then the operation is written like <result>

    Examples:
      | op_0 | arg_0 | op_1 | not_1  | arg_10 | arg_11 | arg_12 | op_2 | not_2  | arg_20 | arg_21 | result |
      | "/"  | 7     | "+"  | PREFIX | 3      |4       |5       | "-"  | PREFIX | 5      | 4      | ( ( 3 + 4 + 5 ) / ( 5 - 4 ) / 7 ) |
    # / (+ (3, 4, 5), - (5, 4), 7)
    # ( ( 3 + 4 + 5 ) / ( 5 - 4 ) / 7 )
    # ((3, 4, 5) +, (5, 4) -, 7) /

  # Create new "given an operation ..."

  Scenario Outline: Providing an expression as a string
    Given I initialise a calculator
    When I provide an expression as a string <str>
    Then the expression evaluates to <res>

    Examples:
      |str     |res|
      |"0 + 0" |0  |
      |"28 + 10" |38  |
      |"28 - 10" |18  |
      |"30 / 10" |3  |
      |"30 * 10" |300 |
      |"(5 + 2 * 10 - 5) / 2" | 10 |
      |"+ (30 10)" | 40 |
      |"- (30, 10)" | 20 |
      |"/ (30 10)" | 3 |
      |"* (30, 10)" | 300 |
      |"+ (2 3 1)" | 6 |
      |"/ (- (+(5, *(2, 10)), 5) ,2)" | 10 |
      |"(30, 10) +" | 40 |
      |"(30 10) -" | 20 |
      |"(30, 10) /" | 3 |
      |"(30 10) *" | 300 |
      |"(3 2 1) -" | 0 |
      |"(((5, (2, 10)*) +, 5) -,2) /" | 10 |
