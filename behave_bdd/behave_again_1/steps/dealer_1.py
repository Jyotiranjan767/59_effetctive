from behave import given, then, when
import sys 
sys.path.append('C:\\Users\\luckie\\Desktop\python\\behave_bdd')
from twentyone_2 import *
print(sys.path)
@given('a dealer')
def step_impl(context):
	context.dealer = Dealer()

@when("the round starts")
def step_impl(context):
	pass

@then("the dealer gives itself two cards")
def step_impl(context):
	pass

@given("a {hand}")
def step_impl(context, hand):
	context.dealer = Dealer()
	context.dealer.hand = hand.split(',')
@when('the dealer sums the cards')
def step_impl(context):
	pass

@then('the {total} is correct')
def step_impl(context):
	pass