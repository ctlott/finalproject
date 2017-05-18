import java.awt.image.*;
import java.awt.Graphics.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Tester
{
    public static void main (String[] args) throws IOException {
        JFrame frame = new JFrame("Test");
//         
//         People test  = new People("Phillip", "Pics//Phillip.jpg", 2017, 3, 2, 1, 2, 2, 5, 5);
//         People test2 = new People("Jack", "Pics//Jack.jpg", 2018, 2, 3, 1, 2, 1, 173, 5);
//         People test3 = new People("Elizabeth", "Pics//Elizabeth.jpg", 2018, 4, 4, 2, 2, 2, 5, 228);
//         //People test4 = new People("Aayush", "Pics//Aayush.jpg", 2019, 1, 1, 1, 1, 1, 5, 451);
//         //People test5 = new People("Ed", "Pics//Ed.jpg", 2017, 2, 1, 1, 2, 2, 5, 674);
//         //People test3 = new People("Neha", "Pics//Neha.jpg", 2018, 1, 3, 2, 1, 1, 341, 5);
//         People test4 = new People("Justin", "Pics//Justin.jpg", 2019, 3, 3, 1, 2, 1, 509, 5);
//         People test5 = new People("Maggie", "Pics//Maggie.jpg", 2019, 2, 3, 2, 2, 2, 677, 5);
//         People test6 = new People("Alex", "Pics//Alex.jpg", 2018, 1, 3, 1, 2, 2, 845, 5);
//         

//         //final BufferedImage image  = ImageIO.read(new File(test.getFileName()));
//         final BufferedImage image2 = ImageIO.read(new File(test2.getFileName()));
//         final BufferedImage image3 = ImageIO.read(new File(test3.getFileName()));
//         final BufferedImage image4 = ImageIO.read(new File(test4.getFileName()));
//         final BufferedImage image5 = ImageIO.read(new File(test5.getFileName()));
//         final BufferedImage image6 = ImageIO.read(new File(test6.getFileName()));

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (People p: this.getBoard()){
                g.drawImage(p.getImage(), p.getXLocation, p.getYLocation, null);
            }
//                 g.drawImage(test.getImage(), 5, 5, null);
//                 g.drawImage(image2, 173, 5, null);
//                 g.drawImage(image3, 341, 5, null);
//                 g.drawImage(image4, 509, 5, null);
//                 g.drawImage(image5, 677, 5, null);
//                 g.drawImage(image6, 845, 5, null);
            }
        };


        frame.add(pane);
        
        //frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("Hello");
        
    }
}
