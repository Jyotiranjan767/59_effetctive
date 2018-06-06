score_type = ["Love", "Fifteen", "Thirty", "Forty"]

from random import randint
def tennis_score(player1_points, player2_points):
	if player1_points <= 3 and player2_points <= 3:
		if player1_points == player2_points:
			return "{0}-All".format(score_type[player1_points])
		else:
			return '{0}-{1}'.format(score_type[player1_points], score_type[player2_points])
	if player1_points >=3 and player2_points >=3 and player1_points == player2_points:
		return "Deuce"		
	if player1_points - player2_points == 1 :
		return 'Advantage Player1'
	elif player2_points - player1_points == 1:
		return "Advantage Player2"

	if(player1_points >= 4 or player2_points >= 4 and  
		abs(player1_points - player2_points) >=2):
		
		if ((player2_points - player1_points ) >=2 ):
			return "Win for Player2"
		elif((player1_points - player2_points)>=2):
			return "Win for Player1" 
print(tennis_score(4,13))