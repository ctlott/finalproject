import java.awt.image.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Client extends JPanel implements MouseListener
{
    public static void main (String[] args) throws IOException {
        Player[] players = new Player[2];
        
        players[0] = new Player(makeList(), 1);
        players[1] = new Player(makeList(), 2);
        
        Turn thing = null;
        Player current = players[0];
        Player other = players[1];
        
        while( !players[0].guessedCorrectly() && !players[1].guessedCorrectly() ){
            thing = new Turn( current, other.getChosenOne() );
            
            if(current == players[0]){
                current = players[1];
                other = players[0];
            }
            else{
                current = players[0];
                other = players[1];
            }
        }
        
    }
    
    //name, gradYear, hairColor, shirtColor, gender, ethnicity, glasses, posX, posY
    public static People[][] makeList() throws IOException{
        People[][] board = new People[4][6];
        board[0][0] = new People("Phillip", "Pics//Phillip.jpg", 2017, 3, 2, 1, 2, 2, 5, 5);
        board[0][1] = new People("Jack", "Pics//Jack.jpg", 2018, 2, 3, 1, 2, 1, 134, 5);
        board[0][2] = new People("Neha", "Pics//Neha.jpg", 2018, 1, 3, 2, 1, 1, 263, 5);
        board[0][3] = new People("Justin", "Pics//Justin.jpg", 2019, 3, 3, 1, 2, 1, 392, 5);
        board[0][4] = new People("Maggie", "Pics//Maggie.jpg", 2019, 2, 3, 2, 2, 2, 521, 5);
        board[0][5] = new People("Alex", "Pics//Alex.jpg", 2018, 1, 3, 1, 2, 2, 650, 5);
        board[1][0] = new People("Elizabeth", "Pics//Elizabeth.jpg", 2018, 4, 4, 2, 2, 2, 5, 176);
        board[1][1] = new People("David", "Pics//David.jpg", 2017, 4, 2, 1, 2, 2, 134, 176);
        board[1][2] = new People("Jeevan", "Pics//Jeevan.jpg", 2017, 1, 1, 1, 1, 1, 263, 176);
        board[1][3] = new People("Claire", "Pics//Claire.jpg", 2018, 1, 5, 2, 1, 1, 392, 176);
        board[1][4] = new People("Alexa", "Pics//Alexa.jpg", 2019, 2, 4, 2, 2, 2, 521, 176);
        board[1][5] = new People("Caroline", "Pics//Caroline.jpg", 2018, 3, 5, 2, 2, 2, 650, 176);
        board[2][0] = new People("Aayush", "Pics//Aayush.jpg", 2019, 1, 1, 1, 1, 1, 5, 347);
        board[2][1] = new People("Jim", "Pics//Jim.jpg", 2019, 4, 1, 1, 2, 2, 134, 347);
        board[2][2] = new People("Justas", "Pics//Justas.jpg", 2019, 1, 4, 1, 2, 1, 263, 347);
        board[2][3] = new People("Griffin", "Pics//Griffin.jpg", 2018, 2, 3, 1, 2, 2, 392, 347);
        board[2][4] = new People("Hayden", "Pics//Hayden.jpg", 2017, 3, 5, 1, 2, 2, 521, 347);
        board[2][5] = new People("Ham", "Pics//Ham.jpg", 2017, 1, 5, 1, 1, 2, 650, 347);
        board[3][0] = new People("Ed", "Pics//Ed.jpg", 2017, 2, 1, 1, 2, 2, 5, 518);
        board[3][1] = new People("Nick", "Pics//Nick.jpg", 2017, 2, 4, 1, 2, 2, 134, 518);
        board[3][2] = new People("Abhishek", "Pics//Abhishek.jpg", 2019, 1, 4, 1, 1, 1, 263, 518);
        board[3][3] = new People("Tanner", "Pics//Tanner.jpg", 2018, 2, 1, 1, 2, 2, 392, 518);
        board[3][4] = new People("Sam", "Pics//Sam.jpg", 2018, 3, 1, 1, 2, 2, 521, 518);
        board[3][5] = new People("Emile", "Pics//Emile.jpg", 2019, 2, 1, 1, 2, 2, 650, 518);
        return board;
    }
    
    public static People loopImages(int x, int y, People[][] board){
        for(int i = 0; i < board.length; i++){
            if(board[i][0].getYLocation() >= y && board[i][0].getYLocation() + board[i][0].getLength() <= y){
                for(int j = 0; j < board[i].length; j++){
                    if(board[i][j].getXLocation() >= x && board[i][j].getXLocation() + board[i][0].getWidth() <= x){
                        return board[i][j];
                    }
                }
            }
        }
        return null;
    }
    
    public void mouseClicked(MouseEvent e){
        int x = (int)e.getLocationOnScreen().getX();
        int y = (int)e.getLocationOnScreen().getY();
    }
    
    //     public static void display(People[][] board) throws IOException {
    //         JFrame frame = new JFrame("Test");
    //         JPanel pane = new JPanel(){
    //         protected void displayBoard(Graphics g) throws IOException {
    //             super.paintComponent(g);
    //             for (People[] p: board){
    //                 for (People pp: p){
    //                     try {
    //                         BufferedImage image  = ImageIO.read( new File( pp.getFileName() ) );
    //                     } catch (IOException e) {
    //                     }
    //     
    //                     g.drawImage(image, pp.getXLocation(), pp.getYLocation(), null);
    //                 }
    //             }
    //         }
    //         };
    //         frame.add(pane);
    //         
    //         frame.pack();
    //         frame.setVisible(true);
    //     }
        
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}
