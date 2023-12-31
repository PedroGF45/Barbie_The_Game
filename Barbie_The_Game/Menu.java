import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    // Add a soundtrack in the menu
    public static GreenfootSound soundtrack = new GreenfootSound("sounds/intro.mp3");
    
    // Constructor
    public Menu()
    {    
        // Create a new world with 1080x720 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        // Prepares the world before hitting Run/Act
        prepare();
    }
    
    private void prepare() 
    {
        // Add the logo image to the center of the screen
        Logo logoImg = new Logo();
        addObject(logoImg, getWidth()/2, getHeight()/3);    
        
        // Add the play button as image
        Play playImg = new Play();
        addObject(playImg, getWidth()/2, 475); 
        
        // Add the options button as image
        Options optionsImg = new Options();
        addObject(optionsImg, getWidth()/2, 575);
        
        // Add the exit button as image
        Exit exitImg = new Exit();
        addObject(exitImg, getWidth()/2, 675);
        
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        soundtrack.setVolume(20);
    }
         
    public void started()
    {
        soundtrack.playLoop();
    }
    
    // Stop the soundtrack when the game is stopped
    public void stopped()
    {
        soundtrack.stop();
    }
    
    public void paused()
    {
        soundtrack.stop();
    }
    
    // Switch to a different world
    public void switchWorld(World world)
    {
        Greenfoot.setWorld(world);
    }
}
