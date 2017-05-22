//imports
import java.util.*;

public class Player
{
    //creates the people board
    public People[][] board;
    //creates the person the user needs to guess
    private People chosenOne;
    //other vars
    public static boolean guessedCorrectlyPlayer;
    private int Playernum;
    Scanner Keyboard = new Scanner(System.in);
    
    /**
     * @param the board of people and their attributes, and the number of the current player
     */
    public Player(People[][] myBoard, int number){
        board = myBoard;
        guessedCorrectlyPlayer = false;
        System.out.print("Enter the name of a person you want your opponent to guess: ");
        String choosen = Keyboard.next();
        for (int r = 0; r < myBoard.length; r++){
            for (int c = 0; c < myBoard[0].length; c++){
                if (choosen.equalsIgnoreCase( myBoard[r][c].getName())){
                    chosenOne = myBoard[r][c];
                }
            }
        }
        Playernum = number;
      
    }
    /**
     * returns the board of people and their attributes
     */
    public People[][] getBoard(){
        return board;
    }
    /**
     * returns the person the user needs to guess
     */
    public People getChosenOne(){
        return chosenOne;
    }
    /**
     * returns the number of the current player
     */
    public int getPlayerNum(){
        return Playernum;
    }
    /**
     * returns whether the user guessed correctly
     */
    public boolean guessedRight(){
        return guessedCorrectlyPlayer;
    }
    /**
     * if the user guesses the chosen one, this method is called
     */
    public void setTrue(){
        guessedCorrectlyPlayer = true;
    }
    /**
     * returns the current player number
     */
    public String toString(){
        return (" " + Playernum + " ");
    }
}
