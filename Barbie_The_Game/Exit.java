import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    public void act()
    {
        checkMouse();
    }
    
    public Exit()
    {
        GreenfootImage exitBtn = getImage();
        exitBtn.scale(exitBtn.getWidth()-100, exitBtn.getHeight()-100);
        setImage(exitBtn);
    }
}
