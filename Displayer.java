//imports

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Displayer extends JPanel {

    public static void main(People[][] board) throws IOException {
        //creates window for frame
        JFrame frame = new JFrame("Guess Who!!");
        //sets the frame size
        frame.setSize(780, 710);
        
        //creates the panel to paint the components
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                //paints the graphics
                super.paintComponent(g);
                
                //creates a null image to fill later
                BufferedImage image= null;
                
                //displays all the objects on the board
                for (People[] p: board){
                    for (People pp: p){
                        if(pp.getDisplayMe() == true){ 
                            //catches exception
                            try {
                                image  = ImageIO.read( new File( pp.getFileName() ) );
                            } catch (IOException e) {}
                            
                            //displays image
                            g.drawImage(image, pp.getXLocation(), pp.getYLocation(), null);
                        }
                    }
                }
            }
        };

        //sets up JFrame to display board
        frame.add(pane);
        frame.setVisible(true);
    }//end of main
    
}//end of class