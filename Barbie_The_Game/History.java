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
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        time = new Time();
        addObject(time, 725, 775);
        
        // Add history text
        BackgroundHistory history = new BackgroundHistory();
        addObject(history, getWidth()/2, getHeight()/2);
    }
    
    // Method to add ability to player to skip text or automatically skip text after 1 minute
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
    
    // Get current time
    public Time getTime()
    {
        return time;
    }
    
    // Switch to next world
    public void switchToGame(World world)
    {
        Greenfoot.setWorld(world);
    }
}
