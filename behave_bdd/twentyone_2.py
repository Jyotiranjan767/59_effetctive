class Dealer():

	def __init__(self):

		self.hand = []

	def new_round(self):
		self.hand = [_next_card(), _next_card()]

import random

_cards = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']

def _next_card():
	return random.choice(_cards)

def _hand_total(hand):
	values = [None, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10]
	values_map = {k : v for k, v in zip(_cards, values)}

	total = sum([value_map[card] for card in hand if card != "A"])
	ace_count  = hand.count("A")

	for i in range(ace_count, -1, -1):

		# a lot more yet  to complete 