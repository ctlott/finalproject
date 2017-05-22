import java.util.*;

public class Player
{
    public People[][] board;
    private People chosenOne;
    public static boolean guessedCorrectlyPlayer;
    private int Playernum;
    Scanner Keyboard = new Scanner(System.in);
    
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
    public People[][] getBoard(){
        return board;
    }
    public People getChosenOne(){
        return chosenOne;
    }
    public int getPlayerNum(){
        return Playernum;
    }
    public boolean guessedRight(){
        return guessedCorrectlyPlayer;
    }
    public void setTrue(){
        guessedCorrectlyPlayer = true;
    }
    public String toString(){
        return (" " + Playernum + " ");
    }
}
