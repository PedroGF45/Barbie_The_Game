import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new GreenfootSound("../start_game.mp3"));
    }
    
    public Return()
    {
        GreenfootImage returnBtn = getImage();
        Picture returnImg = new Picture(returnBtn, 5);
    }
    
    private void checkClicked(GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(Menu.menu);
            sound.play();
        }
    }
}
