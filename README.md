# Bridge

TO-DO:

- 
- Implement basic strategy for bidding
- Implement basic strategy for playing
- Read and Write bridge game data

3/18/16

Card/Pool
--------------------------------------------------------------------------------------------------------------
Design philosophy - should Card extend Pool? A Pool would simply be any set of cards. Reason why the idea came up is that I need a way to represent the combined cards of a player and his/her partner, but simply making the combination a Hand seems kind of disingenous. However, a Hand has 52 spots anyways (4 ArrayLists of size 13 each), so right now Hand seems bloated and a generic structure for holding 52 or less cards.

Make hand leaner and more efficient?

Whatever the case, there does not seem to be a need for a separate Deck object - that can be represented using a Hand or a Pool.

Game
--------------------------------------------------------------------------------------------------------------
Hierarchy of a game:
- Players join game
- Hands are dealt
- Bidding Round
- Playing round
	- Trick 1
	- Trick 2
	- ......




3/17/16
Calculating the point value of each card as it is being adding to the hand would be more efficient. However, there are multiple ways of calculating the point value of a hand and it makes more sense to calculate a hand using a particular method after all the cards are dealt.