// class that has functions to move ball around the playing area

package bernardi;

public class moveBallClass 
{
    
    private int dx = 5;
    private int dy = 5;
    private Ball ball;
    int maxPixelWidth;
    int maxPixelHeight;
    int ballPixelRadius;
    private boolean xFlag = true;
    private boolean yFlag = true;
    
    public moveBallClass(Ball ball, int w, int h)
    {
        // the ball object is passed through the constructor and the same 
        // ball object is kept as a member. this same object is simply
        // updated everytime the moveBall is called
        this.ball = ball;
        this.maxPixelHeight = h;
        this.maxPixelWidth = w;
        this.ballPixelRadius = ball.getBallRadius();
        
        
    }
    
    public void moveBall()
    {
        checkAndUpdateFlags();
        
        if(xFlag == true)
        {
            ball.setXBall(ball.getXBall() + dx);
        }
        
        else
        {
            ball.setXBall(ball.getXBall() - dx);
        }
        
        if(yFlag == true)
        {
            ball.setYBall(ball.getYBall() + dy);
        }
        
        else
        {
            ball.setYBall(ball.getYBall() - dy);
        }
    }
    
    // this function will check whether or not the ball hits the side of a wall
    // if the XFlag is true -- it means the ball is moving in the positive x direction
    // so if xFlag == true AND coordinate of ball is >= maxWidth, ball bounces off wall
    // and starts moving in the negative x direction i.e. xFlag = false;
    // likewise for the y coordinates of the ball, only up/down
    private void checkAndUpdateFlags()
    {
        if((ball.getXBall() >= (maxPixelWidth - ballPixelRadius)) && xFlag == true)
        {
            xFlag = false;
        }
        
        if(ball.getXBall() <= 0 && xFlag == false)
        {
            xFlag = true;
        }
        
        // because ball coordinates are measured from top right of ball, and ball is
        // of radius wide, we must compensate. 
        if((ball.getYBall() >= (maxPixelHeight - ballPixelRadius))  && yFlag == true)
        {
            yFlag = false;
        }
        
        if(ball.getYBall() <= 0 && yFlag == false)
        {
            yFlag = true;
        }
    }
    
    
    
    
}
