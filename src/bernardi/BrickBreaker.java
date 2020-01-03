/*

   ** First Rough Draft of Brick Breaker**
    
*Got the ball to move around and bounce off of walls according to my physics system
* Need to eventually add paddle and bricks
* Also need to incorporate keylistener to the JFrame to get user input controls

Jan 2 2020

Programmer and Author: Brett Bernardi


*/
package bernardi;


public class BrickBreaker 
{
    // global variable that controls the width of the game panel
    final public static int WIDTH = 1200;
    // global variable that controls the height of the game panel
    final public static int HEIGHT = 650;
    // global variable that controls the size of the ball throughout entire program
    final public static int BALLPIXELRADIUS = 50;
    
    
    // pauses the program for the specified number of milliseconds in the parameter
    public static void pause(int ms) 
    {
    try 
    {
        Thread.sleep(ms);
    } catch (InterruptedException e) 
    {
        System.err.format("IOException: %s%n", e);
    }
    }
    
    // because java passes objects by reference, there is only one ball object 
    // created throughout the entire program. The same ball object just keeps
    // getting updated.
    public static void main(String[] args) 
    {
        // creates ball object
        // this ball object is passed around by reference, as is the default in java
        // this means the same exact object is being passes, not copies
        // equivalent to &Ball in C++
        Ball mainBall = new Ball(BALLPIXELRADIUS);
        // adds the initial ball with initial coordinates to the panel
        // and draws the first frame of the game
        drawPanel panel = new drawPanel(mainBall, WIDTH, HEIGHT);
        
        // creates object of MyFrame class, which is an extended JFrame
        myFrame frame = new myFrame(panel, WIDTH, HEIGHT);
        // creates object of moveBallClass, which has functions to move the ball
        moveBallClass move = new moveBallClass(mainBall, WIDTH, HEIGHT);
        
        // main game loop
        while(true)
        {
            
            // updates the coordinates of the ball by moving it
            move.moveBall();
            // adds the balls new coordinates to the drawPanel class, with a 
            // function I created. This is then drawn on screen
            panel.addNewBall(mainBall);
            // repaints the panel with updated ball information
            panel.repaint();
            pause(18);
        }

        
       
    }
    
}
