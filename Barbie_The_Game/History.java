import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class History extends World
{
    private Time time;
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
    
    private void prepare()
    {
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        time = new Time();
        addObject(time, 725, 775);
               
        BackgroundHistory history = new BackgroundHistory();
        addObject(history, getWidth()/2, getHeight()/2);
    }
    
    private void checkTime()
    {
        if (time.getTimeInMinutes() == 1)
        {
           switchToGame(new Puzzle(time)); 
        }
        
        if (time.getTimeInSeconds() == 600)
        {
            Start startGame = new Start();
            addObject(startGame, getWidth()/2, 650);
        }
    }   
    
    public Time getTime()
    {
        return time;
    }
    
    public void switchToGame(World world)
    {
        Greenfoot.setWorld(world);
    }
}
