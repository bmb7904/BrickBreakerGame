
package bernardi;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class myFrame extends JFrame implements KeyListener
{
    // constructor 
    // creates JFrame and adds JPanel when constructor is called
    public myFrame(drawPanel panel, int panelWidth, int panelHeight)
    {
        this.setTitle("Brick Breaker               Author: Brett Bernardi");
        this.setLocation(0,0);
        
        // optimized by trial and error to make JFrame match JPanel
        this.setSize(panelWidth + 18,panelHeight + 41);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(panel);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
