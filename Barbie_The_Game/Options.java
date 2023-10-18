import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends Button
{
    public void act()
    {
        checkMouse();
    }
    
    public Options()
    {
        GreenfootImage optionBtn = getImage();
        optionBtn.scale(optionBtn.getWidth()-50, optionBtn.getHeight()-50);
        setImage(optionBtn);
    }
}
