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
        checkClicked(new GreenfootSound("../start_game.mp3"));
    }
    
    public Exit()
    {
        GreenfootImage exitBtn = getImage();
        Picture exit = new Picture(exitBtn, 10);
    }
    
    private void checkClicked(GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Menu.soundtrack.stop();
            Greenfoot.stop();
        }
    }
}
