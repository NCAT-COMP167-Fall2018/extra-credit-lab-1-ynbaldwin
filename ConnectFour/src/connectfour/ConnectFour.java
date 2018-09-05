/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

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
}
