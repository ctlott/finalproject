import java.util.*;

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
    public Turn( Player currentplay, People targetPerson){
        currentTarget = targetPerson;
        currentplayer = currentplay;
        System.out.println(currentplayer + ", it is your turn!");
        
        this.questionAnswer();
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
        System.out.println("Enter the x and y location of the people you want to remove.");
        System.out.println("When you are done removing, enter -1.");
        while(x != -1){
            System.out.println("X location: ");
            x = Keyboard.nextInt();
            System.out.println("Y location: ");
            y = Keyboard.nextInt();
        }
    }
}
