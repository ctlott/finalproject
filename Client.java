import TurtleGraphics.*;
import java.awt.Color;
import java.util.*;

public class Client
{
    public static void main (String[] args){
        Player[] players = new Player[2];
        
        System.out.println("Player 1! Choose whom you would like Player 2 to guess.");
        
        
        players[0] = new Player(makeList(), null, 
    }
    
    
    static People[][] makeList(){
        People[][] board = new People[4][6];
        board[0][0] = new People(
        board[0][1] = new People(
        board[0][2] = new People(
        board[0][3] = new People(
        board[0][4] = new People(
        board[0][5] = new People(
        board[1][0] = new People(
        board[1][1] = new People(
        board[1][2] = new People(
        board[1][3] = new People(
        board[1][4] = new People(
        board[1][5] = new People(
        board[2][0] = new People(
        board[2][1] = new People(
        board[2][2] = new People(
        board[2][3] = new People(
        board[2][4] = new People(
        board[2][5] = new People(
        board[3][0] = new People(
        board[3][1] = new People(
        board[3][2] = new People(
        board[3][3] = new People(
        board[3][4] = new People(
        board[3][5] = new People(
        return board;
    }
}
