import javax.swing.*;

public class Tester
{
    public static void main (String[] args){
        JFrame frame = new JFrame("Test");
        
        People test = new People("Phillip", 2017, 3, 2, 1, 2, 2, 0, 0);
        frame.getContentPane().add(test);
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("Hello");
    }
}
