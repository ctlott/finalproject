import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;


public class Graphics
{
    public static void main(String[] args) throws IOException{
        JFrame frame = new JFrame("Test");
        JPanel pane = new JPanel(){
        @Override
        protected void displayBoard(Graphics g){
            super.paintComponent(g);
            for (People p: this.getBoard()){
                g.drawImage(p.getImage(), p.getXLocation, p.getYLocation, null);
            }
        }


    };
        frame.add(pane);
        
        //frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
    
    
    }

}
