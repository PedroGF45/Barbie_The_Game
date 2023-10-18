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
    //private GreenfootSound soundtrack = new GreenfootSound("");
    
    public Menu()
    {    
        // Create a new world with 1080x720 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
    }
    
    private void prepare() {
        // Add the logo image to the center of the screen
        GreenfootImage logo = new GreenfootImage("../logo.png");
        Picture logoImg = new Picture(logo);
        addObject(logoImg, getWidth()/2, getHeight()/3);
        
        // Start the soundtrack
        
    }
}
