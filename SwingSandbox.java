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

public class SwingSandbox extends JPanel implements MouseListener {

    public static void main(People[][] board) throws IOException {
        JFrame frame = new JFrame("Guess Who('s back bitches)");
        frame.setSize(780, 710);

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                BufferedImage image= null;
                for (People[] p: board){
                    for (People pp: p){
                        try {
                        image  = ImageIO.read( new File( pp.getFileName() ) );
                    } catch (IOException e) {
                    }
                        g.drawImage(image, pp.getXLocation(), pp.getYLocation(), null);
                    }
                }
            }
        };


        frame.add(pane);
        
        //frame.getContentPane().add(test);
        //frame.pack();
        frame.setVisible(true);
    }
    
    public void mouseClicked(MouseEvent ee){
        int x = (int)ee.getLocationOnScreen().getX();
        int y = (int)ee.getLocationOnScreen().getY();
        People person = null;
        try {
                        person = Client.loopImages( x, y, Client.makeList() );
                    } catch (IOException e) {
                    }
        
        System.out.println( person );
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}