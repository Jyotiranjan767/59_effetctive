from behave import *

@given("I have entered {number_1:d} to the calculator")
def first_argument(context, number_1):
    context.num_1 = number_1
    print("first argument is ", number_1)
@given("I have again entered {number_2:d} to the calculator")
def second_argument(context, number_2):
    context.num_2 = number_2
    print("second argument is ", number_2)
@when("I press add")
def add(context):
    context.result = context.num_1 + context.num_2
    print(context.result)
@then("sum should be {result:d}")
def compare(context, result):
    assert result == context.result