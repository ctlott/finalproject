//imports
import java.util.*;
import java.io.*;

/**
 * The turn class controls each turn and uses the question class and takes the current player as a parameter
 */
public class Turn
{
    //creates necessary vars
    Player currentplayer;
    People currentTarget;
    public static boolean guessedCorrectlyTurn = false;
    public static Scanner Keyboard = new Scanner(System.in);
    /**
     * constructor
     * @param the current player, and the target person who the player needs to guess
     */
    public Turn( Player currentplay, People targetPerson) throws IOException{
        //sets all necessary variables
        currentTarget = targetPerson;
        currentplayer = currentplay;
        
        //creates a bunch of new lines so each player cannot see what the player before them did
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(currentplayer + ", it is your turn!");
        
        Displayer.main(currentplayer.getBoard());
        this.questionAnswer();
        
        //if the person guessed the person correctly they aren't prompted to remove players
        if(currentplayer.guessedRight() == false){
            this.remove();
        }
    }
    /**
     * lets the user know whether they guessed correctly YES or NO
     */
    public void questionAnswer(){
        //creates a new question
        Question newQ = new Question(currentTarget);
        //if they did the Guess Who option, if they are correct, then the variable guessedCorrectlyTurn is set to true
        if (newQ.attribute == 7){
            if (newQ.getGuessedCorrectly() == true){
                currentplayer.setTrue();
                this.guessedCorrectlyTurn = true;
            }}
        
        //lets the user know whether their guess was right or wrong
        if (newQ.getBoolean() == false)
            System.out.println("The answer to that question is NO");
        else
            System.out.println("The answer to that question is YES");
    }
    /**
     * removes the people from the display board or makes them re-display
     */
    public void remove(){
        int x = -1;
        int y = -1;
        //prompts the user
        System.out.println("\nEnter the x and y location of the people you want to remove.");
        System.out.println("To reflip someone, enter the location again.");
        System.out.println("When you are done removing, enter 0.");
        
        //continually asks which people to remove until the user enters 0
        while(x != 0){
            System.out.print("\nX location: ");
            x = Keyboard.nextInt();
            System.out.print("Y location: ");
            y = Keyboard.nextInt();
            
            //removes the person from the display or flips them back if they made a mistake
            if(x != 0 && y != 0){
                currentplayer.getBoard()[y-1][x-1].flip();
                if(currentplayer.getBoard()[y-1][x-1].getDisplayMe() == false){
                    System.out.println("Removed " + currentplayer.getBoard()[y-1][x-1].getName());
                }
                else{
                    System.out.println("Flipped " + currentplayer.getBoard()[y-1][x-1].getName() + " back over");
                }
            }
        }
    }
}
