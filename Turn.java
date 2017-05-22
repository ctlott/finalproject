import java.util.*;
import java.io.*;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turn
{
    Player currentplayer;
    People currentTarget;
    public static boolean guessedCorrectlyTurn = false;
    public static Scanner Keyboard = new Scanner(System.in);
    public Turn( Player currentplay, People targetPerson) throws IOException{
        currentTarget = targetPerson;
        currentplayer = currentplay;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(currentplayer + ", it is your turn!");
        
        Displayer.display(currentplayer.getBoard());
        this.questionAnswer();
        if(currentplayer.guessedRight() == false){
            this.remove();
        }
    }
    public void questionAnswer(){
        Question newQ = new Question(currentTarget);
        if (newQ.attribute == 7){
            if (newQ.getGuessedCorrectly() == true){
                currentplayer.setTrue();
                this.guessedCorrectlyTurn = true;
            }}
        if (newQ.getBoolean() == false)
            System.out.println("The answer to that question is NO");
        else
            System.out.println("The answer to that question is YES");
    }
    public void remove(){
        int x = -1;
        int y = -1;
        System.out.println("\nEnter the x and y location of the people you want to remove.");
        System.out.println("To reflip someone, enter the location again.");
        System.out.println("When you are done removing, enter 0.");
        while(x != 0){
            System.out.print("\nX location: ");
            x = Keyboard.nextInt();
            System.out.print("Y location: ");
            y = Keyboard.nextInt();
            
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
