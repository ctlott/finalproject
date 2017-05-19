import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SwingSandbox {

    public static void main(People[][] board) throws IOException {
        JFrame frame = new JFrame();

        BufferedImage image = ImageIO.read(new File("Pics\\Phillip.jpg"));

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
        frame.pack();
        frame.setVisible(true);
    }
}