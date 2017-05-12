
import java.awt.Color;
import java.util.*;

public class Client
{
    public static void main (String[] args){
        Player[] players = new Player[2];
        
        System.out.println("Player 1! Choose whom you would like Player 2 to guess.");
        
    }
    
    //name, gradYear, hairColor, shirtColor, gender, ethnicity, glasses, posX, posY
    public static People[][] makeList(){
        People[][] board = new People[4][6];
        board[0][0] = new People("Phillip", 2017, 3, 2, 1, 2, 2, 0, 0);
        board[0][1] = new People("Jack", 2018, 2, 3, 1, 2, 1, 0, 1);
        board[0][2] = new People("Neha", 2018, 1, 3, 2, 1, 1, 0, 2);
        board[0][3] = new People("Justin", 2019, 3, 3, 1, 2, 1, 0, 3);
        board[0][4] = new People("Maggie", 2019, 2, 3, 2, 2, 2, 0, 4);
        board[0][5] = new People("Alex", 2018, 1, 3, 1, 2, 2, 0, 5);
        board[1][0] = new People("Elizabeth", 2018, 4, 4, 2, 2, 2, 1, 0);
        board[1][1] = new People("David", 2017, 4, 2, 1, 2, 2, 1, 1);
        board[1][2] = new People("Jeevan", 2017, 1, 1, 1, 1, 1, 1, 2);
        board[1][3] = new People("Claire", 2018, 1, 5, 2, 1, 1, 1, 3);
        board[1][4] = new People("Alexa", 2019, 2, 4, 2, 2, 2, 1, 4);
        board[1][5] = new People("Caroline", 2018, 3, 5, 2, 2, 2, 1, 5);
        board[2][0] = new People("Aayush", 2019, 1, 1, 1, 1, 1, 2, 0);
        board[2][1] = new People("Jim", 2019, 4, 1, 1, 2, 2, 2, 1);
        board[2][2] = new People("Justas", 2019, 1, 4, 1, 2, 1, 2, 2);
        board[2][3] = new People("Griffin", 2018, 2, 3, 1, 2, 2, 2, 3);
        board[2][4] = new People("Hayden", 2017, 3, 5, 1, 2, 2, 2, 4);
        board[2][5] = new People("Ham", 2017, 1, 5, 1, 1, 2, 2, 5);
        board[3][0] = new People("Ed", 2017, 2, 1, 1, 2, 2, 3, 0);
        board[3][1] = new People("Nick", 2017, 2, 4, 1, 2, 2, 3, 1);
        board[3][2] = new People("Abhishek", 2019, 1, 4, 1, 1, 1, 3, 2);
        board[3][3] = new People("Tanner", 2018, 2, 1, 1, 2, 2, 3, 3);
        board[3][4] = new People("Sam", 2018, 3, 1, 1, 2, 2, 3, 4);
        board[3][5] = new People("Emile", 2019, 2, 1, 1, 2, 2, 3, 5);
        return board;
    }
}
