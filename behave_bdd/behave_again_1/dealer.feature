Feature:
	the dealer for game of 21

Scenario:
	Deal initial cards 

	Given a dealer
	When the round starts 
	Then the dealer gives itself two cards

Scenario Outline: get hand total 
	
	Given a <hand>
	When the dealer sums the cards
	Then the <total> is correct

	Examples: hands 

		|hand 	|total|
		|5,7	|12	  |
		|5,Q	|15	  |
		|Q,Q,	|21	  |
		|Q,A 	|21	  |
		|A,A,A 	|13	  |

