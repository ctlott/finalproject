import java.awt.*;
import java.awt.Mouselistener;
import java.util.*;

public class People implements MouseListener
{
    private int x, y, gradYear, hairColor, shirtColor, gender, ethnicity, glasses;
    //private picture;
    
    public People(int gY, int hC, int sC, int gen, int e, int gla, int posX, int posY){
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
    
    public void mouseClicked(MouseEvent e){
        
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    
}
