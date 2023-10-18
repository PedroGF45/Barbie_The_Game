import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    
    // Add a soundtrack in the menu
    private GreenfootSound soundtrack = new GreenfootSound("../sound.mp3");
    
    public Menu()
    {    
        // Create a new world with 1080x720 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        // Prepares the world before hitting Run/Act
        prepare();
    }
    
    private void prepare() 
    {
        // Add the logo image to the center of the screen
        GreenfootImage logo = new GreenfootImage("../logo.png");
        Picture logoImg = new Picture(logo);
        addObject(logoImg, getWidth()/2, getHeight()/3);    
    }
    
    // Do something when the user clicks Run/Act
    public void started()
    {
        soundtrack.play();
    }
    
    // Do somethin when the user clicks Reset or stops the game
    public void stopped()
    {
        soundtrack.stop();
    }
}
