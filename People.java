
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class People extends JFrame
{
    private int x, y, gradYear, hairColor, shirtColor, gender, ethnicity, glasses;
    private String name;
    private JPanel mousepanel;
    private JLabel statusbar;
    //private picture;
    
    public People(){
    
    }
    
    public People(String n, int gY, int hC, int sC, int gen, int e, int gla, int posX, int posY){
        name = n;
        gradYear = gY;
        hairColor = hC;
        shirtColor = sC;
        gender = gen;
        ethnicity = e;
        glasses = gla;
        x = posX;
        y = posY;
        
    }
    
    
    public int getGradYear(){
        return this.gradYear;
    }
    public int getHairColor(){
        return this.hairColor;
    }
    public int getShirtColor(){
        return this.shirtColor;
    }
    public int getGender(){
        return this.gender;
    }
    public int getEthnicity(){
        return this.ethnicity;
    }
    public int getGlasses(){
        return this.glasses;
    }
    public String getName(){
        return this.name;
    }
    
    public void mouseClicked(MouseEvent e){
        
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    
}
