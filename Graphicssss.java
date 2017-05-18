import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;


public class Graphicssss extends JPanel
{
    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame("Test");
        JPanel pane = new JPanel(){
        protected void displayBoard(Graphics g, People[][] board){
            super.paintComponent(g);
            for (People[] p: board){
                for (People pp: p){
                    g.drawImage(pp.getImage(), pp.getXLocation(), pp.getYLocation(), null);
                }
            }
        }


    };
        frame.add(pane);
        
        //frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
    
    
    }

}