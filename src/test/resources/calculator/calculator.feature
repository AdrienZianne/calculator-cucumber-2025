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

  Scenario: Adding two integer numbers
    Given an integer operation '+'
    When I provide a first number 4
    And I provide a second number 5
    Then the operation evaluates to 9

  Scenario: Subtracting two integer numbers
    Given an integer operation '-'
    When I provide a first number 7
    And I provide a second number 5
    Then the operation evaluates to 2

  Scenario: Multiplying two integer numbers
    Given an integer operation '*'
    When I provide a first number 7
    And I provide a second number 5
    Then the operation evaluates to 35

  Scenario: Dividing two integer numbers
    Given an integer operation '/'
    When I provide a first number 7
    And I provide a second number 5
    Then the operation evaluates to 1

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

  # A scenario outline (or template) is a scenario that is parameterised
  # with different values. The outline comes with a set of examples.
  # The scenario will be executed with each of the provided inputs.
  Scenario Outline: Adding two integer numbers
    Given an integer operation '+'
    When I provide a first number <n1>
    And I provide a second number <n2>
    Then the operation evaluates to <result>

    Examples:
      |n1|n2|result|
      |4|5|9|
      |5|3|8|

  Scenario Outline: Dividing two integer numbers
    Given an integer operation '/'
    When I provide a first number <n1>
    And I provide a second number <n2>
    Then the operation evaluates to <result>

    Examples:
      |n1|n2|result|
      |35|5|7|
      |7|5|1|
      |5|7|0|

  Scenario Outline: Evaluating arithmetic operations with two integer parameters
    Given an integer operation <op>
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
    Given an integer operation <op>
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
    Given an integer operation <op_0>

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

  Scenario Outline: Dividing a number by 0
    Given an integer operation '/'
    When I provide a first number <n>
    When I provide a second number <n2>
    Then the operation evaluates to <result>

    Examples:
      |n|n2|result|
      |0|0|"max"|
      |5|0|"max"|
      |-5|0|"min"|


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
