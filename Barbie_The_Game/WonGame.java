import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WonGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WonGame extends World
{

    // Initialize score and time variables
    private Score score;
    private Time time;
    
    public WonGame(Score score, Time time)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        this.score = score;
        this.time = time;
        prepare();
    }
    
    private void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        GreenfootImage gameWin = new GreenfootImage("../gameWin.png");
        Picture gameWinImg = new Picture(gameWin, 5);
        addObject(gameWinImg, getWidth()/2, 250);
        
        // Add score
        addObject(score, getWidth()/2, 350);
        
        // Add time
        addObject(time, getWidth()/2, 450);
        
        // Add button to restart
        addObject(new Restart(), 300, 600);
        
        // Add button to exit
        addObject(new Exit(), 500, 600);
    }
}
