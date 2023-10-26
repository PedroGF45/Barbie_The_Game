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
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        GreenfootImage gameWin = new GreenfootImage("../gameWin.png");
        Picture gameWinImg = new Picture(gameWin, 1);
        addObject(gameWinImg, getWidth()/2, 150);
        
        addObject(score, getWidth()/2, 250);
        
        addObject(time, getWidth()/2, 300);
        
        Return restart = new Return();
        restart.setImage(new GreenfootImage("../restart.png"));
        addObject(restart, 500, 450);
        addObject(new Exit(), 100, 400);
    }
}
