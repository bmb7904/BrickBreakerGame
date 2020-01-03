// This class draws the objects on the screen by extending a JPanel and painting
// onto the JPanel using the Graphics class

package bernardi;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class drawPanel extends JPanel 
{
    int pixelWidthPanel;
    int pixelHeightPanel;
    
    public Ball ball;
    
    // constructor that adds ball and sets the size
    // this is only called once and repaint is used
    public drawPanel(Ball ball, int w, int h)
    {
        this.ball = ball;
        this.pixelWidthPanel = w;
        this.pixelHeightPanel = h;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // creates graphics2D object to draw black thick lines outside
        Graphics2D g2 = (Graphics2D) g;
        
        // draws main game panel as white rectangle
        g.setColor(Color.white);
        g.fillRect(0, 0, pixelWidthPanel, pixelHeightPanel);
        
        // for now, the ball with colored with a randomly generated color
        g.setColor(Color.getHSBColor((float)(Math.random()), 1, 1));
        
        g.fillOval(ball.getXBall(), ball.getYBall(), ball.getBallRadius(), ball.getBallRadius());
        
        
        // this group of code draws the thick black borders lining the outside
        // of the game panel
        g2.setStroke(new BasicStroke (3));
        g2.setColor(Color.BLACK);
        g2.drawLine(0, pixelHeightPanel, pixelWidthPanel, pixelHeightPanel);
        g2.drawLine(0,0,pixelWidthPanel,0);
        g2.drawLine(0,0,0,pixelHeightPanel);
        g2.drawLine(pixelWidthPanel,0,pixelWidthPanel,pixelHeightPanel);
    }
    
    // allows the drawPanel class to have the newly updated ball with new coordinates
    public void addNewBall(Ball ball)
    {
        this.ball = ball;
    }
    
}
