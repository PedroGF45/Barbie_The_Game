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
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
    
    public Exit()
    {
        GreenfootImage exitBtn = getImage();
        Picture exit = new Picture(exitBtn, 10);
    }
}
