import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LostGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LostGame extends World
{

    /**
     * Constructor for objects of class LostGame.
     * 
     */
    public LostGame(World world, Score score, Time time)
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare(world, time, score);
    }
    
    private void prepare(World world, Time time, Score score)
    {
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        GreenfootImage gameOver = new GreenfootImage("../gameOver.png");
        Picture gameOverImg = new Picture(gameOver, 5);
        addObject(gameOverImg, getWidth()/2, 250);
        
        addObject(new RestartLevel(), getWidth()/2, 450);
        
        addObject(new No(), 500, 600);
        addObject(new Yes(world, time, score), 300, 600);
        
        GreenfootSound defeat = new GreenfootSound("sounds/defeat.mp3");
        defeat.setVolume(50);
        defeat.play();
    }
}
