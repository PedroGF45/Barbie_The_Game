import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked( new GreenfootSound("../start_game.mp3"));
    }
    
    public Start()
    {
        GreenfootImage startBtn = getImage();
        Picture startImg = new Picture(startBtn, 5);
    }
    
    public void checkClicked( GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Puzzle(((History)getWorld()).getTime()));
            sound.play();
        }
    }
}
