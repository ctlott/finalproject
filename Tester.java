import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Tester
{
    public static void main (String[] args) throws IOException {
        JFrame frame = new JFrame("Test");
        
        People test = new People("Phillip", 2017, 3, 2, 1, 2, 2, 0, 0);
        

        final BufferedImage image = ImageIO.read(new File("Pics\\Alexa.jpg"));

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };


        frame.add(pane);
        
        //frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("Hello");
        
    }
}
