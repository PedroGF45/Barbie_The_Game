import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class History extends World
{
    private Timer timer;
    private int textTimer;
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
        addObject(timer, 100, 50);
               
        BackgroundHistory history = new BackgroundHistory();
        addObject(history, getWidth()/2, getHeight()/2);
    }
    
    private void checkTime()
    {
        textTimer++;
        if (textTimer == 3600)
        {
           switchToGame(new Puzzle()); 
        }
    }
    
    public void switchToGame(World world)
    {
        Greenfoot.setWorld(world);
    }
}
