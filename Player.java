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
    private int num;
    
    public Player(People[][] myBoard, People mine, int number){
        board = myBoard;
        chosenOne = mine;
        num = number;
    }
        public People[][] getBoard(){
        return board;
    }
    public People getChosenOne(){
        return chosenOne;
    }
}
