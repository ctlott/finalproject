public class Player
{
    private People[][] board;
    private People chosenOne;
    private int num;
    
    public Player(People[][] myBoard, People mine, int number){
        board = myBoard;
        chosenOne = mine;
        num = number;
    }
    
    public People getChosenOne(){
        return chosenOne;
    }
}
