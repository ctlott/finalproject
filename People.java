//imports
import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;


public class People extends JPanel 
{
    //creates variables for each person
    private int x, y, gradYear, hairColor, shirtColor, gender, ethnicity, glasses;
    public boolean displayMe;
    public String name, fileName;
    public BufferedImage image;
    
    //length and width of each image
    public static int length = 124, width =166;

    
    /**
     * 
     */
    public People(String n, String file, int gY, int hC, int sC, int gen, int e, int gla, int posX, int posY) throws IOException {
        //set variables
        this.name = n;
        this.gradYear = gY;
        this.hairColor = hC;
        this.shirtColor = sC;
        this.gender = gen;
        this.ethnicity = e;
        this.glasses = gla;
        this.x = posX;
        this.y = posY;
        this.fileName = file;
        this.displayMe = true;
        
        //creates and sets new image
        image  = ImageIO.read( new File(file) );
        setBackground(Color.WHITE);
    }
    /**
     * 
     */
    private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
        return frame;
    }
    /**
     * 
     */
    public int getGradYear(){
        return this.gradYear;
    }
    /**
     * 
     */
    public int getHairColor(){
        return this.hairColor;
    }
    /**
     * 
     */
    public int getShirtColor(){
        return this.shirtColor;
    }
    /**
     * 
     */
    public int getGender(){
        return this.gender;
    }
    /**
     * 
     */
    public int getEthnicity(){
        return this.ethnicity;
    }
    public int getGlasses(){
        return this.glasses;
    }
    /**
     * 
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     */
    public String getFileName(){
        return this.fileName;
    }
    /**
     * 
     */
    public int getXLocation(){
        return x;
    }
    /**
     * 
     */
    public int getYLocation(){
        return y;
    }
    /**
     * 
     */
    public BufferedImage getImage(){
        return this.image;
    }
    /**
     * 
     */
    public int getLength(){
        return length;
    }
    /**
     * 
     */
    public int getWidth(){
        return width;
    }
    /**
     * 
     */
    public boolean getDisplayMe(){
        return displayMe;
    }
    /**
     * 
     */
    public void noDisplay(){
        displayMe = false;
    }
    /**
     * 
     */
    public String toString(){
        return this.name;
    }
    
}