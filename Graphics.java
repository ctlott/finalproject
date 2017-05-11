import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics extends JFrame
{
    private JPanel mousepanel;
    private JLabel statusbar;
    
    public Graphics(){
        super("title");
        
        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);
        
        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);
        
        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
        
    }

}
