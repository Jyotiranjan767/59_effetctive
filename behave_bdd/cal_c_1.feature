
Feature:calc_1


  Scenario:add two numbers
    Given I have entered 24 to the calculator
    Given  I have again entered 27 to the calculator
    When I press add
    Then sum should be 51

    Scenario Outline: add any two numbers
      Given I have entered <number1> to the calculator
      Given  I have again entered <number2> to the calculator
      When I press add
      Then sum should be <result1>

      Examples:

        |number1| |number2| |result1|
        |23|      |34|       |57|
        |24|      |53|       |77|
        |2|       |1|        |3|
        |2|       |25|       |27|