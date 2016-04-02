# Bridge

TO-DO:

- Add JUnit tests
- Implement basic strategy for bidding
- Implement basic strategy for playing
- Read and Write bridge game data

3/25/16
Impelemented bidding and playing.

3/24/16
Adding rudimentary rules for opening bid 1 NT. Created a two-way linking between players and hands. Fixed comparison of Bids, which is calculated first by suit (No Trump > Spades > Hearts > Diamonds > Clubs > Pass) and then by rank (Ace....2).

3/23/16

Created HashMaps in Utils.java that map String representation of suits (ie. "King") to int values (ie. 13). Decided that although 1, "1", "Ace" are all the same thing, they have one numerical value - 14, not 1. This makes comparing cards and plays much easier. 
Adjusted handData.java to make balanced hands ints instead of arrays, (ie. 4333 instead of [4, 3, 3, 3]). Fixed a bunch of compilation errors. 
Tested HandAnalysis.
Changed "natural ordering" of suits from 
	(Clubs : 0, Diamonds : 1, Hearts : 2, Spades : 3, No Trump : 4) to
	(Spades : 0, Hearts : 1, Diamonds : 2, Clubs : 3, No Trump : -1)



3/18/16

Card/Pool
--------------------------------------------------------------------------------------------------------------
Should Card extend Pool? A Pool would simply be any set of cards. Reason why the idea came up is that I need a way to represent the combined cards of a player and his/her partner, but simply making the combination a Hand seems kind of disingenous. However, a Hand has 52 spots anyways (4 ArrayLists of size 13 each), so right now Hand seems bloated and a generic structure for holding 52 or less cards.

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