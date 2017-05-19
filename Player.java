import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Player
{
    public People[][] board;
    private People chosenOne;
    private int Playernum;
    Scanner Keyboard = new Scanner(System.in);
    
    public Player(People[][] myBoard, int number){
        board = myBoard;
        System.out.println("Enter the name of a person you want your opponent to guess: ");
        for (int r = 0; r < myBoard.length; r++){
            for (int c = 0; c < myBoard.length; c++){
                if (Keyboard.next() == myBoard[r][c].getName()){
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
        
    
}
