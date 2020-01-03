// This class creates Ball objects that hold a Ball's x and y coordinates as well
// as the balls radius

package bernardi;

public class Ball
{
    // initial x position
    private int xComp;
    // initial y position
    private int yComp;
    
    int ballRadius;
    
    // constructor called when creating the ball
    // this is only called once, to initialize the ball and the initial position
    public Ball(int radius)
    {
        this.xComp = 300;
        this.yComp = 200;
        this.ballRadius = radius;
    }
    
    public int getXBall()
    {
        return xComp;
    }
    
    public int getYBall()
    {
        return yComp;
        
    }
    
    public void setXBall(int x)
    {
        this.xComp = x;
    }
    
    public void setYBall(int y)
    {
        this.yComp = y;
    }
    
    public int getBallRadius()
    {
        return ballRadius;
    }
}
