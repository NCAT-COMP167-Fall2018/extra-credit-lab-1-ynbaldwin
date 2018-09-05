/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Random;

/**
 *
 * @author kiaka
 */
public class ConnectFour {
    private static char[][] gameBoard;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         gameBoard = createBoard('b');
         printBoard();
         playGame(gameBoard);
         printBoard();
         
         
         
         }
    private static char[][] createBoard( char startingCharacter){
            char [][] output = new char [6][7];
        for(int i = 0; i < output.length; i++){
                for( int j = 0; j < output[i].length; j++){
                     output[i][j] = startingCharacter;
                }
            }
        return output;
        }
    private static void printBoard(){
        
            for(int i = 0; i < gameBoard.length; i++){
                for( int j = 0; j < gameBoard[i].length; j++){
                     System.out.print(gameBoard[i][j]);
                }
                System.out.println();
         }
    }
        private static void takeTurn(char currentPlayer){
            Random rand = new Random();
            int col = rand.nextInt(7);
            int row = 5;
            
            while(true){
                if(gameBoard[row][col]== 'b'){ ///empty spot, place in gameBoard
                    gameBoard[row][col] = currentPlayer;
                    break; // broke out of loop
                } else if(row == 0){ //checks to see if column is full
                    col = rand.nextInt(7); 
                } else { // goes to the next row 'up'
                    row--;
                }
            }
        }
        private static char playGame(char[][] gameBoard){
                //takeTurn('y');
                printBoard();
                int i = 10;
            while(i > 0){
                if(i%2 == 0){
                    takeTurn('y');
            } else{
                    takeTurn('r');
                
             i--;
                }
           }
            return 't';
            
        }
                    
}

