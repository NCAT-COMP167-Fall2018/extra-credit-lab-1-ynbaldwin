# Fall 2018 Extra Credit Lab 1 – Random Connect Four

![ConnectFour Image](https://github.com/NCATCS/images/blob/master/connectfour.png)

## Introduction

Connect Four is a turn based game where two players alternate dropping chips into a slotted grid.   One player will have red chips; the other player will have yellow chips.   If a player gets four of his chips consecutively across a row, column or diagonal then they win. Our version of the game will have two computer players placing their chips in random columns until there is a winner.

## Implementation

You will represent your Connect Four Game board as a 6x7 array of characters.  Each element in the array contains either a ‘b’ (blank),‘y’ (yellow) or ‘r’ (red).  

### Level 1 (5pts)

* Write a method (createBoard) with one character parameter that returns a 6x7 2D array that has all elements intialized to the character parameter.  For example, if you passed the character ‘y’ to createBaord, it would return a reference to a 6x7 array with every element containing a ‘y’ character.
* Write a method printBoard that outputs the contents of the board to the console.  Each row of the board should be on a separate line in the output.  So, you should  output 6 rows with each row displaying 7 characters.
*	Add code in your main to test these two methods.  Let the TA see your completed level.

### Level 2 (5pts)

* Write a method (takeTurn) that contains one character parameter and a void return type.  The method will generate a random column value (0..6) representing the 7 columns of the board and replace the character at the highest row number in the generated column that currently contains a blank character.  For example, when the game first starts, all the elements contain a blank.  If the current turn is yellow, then takeTurn will be called with a parameter of ‘y’.  If the random value that is generated in takeTurn is a 3, then the value in column 3 of row 5 (the bottom row) will be replaced with a ‘y’ character.  This simulates the action of dropping a yellow chip into a column containing no chips.  If that same column is chosen again on another turn, the next location used in that column would be location [4, 3].  If the selected row has no more blank slots then have the method to chose another row until an available column is choosen.
*	Write a method playGame that contains the game board as the only parameter and a character return value type.  The method returns an ‘r’ (red wins), ‘y’ (yellow wins), ‘t’ (tie game).  For this level, always return a ‘t’.  Write a while-loop that iterates 10 times.  Each loop iteration should drop one chip into the board (call takeTurn), print out the board, toggle the turn (so a chip of the other color is dropped on the next iteration).   You will also need a variable to keep  track of whether it is the Red player’s turn or the Yellow player’s turn.
*	Add code to your main that creates a game board with all blanks and then calls playGame. Let the TA see your completed level.

### Level 3 (7pts)

*	Write a method named checkRows that has the game board and a character as parameters.  The method returns true if 4 consecutive positions on any row contain the character parameter.  Otherwise, it returns false.
*	Write a method named checkCols that has the game board and a character as parameters.  The method returns true if 4 consecutive positions on in any column contain the character parameter. Otherwise, it returns false.
*	Change the method playGame to iterate until there is a winner or the board is completely filled with no winner (tie game).  The loop should call takeTurn then check to see if there is a winner along a row or a column.  If not, continue in the loop.  If so, return the winning color. Let the TA see your completed level.

### Level 4 (3pts)

*	Write a method (checkdiagonals) that checks the diagonals for a winner.  The parameters are the same as the other methods in Level 3.
*	Modify the playGame method to also check the diagonals for a winner. Let the TA see your completed level.
