

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turn
{
    int currentplayer = 0;
    public People[][] PeopleArray;
    People currentTarget;
    People whoTheyNeedToGuess1;
    People whoTheyNeedToGuess2;
    public Turn(Player player1, Player player2, People guess1, People guess2, People[][] peep){
        PeopleArray = peep;
        currentplayer = 1;
        whoTheyNeedToGuess1 = guess1;
        whoTheyNeedToGuess2 = guess2;
        System.out.println("Player " + currentplayer + ", it is your turn.");
        currentTarget = this.getCurrentTargetPerson();
        Question newQ = new Question(currentTarget);
    }
    public void switchPlayer(int currentplayer){
        if (currentplayer == 1)
            currentplayer = 2;
        else
            currentplayer = 1;
    }
    public People getCurrentTargetPerson(){
        if (currentplayer == 1)
            return whoTheyNeedToGuess1;
        else
            return whoTheyNeedToGuess2;
    }

}
