import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class History extends World
{
    public static Timer timer;
    /**
     * Constructor for objects of class History.
     * 
     */
    public History()
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    public void act()
    {
        checkTime();
    }
    
    public void prepare()
    {
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        timer = new Timer();
        addObject(timer, 725, 775);
               
        BackgroundHistory history = new BackgroundHistory();
        addObject(history, getWidth()/2, getHeight()/2);
    }
    
    private void checkTime()
    {
        if (timer.getTimeInMinutes() == 1)
        {
           switchToGame(new Puzzle()); 
        }
        
        if (timer.getTimeInSeconds() == 600)
        {
            Start startGame = new Start();
            addObject(startGame, getWidth()/2, 650);
        }
    }     
    public void switchToGame(World world)
    {
        Greenfoot.setWorld(world);
    }
}
