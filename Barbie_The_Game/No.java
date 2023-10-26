import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No extends Button
{
    /**
     * Act - do whatever the No wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        checkClicked( new GreenfootSound("../start_game.mp3"));
    }
    
    public No()
    {
        GreenfootImage noBtn = getImage();
        Picture noImg = new Picture(noBtn, 5);
    }
    
    public void checkClicked(GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            sound.play();
        }
    }
}