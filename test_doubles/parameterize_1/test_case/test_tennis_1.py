import unittest
import sys
sys.path.append("F:\\python_pro\\unit_test_emily_beache\\parameterize_1")
from main.tennis_1 import tennis_score

test_case_data = {

	"even_scores" : [
							("Love-All", 0, 0),
							("Fifteen-All", 1, 1),
							("Thirty-All", 2, 2), 
							("Forty-All", 3, 3)
					],

	"early_games_with_uneven_scores"	: [

							("Love-All", 0, 0),
							("Fifteen-All", 1, 1),
							("Thirty-All", 2, 2),
							("Forty-All", 3, 3),
							("Fifteen-Love", 1, 0),
							("Fifteen-Thirty", 1, 2),
							("Fifteen-Forty", 1, 3),
							("Thirty-Love", 2, 0),
							("Thirty-Fifteen", 2, 1),
							("Thirty-Forty", 2, 3),
							("Forty-Love", 3, 0),
							("Forty-Fifteen", 3, 1),
							("Forty-Thirty", 3, 2)
						],
	"endgame_with_uneven_scores"	:	[
							("Advantage Player1", 4, 3),
							("Advantage Player2", 5, 6),
							("Advantage Player1", 14,13)
		],
	"endgame_with_even_scores"		:	[
							("Deuce", 3, 3),
							("Deuce", 4, 4),
							("Deuce", 14, 14),
	],
	"there_is_a_winner"		:	[
							("Win for Player1", 4, 0),
							("Win for Player2", 2, 4),
							("Win for Player1", 6, 4)
	],
	
}

# monkey patching
def tennis_test_template(*args):
	def foo(self):
		self.assert_tennis_score(*args)
	return foo

class TennisTest(unittest.TestCase):
	# here same functionality is tested by several test methods 

	# def test_even_scores_zero_points(self):
	# 	self.assertEqual("Love-All", tennis_score(0,0))

	# def test_even_scores_one_point(self):
	# 	self.assertEqual("Fifteen-All", tennis_score(2,1))

	# def test_even_scores_two_points(self):
	# 	self.assertEqual("Thirty-All", tennis_score(2,2))

	# here we make it to one test mehod

	# def test_even_scores(self):
	# 	self.assert_tennis_score("Love-All", 0, 0)
	# 	self.assert_tennis_score("Fifteen-All", 1, 1)
	# 	self.assert_tennis_score("Thirty-All", 2, 2)
	# 	self.assert_tennis_score("Forty-All", 3, 3)

	# def test_uneven_scores(self):
	# 	self.assert_tennis_score("Love-Fifteen", 0, 1)
	# 	self.assert_tennis_score("Love-Thirty", 0, 2)
	# 	self.assert_tennis_score("Love-Forty", 0, 3)

	# 	self.assert_tennis_score("Fifteen-Love", 1, 0)
	# 	self.assert_tennis_score("Fifteen-Thirty", 1, 2)
	# 	self.assert_tennis_score("Fifteen-Forty", 1, 3)

	# 	self.assert_tennis_score("Thirty-Love", 2, 0)
	# 	self.assert_tennis_score("Thirty-Fifteen", 2, 1)
	# 	self.assert_tennis_score("Thirty-Forty", 2, 3)
		
	# 	self.assert_tennis_score("Forty-Love", 3, 0)
	# 	self.assert_tennis_score("Forty-Fifteen", 3, 1)
	# 	self.assert_tennis_score("Forty-Thirty", 3, 2)



	def assert_tennis_score(self, expected_score, player1_points, player2_points):
		self.assertEqual(expected_score, tennis_score(player1_points, player2_points))

# this is called "monkey patching "
for behaviour, test_cases in test_case_data.items():
	for tennis_test_case_data in test_cases:
		expected_score, player1_points, player2_points = tennis_test_case_data
		test_name = "test_{0}-{1}-{2}".format(behaviour, player1_points, player2_points)
		tennis_test_case = tennis_test_template(*tennis_test_case_data)
		setattr(TennisTest, test_name, tennis_test_case)
