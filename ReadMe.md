# Tic Tac Toe 
An interactive 4×4 Tic-Tac-Toe game for a person to play against a computer. The game consists of a 4×4 grid. To win, a player must place 4 of his/her symbols on 4 squares that line up vertically, horizontally or diagonally (45 or 135 degrees.)

Algorithm used – Alpha beta pruning
Programming Language used - JAVA

## Details

1. The implementation of the game is JAVA.
2. Project has 2 classes – State.java andTicTacToeAlphaBeta.java
3. Although code has descriptive variables and is self-explanatory ,inline comments are there for explanation.

## GAMEPLAY DETAILS

1. Constraints used in Algorithm –
    - Depth cutoff limit =6
    - Time cutoff = 10 seconds
2. Levels – 3 levels: Easy, Medium, Hard
    - Easy – Generate random computer moves. Human player will win more often
    - Medium – Used evaluation function :     
	 `Eval(s) = 3(O1 + O2 +O3) – 2(X1+X2+X3)`     
	  Where Xn is the number of rows, columns, or diagonals with exactly n X 's and no O’s. Similarly, On is the number of rows, columns, or diagonals with just n O’s    
	  This will give user the time to make the game draw rather than winning at a point or user may win fewer times.
    - Hard – Used Evaluation function :    
     `Eval(s)=6X3 +3X2(s)+X1(s)−(6O3 +3O2(s)+O1(s))`    
	  Playing on this level will result in more draws and computer wins. User may win very rarely

## How to Play

1. Compile and run the source code in command line or IDE having java in system.
2. UI will be shown where you play the game.
3. The user is first needed to select which level of difficulty the user wants to play.
4. Then user selects whether he wants to play the game first or the computer
After every turn, game statistics are displayed on console that contain :
(1) whether cutoff occurred
(2) maximum depth reached
(3) total number of nodes generated (including root node)
(4) number of times pruning occurred within the MAX-VALUE function
(5) number of times pruning occurred within the MIN-VALUE function.
> Note – If you run JAR file directly , statistics will not be displayed

